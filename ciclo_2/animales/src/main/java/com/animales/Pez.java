package com.animales;

public class Pez extends Animal {
    
    public Pez(String color, double tamanio, int edad, String especie){
        super(color, tamanio, edad, especie);
    }

    @Override
    public void avanzar() {
        System.out.println("Nadar 🐠");
    }

}
