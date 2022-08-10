package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.ConexionDB;
import modelo.Estudiante;

public class EstudianteDao extends Estudiante{

    public EstudianteDao(String nombre, String apellido, int edad, String cedula, char sexo, String codigo) {
        super(nombre, apellido, edad, cedula, sexo, codigo);
    }
    
    // ----------QUERIES---------------
    public boolean insert(ConexionDB conn, int idFacultad) {
        boolean insert = false;
        try {
            String query = "INSERT INTO Estudiantes VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.getConexion().prepareStatement(query);
            // Setear consulta
            pst.setString(1, getCedula());
            pst.setString(2, getCodigo());
            pst.setString(3, getNombre());
            pst.setString(4, getApellido());
            pst.setInt(5, getEdad());
            pst.setLong(6, getSexo());
            pst.setInt(7, idFacultad);
            // Ejecutar consulta
            insert = pst.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insert;
    }

    public boolean insert(ConexionDB conn, String cedula, String codigo, String nombre, String apellido, int edad,
            char sexo, int idFacultad) {
        boolean insert = false;
        try {
            String query = "INSERT INTO Estudiantes VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.getConexion().prepareStatement(query);
            // Setear consulta
            pst.setString(1, cedula);
            pst.setString(2, codigo);
            pst.setString(3, nombre);
            pst.setString(4, apellido);
            pst.setInt(5, edad);
            pst.setLong(6, sexo);
            pst.setInt(7, idFacultad);
            // Ejecutar consulta
            insert = pst.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insert;
    }

    public static ResultSet selectByFacultad(ConexionDB objConn, int idFacultad) {
        ResultSet result = null;
        try {

            String query = "SELECT e.cedula, e.codigo, e.nombre, e.apellido, e.edad, e.sexo FROM Estudiantes e ";
            query += "INNER JOIN Facultades f ON e.facultad_id = f.id WHERE f.id = ?";
            // Preparar consulta
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setInt(1, idFacultad);
            // Ejecutar consulta
            result = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet selectByCedula(ConexionDB objConn, String cedula) {
        ResultSet result = null;
        try {

            String query = "SELECT * FROM Estudiantes WHERE cedula = ?";
            // Preparar consulta
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, cedula);
            // Ejecutar consulta
            result = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean update(ConexionDB objConn, String cedula, String nombre, String apellido, int edad, char sexo) {
        boolean update = false;
        try {
            String query = "UPDATE Estudiantes SET nombre = ?, apellido = ?, edad = ?, sexo = ? ";
            query += "WHERE cedula = ?";
            // Preparar consulta
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setInt(3, edad);
            pst.setLong(4, sexo);
            pst.setString(5, cedula);
            // Ejecutar consulta
            update = pst.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }

    public boolean delete(ConexionDB objConn, String cedula) {
        boolean update = false;
        try {
            String query = "DELETE FROM Estudiantes WHERE cedula = ?";
            // Preparar consulta
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, cedula);
            // Ejecutar consulta
            update = pst.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }
}
