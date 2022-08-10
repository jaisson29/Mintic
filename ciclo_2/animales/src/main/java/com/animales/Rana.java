package com.animales;

public class Rana extends Animal {
    //ATRIBUTOS
    private boolean ranaToro;

    //CONSTRUCTOR
    public Rana(String color, double tamanio, int edad, String especie, boolean ranaToro){
        super(color, tamanio, edad, especie);
        this.ranaToro = ranaToro;
    }

    

    @Override
    public void avanzar() {
        System.out.println("Saltar 🐸");
    }

    public void ranaT(){
        if(ranaToro == true){
        System.out.println("Es una rana Toro ");
        }
    }


}
