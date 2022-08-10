package com.empresa;

public class Cliente {
    
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String telefono;

    //CONSTRUCTORES
    public Cliente(String nombre, String apellido, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = "";
    }

    public Cliente(){
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
    }

    @Override
    public String toString() {
        String info = "-----------------------Cliente------------------------\n";
        info += "Nombre: "+nombre;
        info += "\nApellido: "+apellido;
        info += "\nTelefono: "+telefono;
        info += "\n-------------------------------------------------n";
        return info;
    }

    //CONSULTORES

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //MODIFICADORES

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

}
