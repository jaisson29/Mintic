package com.reto_4.view;

import java.util.List;

import com.reto_4.controller.ReportesController;
import com.reto_4.model.vo.ComprasDeLiderVo;
import com.reto_4.model.vo.DeudasPorProyectoVo;
import com.reto_4.model.vo.ProyectoBancoVo;

public class ReportesView {
    private static ReportesController controller;

    public ReportesView() {
        controller = new ReportesController();
    }

    private String repitaCaracter(Character caracter, Integer veces) {
    String respuesta = "";
    for (int i = 0; i < veces; i++) {
    respuesta += caracter;
    }
    return respuesta;
    }
    public void proyectosFinanciadosPorBanco(String banco) {
        System.out.println(repitaCaracter('=', 36) + " LISTADO DE PROYECTOS POR BANCO "
        + repitaCaracter('=', 37));
        if (banco != null && !banco.isBlank()) {
            System.out.println(String.format("%3s %-25s %-20s %-15s %-7s %-30s",
            "ID", "CONSTRUCTORA", "CIUDAD", "CLASIFICACION", "ESTRATO", "LIDER"));
            System.out.println(repitaCaracter('-', 105));
            // TODO Imprimir en pantalla la información del proyecto
            try {
                List<ProyectoBancoVo> proyectos = controller.listarProyectosPorBanco(banco);
                for (ProyectoBancoVo proyecto : proyectos) {
                    System.out.println(proyecto);
                }
            } catch (Exception ex) {
                System.err.println("Error: " + ex);
                ex.printStackTrace();
            }
        }
    }
    public void totalAdeudadoPorProyectosSuperioresALimite(Double limiteInferior) {
        System.out.println(repitaCaracter('=', 1) + " TOTAL DEUDAS POR PROYECTO "
        + repitaCaracter('=', 1));
        if (limiteInferior != null) {
            System.out.println(String.format("%3s %15s", "ID", "VALOR "));
            System.out.println(repitaCaracter('-', 29));
            // TODO Imprimir en pantalla la información del total adeudado
            try {
                List<DeudasPorProyectoVo> proyectos = controller.listarTotalAdeudadoProyecto(limiteInferior);
                for (DeudasPorProyectoVo proyecto : proyectos) {
                    System.out.println(proyecto);
                }
            } catch (Exception e) {
                System.out.println("Error: "+ e);
                e.printStackTrace();
            }
        }
    }

    public void lideresQueMasGastan() {
        System.out.println(repitaCaracter('=', 6) + " 10 LIDERES MAS COMPRADORES "
        + repitaCaracter('=', 7));
        System.out.println(String.format("%-25s %15s", "LIDER", "VALOR "));
        System.out.println(repitaCaracter('-', 41));
        // TODO Imprimir en pantalla la información de los líderes
        try {
            List<ComprasDeLiderVo> proyectos = controller.listarLideresQueMasGastan();
            for (ComprasDeLiderVo proyecto : proyectos) {
                System.out.println(proyecto);
            }
        } catch (Exception e) {
            System.out.println("Error: "+ e);
            e.printStackTrace();
        }
    }
    
}
