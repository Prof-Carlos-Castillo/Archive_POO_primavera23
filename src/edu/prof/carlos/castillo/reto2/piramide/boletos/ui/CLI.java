package edu.prof.carlos.castillo.reto2.piramide.boletos.ui;

import edu.prof.carlos.castillo.reto2.piramide.boletos.process.CalculadorCostos;

import java.util.Scanner;

public class CLI {
    public static void showMenu() {

        int childCount = 0;
        int adultCount = 0;
        int seniorCount = 0;
        salida:
        do {
            System.out.println("elige un boleto a comprar");
            System.out.println("a) Niño: $5.50");
            System.out.println("b) adulto: $10");
            System.out.println("s) salir");

            String tipoBoleto = "";
            Scanner scanner = new Scanner(System.in);
            tipoBoleto = scanner.nextLine();
            if (tipoBoleto.equals("s")) {
                break salida;
            }

            switch (tipoBoleto) {
                case "a":
                    childCount++;
                    break;
                //TODO completar contadores de otros tipos de boletos
            }


        } while (true);

        CalculadorCostos.calcularCosto(childCount, adultCount, seniorCount);

        //TODO imprimir resultados
    }
}
