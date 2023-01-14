package com.hibernate.introduction;

/* import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.introduction.model.Mascota; */
import com.hibernate.introduction.view.MascotaView;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        MascotaView view = new MascotaView();
        view.menu();





        /* // Crear objeto fabricante de sesiones
        SessionFactory factory = new Configuration()
                .configure("cfg.xml")
                .addAnnotatedClass(Mascota.class)
                .buildSessionFactory();

        // Abrir sesión
        Session session = factory.openSession();

        // Preparar la sesión para realizar transacciones
        session.beginTransaction();

        // Generar transacciones...
        try {
            // CRUD

            /*********  CREATE  *****************

            Mascota mascota = new Mascota("Dulce", "Quintero", "Perro", "Chandinez", 2, "Agresiva");
            session.persist(mascota);
            session.getTransaction().commit(); 

            /********* READ  **************** */
            //Mostrar una sola mascota con el "find"
            // Mascota mascota = session.find(Mascota.class, 1);
            // System.out.println(mascota);
            //Mostrar una sola mascota con el "byID" y el "load"
            // Mascota mascota = session.byId(Mascota.class).load(3);
            // System.out.println(mascota);

            /***** LLAMAR UNA LISTA DE LOS REGISTROS 
            List<Mascota> mascotas = session.createQuery("FROM Mascota", Mascota.class).list();
            for(int i = 0;i < mascotas.size();i++) {
                System.out.println(mascotas.get(i));
            }
            

            /******** UPDATE ********* 
            // Obtener un registro
            /* Mascota mascota = session.find(Mascota.class, 3);
            mascota.setRaza("Dalmata");
            mascota.setEdad(8);
            mascota.setObservacion("No tiene vacunas");
            // Guardar cambios
            session.merge(mascota);
            session.getTransaction().commit(); 
            
            /************* DELETE **************** 
            Mascota mascota = session.find(Mascota.class, 4);
            session.remove(mascota);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Cerrar sesión
        session.close(); */
    }
}