package com.reto_5.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.reto_5.model.vo.ProyectoBancoVo;
import com.reto_5.utils.JDBCUtilities;




public class ProyectoBancoDao {
    public List<ProyectoBancoVo> listar(String banco) throws SQLException {
        ArrayList<ProyectoBancoVo> respuesta = new ArrayList<>();
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String consulta = "SELECT Proyecto.ID_Proyecto AS ID, ";
        consulta += "Proyecto.Constructora, ";
        consulta += "Proyecto.Ciudad, ";
        consulta += "Proyecto.Clasificacion, ";
        consulta += "Tipo.Estrato, ";
        consulta += "Lider.Nombre || ' ' || Primer_Apellido || ' ' || Segundo_Apellido AS LIDER ";
        consulta += "FROM Proyecto ";
        consulta += "JOIN Tipo ON Proyecto.ID_Tipo = Tipo.ID_Tipo ";
        consulta += "JOIN Lider ON Proyecto.ID_Lider = Lider.ID_Lider ";
        consulta += "WHERE Banco_Vinculado = ? ";
        consulta += "ORDER BY Fecha_Inicio DESC, Ciudad, Constructora; ";

        try {
            pst = conn.prepareStatement(consulta);
            pst.setString(1, banco);
            rs = pst.executeQuery();
            while (rs.next()) {
                ProyectoBancoVo vo = new ProyectoBancoVo();
                vo.setId(rs.getInt("id"));
                vo.setConstructora(rs.getString("constructora"));
                vo.setCiudad(rs.getString("ciudad"));
                vo.setClasificacion(rs.getString("clasificacion"));
                vo.setEstrato(rs.getInt("estrato"));
                vo.setLider(rs.getString("lider"));

                respuesta.add(vo);
            }
        } finally {
            if (rs != null){
                rs.close();
            }
            if(pst != null) {
                pst.close();
            }
            if (conn != null){
                conn.close();
            }
        }

        return respuesta;
    }

}
