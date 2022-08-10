package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.ConexionDB;
import modelo.Universidad;

public class UniversidadDao extends Universidad {

    public UniversidadDao(String nombre, String nit, String direccion, String email) {
        super(nombre, nit, direccion, email);
    }


    // Método que retorna query para la inserción de una universidad en BD
    public boolean queryInsert(ConexionDB objConn) {
        boolean resp = false;
        String query = "INSERT INTO Universidades(nit, nombre, direccion, email) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, getNit());
            pst.setString(2, getNombre());
            pst.setString(3, getDireccion());
            pst.setString(4, getEmail());
            // Ejecutar query
            pst.executeUpdate();
            resp = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resp;
    }

    public static ResultSet querySelectAll(ConexionDB objConn) {
        ResultSet result = objConn.consultar("SELECT * FROM Universidades");
        return result;
    }


    public boolean queryUpdate(ConexionDB objConn) {
        boolean resp = false;
        try {
            String query = "UPDATE Universidades SET nombre=?, direccion=?, email=? WHERE nit = ?";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, getNombre());
            pst.setString(2, getDireccion());
            pst.setString(3, getEmail());
            pst.setString(4, getNit());
            // Ejecutar query
            pst.executeUpdate();
            resp = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resp;
    }

    public static boolean queryDelete(ConexionDB objConn, String nit) {
        boolean resp = false;
        try {
            String query = "DELETE FROM Universidades WHERE nit=?";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, nit);
            // Ejecutar query
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resp;
    }
    
}
