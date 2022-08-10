package com.fabrica_aviones;

public class AvionPasajeros extends Avion {
    //ATRIBUTOS
    private int pasajeros;

    public AvionPasajeros(String color, double tamanio, int pasajeros){
        super(color, tamanio);
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        String info = "------------AVION DE PASAJEROS-----------\n";
        info += "Color: "+this.getColor();
        info += "\nTamaño: "+this.getTamanio();
        info += "\nCantidad de pasajeros: "+pasajeros;
        info += "\n";
        return info;
    }
    
    //CONSULTORES
    //GETTERS
    public int getPasajeros() {
        return pasajeros;
    }

    //MODIFICADORES
    //SETTERS
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    

    //ACCIONES
    //METODOS
    public void servir(){
        System.out.println("Sirviendo");
    }



}
