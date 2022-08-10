package com.empresa;

public class Empleado {
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private double sueldoBruto;

    //---------SOBRECARGA DE MÉTODOS---------

    //CONSTRUCTORES
    public Empleado(String nombre, int edad, double sueldoBruto){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldoBruto = 0.0;
    }

    public Empleado(){
        this.nombre = "";
        this.edad = 0;
        this.sueldoBruto = 0.0;
    }

    @Override
    public String toString() {
        String info = "-----------------------Empleado------------------------\n";
        info += "Nombre: "+nombre;
        info += "\nEdad: "+edad;
        info += "\nSuledo bruto: "+sueldoBruto;
        info += "\n-------------------------------------------------n";
        return info;
    }

    //CONSULTORES

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    //MODIFICADORES

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    //ACCIONES
    public void mostrar(){

    }

    public void calcularSalarioNeto(){
        
    }

}
