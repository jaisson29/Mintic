package com.reto_4.model.vo;

public class DeudasPorProyectoVo {
    // TODO implementar la clase
    private Integer id;
    private Double valor;
    
    //CONSULTORES
    //GETTERS
    public Integer getId() {
        return id;
    }
    public Double getValor() {
        return valor;
    }

    //MODIFICADORES
    //SETTERS
    public void setId(Integer id) {
        this.id = id;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%3d %,15.1f", id, valor);
    }
}
