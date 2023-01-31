package edu.prof.carlos.castillo.demo;

import java.util.Arrays;

/**
 * Esta e una clase para realizar demos en clase
 */
public class Demo {
    public static void main(String[] args) {
        demoFor();
        demoForArreglos();
    }

    public static void demoFor() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("///");
        out:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5) {
                    System.out.print("+");
                    break out;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("////");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5) {
                    System.out.print("+");
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i > 5 && i < 7) {
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void demoForArreglos() {
        String[] arreglo = {"pato", "palabra", "acido", "desoxirribonucleico", "chapala"};

        for (String palabra : arreglo) {
            System.out.println(palabra);
        }
        System.out.println("***");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println("**");
        // lambas
        Arrays.stream(arreglo).forEach(System.out::println);

    }
}
