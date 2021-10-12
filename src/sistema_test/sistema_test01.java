package sistema_test;

import java.text.ParseException;
import java.util.Scanner;
import modelos.Menu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos
 */
public class sistema_test01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        int opcion;
        
        do{
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - incluir produto");
            System.out.println("2 - Consultar produtos");
            System.out.println("3 - Listagem de produtos");
            System.out.println("4 - Vendas por periodo - detalhado");
            System.out.println("5 - Realizar venda");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcion = sc.nextInt();   
            
            
            switch(opcion){
                case 0:
                    opcion = 0;
                    break;
                    
                case 1:
                    menu.incluirProdutos();
                    break;
                    
                case 2:
                    menu.consultarProdutos();
                    break;
                    
                case 3: 
                    menu.listagemProdutos();
                    break;
                    
                case 4:
                    menu.relatorioPeriodo();
                    break;
                
                case 5:
                    menu.vendasProduto();
                    break;
                    
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while(opcion != 0);
    }
    
}
