package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.ConexionDB;
import modelo.Facultad;

public class FacultadDao extends Facultad {

    public FacultadDao(int id, String codigo, String nombre) {
        super(id, codigo, nombre);
    }

    public FacultadDao(String codigo, String nombre) {
        super(codigo, nombre);
    }

    // QUERIES

    /**
     * Método para la insercion de una facultad,
     * Retorna un booleano (true en caso de realizar el insert, false en caso
     * contrario)
     * 
     * @param objConn
     * @return
     */
    public boolean insert(ConexionDB objConn, String nit) {
        boolean insert = false;
        try {
            String query = "INSERT INTO facultades(codigo, nombre, universidad_nit) VALUES(?, ?, ?)";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, getCodigo());
            pst.setString(2, getNombre());
            pst.setString(3, nit);
            // Ejecutar consulta
            insert = pst.executeUpdate() == 1 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insert;
    }

    /*
     * POR QUÉ NO CONCATENAR VARIABLES CON UN STATEMENT:
     * 
     * String usuario = "andres";
     * String password = "\"\" OR 1=1";
     * 
     * "SELECT * FROM users WHERE user = 'andres' AND pass = '' OR 1=1";
     * 
     * "SELECT * FROM users WHERE user = "+usuario+" AND pass = "+password
     * 
     */

    public static ResultSet selectAll(ConexionDB objConn) {
        ResultSet result = objConn.consultar("SELECT * FROM facultades");
        return result;
    }

    public static ResultSet selectByUniversidad(ConexionDB objConn, String universidadNit) {
        ResultSet result = null;
        try {
            String query = "SELECT f.id, f.codigo, f.nombre FROM Facultades f ";
            query += "INNER JOIN Universidades u ON  u.nit = f.universidad_nit WHERE u.nit = ?";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, universidadNit);
            result = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet selectByCodigo(ConexionDB objConn, String codigo) {
        ResultSet result = null;
        try {
            String query = "SELECT * FROM facultades WHERE codigo = ?";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, codigo);
            result = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet selectByNombre(ConexionDB objConn, String nombre) {
        ResultSet result = null;
        try {
            String query = "SELECT * FROM facultades WHERE nombre LIKE '%?%'";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, nombre);
            result = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean update(ConexionDB objConn, String codigo, String nombre) {
        boolean update = false;
        try {
            String query = "UPDATE facultades SET nombre = ? WHERE codigo = ?";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, nombre);
            pst.setString(2, codigo);
            // Ejecutar
            update = pst.executeUpdate() == 1 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return update;
    }

    public boolean delete(ConexionDB objConn, String codigo) {
        boolean update = false;
        try {
            String query = "DELETE FROM facultades WHERE codigo = ?";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, codigo);
            // Ejecutar
            update = pst.executeUpdate() == 1 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return update;
    }

}
