/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Marcos
 */
public class Produtos {
    private int codigo;
    private String nome;
    private double valor;
    private int quantEstoque;

    public Produtos(int codigo, String nome, double valor, int quantEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantEstoque = quantEstoque;
    }

    public Produtos() {
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    
    

    @Override
    public String toString() {
        return "Produtos{" + "codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", quantEstoque=" + quantEstoque + '}';
    }
    
    
}
