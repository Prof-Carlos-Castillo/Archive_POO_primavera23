package edu.prof.carlos.castillo.reto2.boletos.ui;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){

        salida:
        do{
            System.out.println("elige un boleto a comprar");
            System.out.println("a) Niño: $5.50");
            System.out.printf(" b) adulto: $10");
            System.out.println("s) salir");

            String tipoBoleto="";
            Scanner scanner = new Scanner(System.in);
            tipoBoleto=scanner.nextLine();
            if(tipoBoleto.equals("s")){
                break salida;
            }
            int child =0;
            switch (tipoBoleto){
                case "a":
                    child++;
                    break;
            }



        }while(true);

        CalculadorCostos.calcularCosto(child,0,0);
    }
}
