package com.reto_5;

import com.reto_5.view.ReportesView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //--PROYECTOS FINANCIADOS POR BANCO
        ReportesView reportesView = new ReportesView();
        String banco = "Conavi";
        reportesView.proyectosFinanciadosPorBanco(banco);

        //--TOTAL GASTADO EN CADA PROYECTO
        double limiteInferior = 50_000d;
        reportesView.totalAdeudadoPorProyectosSuperioresALimite(limiteInferior);

        //--TOP 10 LIDERES QUE MAS GASTAN
        reportesView. lideresQueMasGastan();

    }
}
