package vista;

import java.util.Scanner;

import controlador.UniversidadController;

public class Menu {
    
    //ATRIBUTOS
    private UniversidadController uController;

    //CPNSTRUCTOR
    public Menu(UniversidadController uController){
        this.uController = uController;
    }

    //CONTRUIR EL MENU PARA EL CRUD UNIVERSIDAD
    public void crearMenu(){
        //Creacion de objetos
        UniversidadConsola uConsola = new UniversidadConsola(uController);

        String mensaje = "-----------------UNIVERSIDADES CON MVC, DAO Y PERSISTENCIA DE DATOS--------------------\n";
        mensaje += "1) Crear universidad\n";
        mensaje += "2) Mostrar universidades\n";
        mensaje += "3)Consultar universidad\n";
        mensaje += "4)Actualizar universidad\n";
        mensaje += "5)Eliminar universidad\n";
        mensaje += "-1 Salir\n";
        mensaje += ">>> ";

        try (Scanner sc = new Scanner(System.in)){
            int opcion = 0;
            while(opcion != -1){
                System.out.print(mensaje);
                opcion = sc.nextInt();
                //Evaluar la opcion
                switch(opcion){
                    case 1:
                        uConsola.crearUniversidad(sc);
                        break;
                    case 2:
                        uConsola.mostrarUniversidades();
                    default:
                        break;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
