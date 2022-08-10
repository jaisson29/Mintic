package com.fabrica_aviones;

public class Avion {
    //ATRIBUTOS
    private String color;
    private double tamanio;

    //CONSTRUCTOR
    public Avion(String color, double tamanio){
        this.color = color;
        this.tamanio = tamanio;
    }

    //CONSULTORES
    //GETTERS
    public String getColor() {
        return color;
    }

    public double getTamanio() {
        return tamanio;
    }

    //MODIFICADORES
    //SETTERS
    public void setColor(String color) {
        this.color = color;
    }

    //ACCIONES
    public void despegar(){
        System.out.println("Despegando...🛫");
    }

    public void aterrizar(){
        System.out.println("Aterrizando...🛬");
    }

    public void frenar(){
        System.out.println("Frenando...⏹");
    }

    
}
