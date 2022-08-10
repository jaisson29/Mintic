package com.reto_5.model.vo;

public class ComprasDeLiderVo {
    private String lider;
    private Double valor;
    
    //CONSULOTRES
    //GETTERS
    public String getLider() {
        return lider;
    }
    public Double getValor() {
        return valor;
    }
    
    //MODIFICADORES
    //SETTERS
    public void setLider(String lider) {
        this.lider = lider;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    

    @Override
    public String toString() {
        return String.format("%-25s %,15.1f", lider, valor);
    }
}
