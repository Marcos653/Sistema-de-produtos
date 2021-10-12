/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Menu {
    List<Produtos> produtos1 = new ArrayList();
    List<Vendas> vendas1 = new ArrayList();
    Vendas venda = new Vendas();
    Scanner sc = new Scanner(System.in);
 

    public void incluirProdutos(){
        boolean next = false;
        int cod;
        double valor;
        int quant;

                System.out.println("----Add produto----");
                System.out.println("Aperte \"enter\" ");
                sc.nextLine();

                System.out.println("Digite o nome do produto");
                String nome = sc.nextLine();

                System.out.println("Digite o codigo");
                cod = sc.nextInt(); 
                
                System.out.println("Digite o valor do produto");
                valor = sc.nextDouble();

                System.out.println("Digite a quantidade em estoque");
                quant = sc.nextInt();
                sc.nextLine();

                produtos1.add(new Produtos(cod, nome, valor, quant));
 
        

        
    }
     

    public void consultarProdutos(){
        System.out.println("----Consultar produto----");
        System.out.println("Por favor, informe o nome do produto que deseja procurar");
        String nomeP = sc.nextLine();
        
        
        for(Produtos produtos : produtos1){
            if(produtos.getNome().equals(nomeP)){
                System.out.println(produtos.toString());
            }

        }
    }
    

    public void listagemProdutos(){
        System.out.println("----Listagem de produtos----");
        
        for (int i=0; i< produtos1.size(); i++){
            System.out.println(produtos1.get(i));
        }
        
        double valorMax = 0, valorMin = 999999999, valorTotal = 0;
        
        for (Produtos produtos : produtos1) {
            valorTotal = valorTotal + produtos.getValor();
            
            if(produtos.getValor() > valorMax){
                valorMax = produtos.getValor();
            }
            if(produtos.getValor() < valorMin){
                valorMin = produtos.getValor();
            }
        }
        System.out.println("Valor medio = " + valorTotal / produtos1.size());
        System.out.println("Valor maximo = " + valorMax);
        System.out.println("Valor minimo = "+ valorMin);        
        
        
    }
    

    public void vendasProduto(){
        
        int codigo;
        String date;
        DateFormat data;
        
        System.out.println("Digite o codigo do produto: ");
        codigo = sc.nextInt();
        
        for(Produtos produtos: produtos1){
            sc.nextLine();
            if(codigo == produtos.getCodigo()){
                System.out.println("Produto encontrado!!");
                System.out.println("Nome do produto: " + produtos.getNome()); 

                try{
                    System.out.println("Digite a data da venda: ");
                    date = sc.nextLine();
                    data = new SimpleDateFormat("dd/MM/yyyy");
                    Date da = data.parse(date);
                    venda.dateArray.add(date);
                    venda.setDatas(date);
                    
                }catch (ParseException ex){
                    ex.printStackTrace();
                }
                System.out.println("Quantidade que venderá: ");
                venda.setQuant(sc.nextInt());
                        if(produtos.getQuantEstoque() >= venda.getQuant()){       
                            produtos.setQuantEstoque(produtos.getQuantEstoque() - venda.getQuant());
                            vendas1.add(new Vendas(venda.getDatas(), produtos.getNome(), venda.getQuant(), produtos.getValor(), produtos.getValor() * venda.getQuant()));
                            System.out.println(vendas1.toString());
                        }else{
                            System.out.println("Operação realizada com sucesso! ");
                }
            }
        }
        

           
    }
    

    public void relatorioPeriodo() throws ParseException{  
        double valorMedio = 0;
        double valorMax = 0;
        String dataI, dataF;
        
               
                    
                    System.out.println("****Relatorio de Vendas - DETALHADO****");
                    System.out.println("****************************************");

                    System.out.println("Informe o periodo de emissao");
                    System.out.println("-----------------------------");
                    sc.nextLine();                    
                    
                    System.out.println("Digite a data inicial: ");
                    dataI = sc.nextLine();
                    sc.nextLine();
                    
                    System.out.println("Digite a data final: ");
                    dataF = sc.nextLine(); 
                    
                    System.out.println("Periodo de emissão: " + dataI + " a " + dataF);
                    
                    venda.dateArray.sort((d1,d2) -> d1.compareTo(d2));
                    System.out.println(venda.dateArray);

                    
                    if(venda.dateArray.contains(dataI) || venda.dateArray.contains(dataF) ){
                        for(Vendas vendas: vendas1){
                            
                            if(venda.dateArray.contains(dataI)){
                                        System.out.println("-----------------------------------------");
                                        System.out.println("Data: " + vendas.getDatas());
                                        System.out.println("Produto: " + vendas.getNomeProduto());
                                        System.out.println("Quantidade vendida: " + vendas.getQuant());
                                        System.out.println("Valor unitario: R$ " + vendas.getValorUnitario());
                                        System.out.println("Valor total: R$ " + vendas.getValortotal());
                                        System.out.println("------------------------------------------");                                 
                            }
                        }
                    }else{
                        System.out.println("Não há dados para emissao do relatorio" );
                    }
                        
                    
                    
 


    }
}

