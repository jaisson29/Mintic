package com.animales;

public class Perro extends Animal {
    //ATRIBUTOS
    private String raza;

    //CONSTRUCTOR
    public Perro(String color, double tamanio, int edad, String especie, String raza){
        super(color, tamanio, edad, especie);
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    @Override
    public void avanzar() {
        System.out.println("Correr 🐶");
    }

}
