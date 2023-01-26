package edu.prof.carlos.castillo.reto1.ui;

import edu.prof.carlos.castillo.reto1.process.Calculadora;

import java.util.Scanner;

public class CLI {
    public static void mostarMenu(){
        System.out.println("Elige una opción");
        System.out.println("1) suma");
        System.out.println("2) resta");
        System.out.println("3) multi");
        System.out.println("4) div");

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();scanner.nextLine();

        System.out.println("introduce el primer valor");
        int operando1 = scanner.nextInt();scanner.nextLine();
        System.out.println("introduce el segundo valor");
        int operando2 = scanner.nextInt();scanner.nextLine();
        int resultado=-1;
        String operacion ="";

        switch (option){
            case 1:
                resultado = Calculadora.sumarNumeros(operando1,operando2);
                operacion = "+";
                break;

        }

        System.out.printf("El resultado de la operación es %d %s %d = %d",operando1,operacion,operando2,resultado);


    }
}
