package controlador;

import java.sql.ResultSet;

import modelo.ConexionDB;
import modelo.dao.UniversidadDao;

public class UniversidadController {
    
    //ATRIBUTO
    private ConexionDB objConn;

    public UniversidadController(ConexionDB objConn){
        this.objConn = objConn;
    }

    public boolean crearUniversidad(String nit, String nombre, String direccion, String email){
        //Crear universidad
        UniversidadDao objUniversidad = new UniversidadDao(nombre, nit, direccion, email);
        boolean insert = objUniversidad.queryInsert(objConn);
        return insert;

    }

    public ResultSet obtenerUniversidades(){
        ResultSet universidades = UniversidadDao.querySelectAll(objConn);
        return universidades;
    }
    
}
