/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class Vendas{
    List<String> dateArray = new ArrayList<String>();
    private String datas;
    private String nomeProduto;
    private int quant;
    private double valorUnitario;
    private double Valortotal;

    public Vendas() {
    }
    
    

    public Vendas(String datas, String nomeProduto, int quant, double valorUnitario, double Valortotal) {
        this.datas = datas;
        this.nomeProduto = nomeProduto;
        this.quant = quant;
        this.valorUnitario = valorUnitario;
        this.Valortotal = Valortotal;
    }
    
    

    public List<String> getDateArray() {
        return dateArray;
    }

    public void setDateArray(List<String> dateArray) {
        this.dateArray = dateArray;
    }

    public String getDatas() {
        return datas;
    }

    public void setDatas(String datas) {
        this.datas = datas;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValortotal() {
        return Valortotal;
    }

    public void setValortotal(double Valortotal) {
        this.Valortotal = Valortotal;
    }

    @Override
    public String toString() {
        return "Vendas{" + "datas=" + datas + ", nomeProduto=" + nomeProduto + ", quant=" + quant + ", valorUnitario=" + valorUnitario + ", Valortotal=" + Valortotal + '}';
    }

    
    
}
