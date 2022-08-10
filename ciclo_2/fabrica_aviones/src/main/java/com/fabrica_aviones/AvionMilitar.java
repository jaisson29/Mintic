package com.fabrica_aviones;

public class AvionMilitar extends Avion {
    //ATRIBUTOS
    private int misiles;

    public AvionMilitar(String color, double tamanio, int misiles){
        super(color, tamanio);
        this.misiles = misiles;
    }

    @Override
    public String toString() {
        String info = "------------AVION MILITAR-----------\n";
        info += "Color: "+this.getColor();
        info += "\nTamaño: "+this.getTamanio();
        info+= "Cantidad de misiles: "+misiles;
        info += "\n";
        return info;
    }
    //CONSULTORES
    //GETTERS
    public int getMisiles() {
        return misiles;
    }
    //MODIFICADORES
    //STTERS
    public void setMisiles(int misiles) {
        this.misiles = misiles;
    }

    static void disparar(){
        System.out.println("Disparando...");
    }
    
}
