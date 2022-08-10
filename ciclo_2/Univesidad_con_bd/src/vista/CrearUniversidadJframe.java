package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;

public class CrearUniversidadJframe extends JFrame {

    // ATRIBUTOS
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnCrear;

    // CONSTRUCTOR
    public CrearUniversidadJframe() {
        // CONFIGURAR VENTANA
        // indicamos el titulo
        setTitle("Formulario Universidad");
        // Setear layout para trabajar por coordenadas
        getContentPane().setLayout(null);
        // Indicar el tamaño y la ubicación de la ventana
        setBounds(100, 100, 300, 400);
        // Inicializar los atributos de la ventana
        lblNombre = new JLabel("Nit: ");
        txtNombre = new JTextField(30);

        // Indicar coordenadas a los elementos
        lblNombre.setBounds(20, 20, 50, 20);
        txtNombre.setBounds(71, 20, 100, 25);

        // ..aquí inicializar btnCrear

        // Manejador de eventos para el botón crear
        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener texto del campo de texto txtNombre
                String nombre = txtNombre.getText();
                JOptionPane.showMessageDialog(null, nombre);
            }
        });

        // Añadir elementos a la ventana
        add(lblNombre);
        add(txtNombre);

        setVisible(true);
    }

}
