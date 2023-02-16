package edu.prof.carlos.castillo.reto4.process;

import java.util.ArrayList;
import java.util.List;

public class ReporteadorDeVentar {



    public static List<Integer>  getMaxProdFromQuarter(double[][] tabla) {
        double max;
        List<Integer> trimestres = new ArrayList<>();
        int auxIndex = 0;
        for (int i = 0; i < tabla.length; i++) {
            max = Double.MIN_VALUE;
            for (int j = 0; j < tabla.length; j++) {
                if (tabla[i][j] > max) {
                    max = tabla[i][j];
                    auxIndex = j;
                }
            }
            trimestres.add(auxIndex);

        }
        return trimestres;
    }
    public static List<Integer>  getMaxQuarter(double[][] tabla) {
        double max;
        List<Integer> trimestres = new ArrayList<>();
        int auxIndex = 0;
        for (int i = 0; i < tabla.length; i++) {
            max = Double.MIN_VALUE;
            for (int j = 0; j < tabla.length; j++) {
                if (tabla[j][i] > max) {
                    max = tabla[i][j];
                    auxIndex = j;
                }
            }
            trimestres.add(auxIndex);

        }
        return trimestres;
    }
}
