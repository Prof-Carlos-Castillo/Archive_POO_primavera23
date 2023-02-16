package edu.prof.carlos.castillo.reto4.ui;

import edu.prof.carlos.castillo.reto4.process.ReporteadorDeVentar;

public class CLI {
    static double[][] tabla = {
            {111, 483, 471},
            {192, 505, 354},
            {334, 561, 894}
    };

    public static void main(String[] args) {
        for (int trimestre :
                ReporteadorDeVentar.getMaxProdFromQuarter(tabla)) {
            System.out.println("El trimestre que mejor vendió fue: "+trimestre);

        }

    }
}
