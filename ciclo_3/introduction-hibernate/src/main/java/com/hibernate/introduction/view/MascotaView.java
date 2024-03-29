package com.hibernate.introduction.view;

import java.util.List;

import javax.swing.JOptionPane;

import com.hibernate.introduction.controller.MascotaController;

public class MascotaView {
    
    private MascotaController controlador;

    public MascotaView(){
        controlador = new MascotaController();
    }

    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void crearMascota(){
        // Solicitar datos
        String nombre =JOptionPane.showInputDialog(null, "Ingrese nombre de la mascota");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese apellido del propietario");
        String tipo_mascota = JOptionPane.showInputDialog(null, "Ingrese el tipo de mascota");
        String raza = JOptionPane.showInputDialog(null, "Raza"); 
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad de la mascota"));
        String observacion = JOptionPane.showInputDialog(null, "Observacion");

        // Enviar datos al controlador
        try {
            controlador.create(nombre, apellido, tipo_mascota, raza, edad, observacion);
            mostrarMensaje("Mascota registrada con exito");
            
        } catch (Exception e) {
            e.printStackTrace();
            mostrarMensaje("Por favor intete mas tarde");
        }
    }

    public void consultarMascotaXid() {
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el identificador de la mascota"));
        try {
            String info = controlador.readById(id);
            mostrarMensaje(info);
        } catch (Exception e) {
            e.printStackTrace();
            mostrarMensaje("Por favor intete mas tarde");
        }
    }

    public void consultarMascotasXapellido(){
        String apellido = JOptionPane.showInputDialog(null, "Por favor ingrese el apellido");
        try {
            List<String> mascotas = controlador.getByLastname(apellido);
            String info = listToString(mascotas);
            mostrarMensaje(info);
        } catch (Exception e) {
            e.printStackTrace();
            mostrarMensaje("Por favor intente mas tarde");
        }
    }

    public String listToString(List<String> list){
        String info = "--------------MASCOTAS--------------\n";
        for(int i = 0; i < list.size(); i++){
            info += list.get(i);
        }
        return info;
    }

    public void listarMascotas(){
        try {
            List<String> mascotas = controlador.getList();
            String info = listToString(mascotas);
            mostrarMensaje(info);
        } catch (Exception e) {
            e.printStackTrace();
            mostrarMensaje("Por favor intente mas tarde");
        }
    }

    public void actualizarMascota(){
        // Solicitar datos
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el identificador de la mascota"));
        String nombre =JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre de la mascota");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese el nuevo apellido del propietario");
        String tipo_mascota = JOptionPane.showInputDialog(null, "Ingrese el nuevo tipo de mascota");
        String raza = JOptionPane.showInputDialog(null, "La nueva raza"); 
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Nueva edad de la mascota"));
        String observacion = JOptionPane.showInputDialog(null, "Nueva observacion");
        try {
            controlador.update(id, nombre, apellido, tipo_mascota, raza, edad, observacion);
            mostrarMensaje("Mascota actualizada con exito");

        } catch (Exception e) {
            e.printStackTrace();
            mostrarMensaje("Por favor intente mas tarde");
        }
    }

    public void eliminarMascota(){
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "ELIMINAR MASCOTA\nPor favor ingrese el identificador de la mascota"));
        try {
            controlador.delete(id);
            mostrarMensaje("Mascota eliminada con exito");
        } catch (Exception e) {
            e.getStackTrace();
            mostrarMensaje("Por favor intete mas tarde");
        }
    }

    public void menu(){
        String info = "1) Registrar mascota\n";
        info += "2) Consultar mascota por id\n";
        info += "3) Consultar mascotas por apellido\n";
        info += "4) Actualizar info mascota\n";
        info += "5) Eliminar mascota\n";
        info += "6)Listar mascotas\n";
        info += "-1) salir\n";

        int opcion = 0;
        while(opcion != -1){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, info));
            switch(opcion){
                case 1:
                    crearMascota();
                    break;
                case 2:
                    consultarMascotaXid();
                    break;
                case 3:
                    consultarMascotasXapellido();
                    break;
                case 4:
                    actualizarMascota();
                    break;
                case 5:
                    eliminarMascota();
                    break;
                case 6:
                    listarMascotas();
                    break;
                case -1:

                    break;
                default:
                    mostrarMensaje("Por favor ingrese una opcion valida");
                    break;
            }

        }

    }
}
