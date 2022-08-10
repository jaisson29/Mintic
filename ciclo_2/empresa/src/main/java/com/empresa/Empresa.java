package com.empresa;

import java.util.Scanner;

public class Empresa {
    //ATRIBUTO
    private String nombre;
    private Empleado empleado;

    //SOBRECARGA DE MÉTODOS
    public Empresa(String nombre){
        this.nombre = nombre;
    }

    public Empresa(){
        this.nombre = "";
    }

    public String getNombre(){
        return nombre;
    }
    public Empleado getEmpleado(){
        return empleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    //ACCIONES
    public void crearEmpleado(Scanner leer){
        try{

            System.out.print("Por favor ingrese el nombre del empleado: ");
            String nombre = leer.next();

            System.out.print("Por favor ingrese la edad del empleado: ");
            int edad = leer.nextInt();
            leer.nextLine();

            empleado = new Empleado(nombre, edad);
            
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }
    public Cliente registrarCliente(Scanner entrada){
        Cliente cliente = new Cliente();

        try{
            System.out.print("Ingrese nombre del cliente: ");
            String nombre = entrada.next();

            System.out.print("Apellido del cliente: ");
            String apellido = entrada.next();

            System.out.print("telefono del cliente: ");
            String telefono = entrada.next();

            cliente = new Cliente(nombre, apellido, telefono);

        }catch(Exception error){
            System.out.println(error.getMessage());
        }

        return cliente;
    }

}
