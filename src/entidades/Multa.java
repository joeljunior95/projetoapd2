/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Joel
 */
public class Multa {
    private double valor;
    private double juros;
    private Date dataInicio;
    private Devolucao devolucao;
    
    protected Multa(double v, double j, Date dt, Devolucao dev){
        valor = v;
        juros= j;
        dataInicio = dt;
        devolucao = dev;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @return the juros
     */
    public double getJuros() {
        return juros;
    }

    /**
     * @return the dataInicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * @return the devolucao
     */
    public Devolucao getDevolucao() {
        return devolucao;
    }
    
    private Boleto gerarBoleto() {
        
    }
}
