package com.reto_4.model.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.reto_4.JDBCUtilities;
import com.reto_4.model.vo.ComprasDeLiderVo;

public class ComprasDeLiderDao {
    // TODO implementar la clase
    public List<ComprasDeLiderVo> listar() throws SQLException {
        ArrayList<ComprasDeLiderVo> respuesta = new ArrayList<>();
        Connection conn = JDBCUtilities.getConnection();
        Statement st = null;
        ResultSet rs = null;
        String consulta = "SELECT Nombre || ' ' || Primer_Apellido || ' ' || Segundo_Apellido AS LIDER, ";
                consulta += "SUM(Cantidad*Precio_Unidad) AS VALOR ";
                consulta += "FROM Lider l ";
                consulta += "JOIN Proyecto p ON p.ID_Lider = l.ID_Lider ";
                consulta += "JOIN Compra c ON p.ID_Proyecto  = c.ID_Proyecto ";
                consulta += "JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion ";
                consulta += "GROUP BY Nombre || ' ' || Primer_Apellido || ' ' || Segundo_Apellido ";
                consulta += "ORDER BY VALOR DESC ";
                consulta += "LIMIT 10; ";

        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                ComprasDeLiderVo vo = new ComprasDeLiderVo();
                vo.setLider(rs.getString("Lider"));
                vo.setValor(rs.getDouble("Valor"));

                respuesta.add(vo);
            }
        } finally {
            if (rs != null){
                rs.close();
            }
            if(st != null) {
                st.close();
            }
            if (conn != null){
                conn.close();
            }
        }

        return respuesta;
    }
}
