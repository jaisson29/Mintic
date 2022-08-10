package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
    // ATRIBUTOS
    private Connection conexion;

    // CONSTRUCTOR
    public ConexionDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:universidad_grupo24.db");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error al conectar con la base de datos");
        }
    }

    //CONSULTOR
    public Connection getConexion(){
        return conexion;
    }

    // ACCIONES

    // Método con manejador de excepciones
    public void cerrarConexion() throws SQLException {
        conexion.close();
    }

    public ResultSet consultar(String query) {
        ResultSet result;
        try {
            Statement st = conexion.createStatement();
            result = st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            result = null;
        }
        return result;
    }

}
