package vista;

import javax.swing.JOptionPane;

import controlador.UniversidadController;

/**
 * Graphical
 * User
 * Interface
 */

public class MenuGui {

    // ATRIBUTO
    private UniversidadController uController;

    // CONSTRUCTOR
    public MenuGui(UniversidadController uController) {
        this.uController = uController;
    }

    // CONSTRUIR EL MENÚ PARA EL CRUD UNIVERSIDAD
    public void crearMenu() {
        // CREACIÓN DE OBJETOS
        UniversidadGui uGui = new UniversidadGui(uController);

        String mensaje = "-------------UNIVERSIDADES CON MVC, DAO Y PERSISTENCIA DE DATOS------------------\n";
        mensaje += "1) Crear universidad\n";
        mensaje += "2) Mostrar universidades\n";
        mensaje += "3) Consultar universidad\n";
        mensaje += "4) Actualizar universidad\n";
        mensaje += "5) Eliminar universidad\n";
        mensaje += "-1) Salir\n";

        try {
            int opcion = 0;
            while (opcion != -1) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
                // Evaluar la opción
                switch (opcion) {
                    case 1:
                        uGui.crearFormulario();
                        break;
                    case 2:
                        uGui.mostrarUniversidades();
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores numéricos en las opciones del menú");
        }

    }

    /*
     * public void ventanasEmergentes(){
     * // Crear ventana emergente
     * // Mostrar información
     * JOptionPane.showMessageDialog(null,
     * "Hola mundo, esta es mi primera interfaz gráfica");
     * // Solicitar datos
     * String nombre = JOptionPane.showInputDialog(null,
     * "Por favor ingrese su nombre");
     * // Mostrar nombre
     * JOptionPane.showMessageDialog(null, "Su nombre es: " + nombre);
     * }
     */

}
