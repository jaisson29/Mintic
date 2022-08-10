package com.reto_5.controller;

import java.sql.SQLException;
import java.util.List;

import com.reto_5.model.dao.ComprasDeLiderDao;
import com.reto_5.model.dao.DeudasPorProyectoDao;
import com.reto_5.model.dao.ProyectoBancoDao;
import com.reto_5.model.vo.ComprasDeLiderVo;
import com.reto_5.model.vo.DeudasPorProyectoVo;
import com.reto_5.model.vo.ProyectoBancoVo;

public class ReportesController {
    private ProyectoBancoDao proyectoBancoDao;
    private ComprasDeLiderDao comprasDeLiderDao;
    private DeudasPorProyectoDao pagadoPorProyectoDao;

    public ReportesController(){
        proyectoBancoDao = new ProyectoBancoDao();
        comprasDeLiderDao = new ComprasDeLiderDao();
        pagadoPorProyectoDao = new DeudasPorProyectoDao();
    }

    public List<ProyectoBancoVo> listarProyectosPorBanco(String banco) throws SQLException{
        return proyectoBancoDao.listar(banco);
    }

    public List<DeudasPorProyectoVo> listarTotalAdeudadoProyecto(Double limite) throws SQLException{
        return pagadoPorProyectoDao.listar(limite);
    }

    public List<ComprasDeLiderVo> listarLideresQueMasGastan() throws SQLException{
        return comprasDeLiderDao.listar();
    }

}
