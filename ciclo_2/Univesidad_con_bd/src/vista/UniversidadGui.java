package vista;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import controlador.UniversidadController;

public class UniversidadGui {
    // ATRIBUTO
    private UniversidadController uController;

    // CONSTRUCTOR
    public UniversidadGui(UniversidadController uController) {
        this.uController = uController;
    }

    public void crearUniversidad() {
        String encabezado = "---------------CREAR UNIVERSIDAD------------\n";
        encabezado += "Por favor ingrese los siguientes datos \n\n";
        // --SOLICITAR DATOS
        String nit = JOptionPane.showInputDialog(null, encabezado + "Por favor ingrese el nit");
        String nombre = JOptionPane.showInputDialog(null, encabezado + "Por favor ingrese el nombre");
        String direccion = JOptionPane.showInputDialog(null, encabezado + "Por favor ingrese la dirección");
        String email = JOptionPane.showInputDialog(null, encabezado + "Por favor ingrese el Email");
        // Enviar datos al controlador para crear una universidad
        boolean crear = uController.crearUniversidad(nit, nombre, direccion, email);
        if (crear) {
            JOptionPane.showMessageDialog(null, "¡Universidad creada con éxito!");
        } else {
            JOptionPane.showMessageDialog(null, "Ups algo sucedió, por favor intenta mas tarde");
        }
    }

    public void crearFormulario(){
        new CrearUniversidadJframe();
    }

    public void mostrarUniversidades() {
        ResultSet result = uController.obtenerUniversidades();
        try {
            String info = "----------------UNIVERSIDADES REGISTRADAS--------------\n";
            while (result.next()) {
                info += "\nNombre: " + result.getString("nombre");
                info += "\nNit: " + result.getString("nit");
                info += "\nDireccion: " + result.getString("direccion");
                info += "\nEmail: " + result.getString("email");
                info += "\n------------------------------------------------------------\n";
            }
            JOptionPane.showMessageDialog(null, info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
