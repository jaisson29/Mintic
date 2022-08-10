package com.ejemplo_mvc.vista;

import java.util.Scanner;

import com.ejemplo_mvc.controlador.PersonaController;

public class PersonaVista {

    //ATRIBUTOS
    private PersonaController pController;

    //CONSTRUCTOR
    public PersonaVista() {
        pController = new PersonaController();
    }

    //---INTERFAZ DE USUARIO POR CONSOLA

    public void crearMenu() {
        // Opciones del menú
        String mensaje = "----------------CRUD UNIVERSIDAD CON MVC------------\n";
        mensaje += "1) Crear persona\n";
        mensaje += "2) Mostrar personas\n";
        mensaje += "3) Consultar persona\n";
        mensaje += "4) Actualizar persona\n";
        mensaje += "5) Eliminar persona\n";
        mensaje += "-1) Salir\n";
        mensaje += ">>> ";
        // Crear objeto Scanner para capturar los datos por consola
        try (Scanner sc = new Scanner(System.in)) {
            // Variable que representa la opción ingresada por el usuario
            int opcion = 0;
            // Iterar hasta que el usuario indique salir
            while (opcion != -1) {
                System.out.print(mensaje);
                // Capturar la opción ingresada por el usuario
                opcion = sc.nextInt();
                // Evaluar la opción
                switch (opcion) {
                    case 1:
                        crearPersona(sc);
                        break;
                    case 2:
                        mostrarPersonas();
                        break;
                    case 3:
                        mostrarPersonaXapellido(sc);
                        break;
                    case 4:
                        actualizarPersona(sc);
                        break;
                    case 5:
                        eliminarPersona(sc);
                        break;
                    default:
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("Por favor ingrese valores numericos en el menu");
        }

    }


    public void crearPersona(Scanner sc){
        String encabezado = "---------------CREAR PERSONA---------------";
        encabezado += "Por favor ingrese la siguoente informacion: ";
        System.out.println(encabezado);
        //----SOLICITAR DATOS AL USUARIO

        //Solicitar nombre
        System.out.print("Nombre: ");
        String nombre = sc.next();
        sc.nextLine();
        //Solicitar apellido
        System.out.print("Apellido: ");
        String apellido = sc.next();
        sc.nextLine();
        //Solicitar edad
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        //Solicitar sexo
        System.out.print("sexo: ");
        char sexo = sc.nextLine().charAt(0);

        //Solicitar telefono
        System.out.print("Telefono: ");
        String telefono = sc.next();
        sc.nextLine();
        //---CREAR PERSONA
        pController.crearPersona(nombre, apellido, edad, sexo, telefono);
        System.out.println("\n\nPersona creada con exito");
    }

    public void mostrarPersonas(){
        String infoPersonas = "---------------------PERSONAS REGISTRADAS-----------------------";
        //Iterar la cantidad de personas que se encuentran registradas
        for (int i = 0; i < pController.getCantidadPersonas(); i++) {
            infoPersonas += pController.obtenerPersonaXindex(i);
        }
        System.out.println(infoPersonas);
    }

    public void mostrarPersonaXapellido(Scanner sc){
        System.out.println("-----------------BUSCAR PERSONA POR APELLIDO---------------");
        System.out.print("Apellido: ");
        String apellido = sc.next();
        sc.nextLine();
        if(pController.validarPersonaXapellido(apellido)){
            String infoPersona = pController.consultarPersona(apellido);
            System.out.println(infoPersona);
        }else{
            System.out.println("No existe una persona registrada con el apellido ingresado");
        }
    }

    //Actualizar perosna
    public void actualizarPersona(Scanner sc){
        //-----SOLICITAR DATOS AL USUARIO
        //Solicitar apellido
        System.out.print("Ingrese el apellido de la persona a actualizar: ");
        String apellido = sc.next();
        sc.nextLine();

        if(pController.validarPersonaXapellido(apellido)){
            //Solicitar nombre
            System.out.print("Nuevo nombre: ");
            String nombre = sc.next();
            sc.nextLine();
            //Solicitar edad
            System.out.print("Nueva edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            //Solicitar sexo
            System.out.print("Nuevo sexo: ");
            char sexo = sc.nextLine().charAt(0);
            //Solicitar telefono
            System.out.print("Nuevo telefono: ");
            String telefono = sc.next();
            sc.nextLine();
            //Enviar datos al controlador para que actualice la persona
            pController.actualizarPersona(nombre, apellido, edad, sexo, telefono);
            System.out.println("Persona actualizada con exito");

        }else{
            System.out.println("No existe una persona registrada con el apellido ingresado");
        }
    }

    public void eliminarPersona(Scanner sc){
        System.out.println("ingrese el apellido de la persona que desa eliminar");
        String apellido = sc.next();
        sc.nextLine();
        if(pController.validarPersonaXapellido(apellido)){
            pController.eliminarPersona(apellido);
            System.out.println("\nPersona eliminada con exito\n");
        }else{
            System.out.println("\nNo existe una persona registrada con el apellido ingresado\n");
        }
    }

}
