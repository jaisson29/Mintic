package vista;

import java.sql.ResultSet;
import java.util.Scanner;

import controlador.UniversidadController;

public class UniversidadConsola {
    
    //ATRIBUTO
    private UniversidadController uController;

    public UniversidadConsola(UniversidadController uController){
        this.uController = uController;
    }

    public void crearUniversidad(Scanner sc){
        System.out.println("-----------------CREAR UNIVERSIDAD-----------------");
        System.out.println("Por favor ingrese los sigueintes datos: ");
        //---SOLICITAR DATOS
        //SOLICITAR NIT
        System.out.print("Nit: ");
        String nit = sc.next();
        sc.nextLine();
        
        //SOLICITAR NOMBRE
        System.out.print("Nombre: ");
        String nombre = sc.next();
        sc.nextLine();

        //SOLICITAR DIRECCION
        System.out.print("Direccion: ");
        String direccion = sc.next();
        sc.nextLine();

        //SOLICITAR EMAIL
        System.out.print("Email: ");
        String email = sc.next();
        sc.nextLine();

        //Enviar datos al controlador para crear una universidad
        boolean crear = uController.crearUniversidad(nit, nombre, direccion, email);
        if(crear){
            System.out.println("Universidad creada con exito");
        }else{
            System.out.println("Ups algo sucedió, por favor intenta mas tarde");
        }

    }

    public void mostrarUniversidades(){
        ResultSet result = uController.obtenerUniversidades();
        try {
            String info = "-----------------UNIVERSIDADES REGISTRADAS-------------------\n";
            while(result.next()){
                info += "\nNombre: "+result.getString("nombre");
                info += "\nNit: "+result.getString("nit");
                info += "\nDireccion: "+result.getString("direccion");
                info += "\nEmail: "+result.getString("email");
                info += "\n------------------------------------";
            }
            System.out.println(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
