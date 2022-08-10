package com.reto_5.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.reto_5.model.vo.DeudasPorProyectoVo;
import com.reto_5.utils.JDBCUtilities;

public class DeudasPorProyectoDao {
    public List<DeudasPorProyectoVo> listar(Double limite) throws SQLException {
        ArrayList<DeudasPorProyectoVo> respuesta = new ArrayList<>();
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String consulta = "SELECT Proyecto.ID_Proyecto, SUM(CAntidad * Precio_Unidad) AS VALOR ";
        consulta += "FROM Proyecto ";
        consulta += "JOIN Compra ON Proyecto.ID_Proyecto = Compra.ID_Proyecto ";
        consulta += "JOIN MaterialConstruccion ON Compra.ID_MaterialConstruccion = MaterialConstruccion.ID_MaterialConstruccion ";
        consulta += "WHERE Pagado = 'No' ";
        consulta += "GROUP BY Proyecto.ID_Proyecto ";
        consulta += "HAVING SUM(CAntidad * Precio_Unidad)>? ";
        consulta += "ORDER BY VALOR DESC; ";

        try {
            pst = conn.prepareStatement(consulta);
            pst.setDouble(1, limite);
            rs = pst.executeQuery();
            while (rs.next()) {
                DeudasPorProyectoVo vo = new DeudasPorProyectoVo();
                vo.setId(rs.getInt("ID_Proyecto"));
                vo.setValor(rs.getDouble("VALOR"));

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
