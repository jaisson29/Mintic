package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class MenuJFrame extends JFrame {
    // ATRIBUTOS
    private JButton btnCrearUniversidad;
    private JButton btnMostrarUniversidades;

    // CONSTRUCTOR
    public MenuJFrame() {
        // Setear el titulo
        setTitle("CRUD DE UNIVERSIDADES");
        // Setar el layout
        getContentPane().setLayout(null);
        // Indicar que debe cerrar el programa cuando se dé click en la equis (X)
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Indicar el tamaño de la ventana
        setBounds(100, 100, 400, 200);
        // Inicializar los atributos
        btnCrearUniversidad = new JButton("Crear Universidad");
        btnCrearUniversidad.setBounds(20, 20, 160, 40);

        btnMostrarUniversidades = new JButton("Mostrar Universidades");
        btnMostrarUniversidades.setBounds(190, 20, 160, 40);

        // Manejadores de eventos
        btnCrearUniversidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CrearUniversidadJframe cUniversidadJframe = new CrearUniversidadJframe();
                
            }
        });
        btnMostrarUniversidades.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        // Añadir elementos a la ventana
        add(btnCrearUniversidad);
        add(btnMostrarUniversidades);

        setVisible(true);
    }
}
