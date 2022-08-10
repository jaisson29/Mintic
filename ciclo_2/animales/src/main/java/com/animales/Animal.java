package com.animales;

public class Animal {
    //ATRIBUTOS
    private String color;
    private double tamanio;
    private int edad;
    private String especie;

    //CONSTRUCTOR
    public Animal(String color, double tamanio, int edad, String especie){
        this.color = color;
        this.tamanio = tamanio;
        this.edad = edad;
        this.especie = especie;
    }

    //CONSULTORES

    public String getColor() {
        return color;
    }

    public double getTamanio() {
        return tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    //MODIFICADORES

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //ACCIONES
    public void avanzar(){
        System.out.println("Avanzar");
    }
    
}
