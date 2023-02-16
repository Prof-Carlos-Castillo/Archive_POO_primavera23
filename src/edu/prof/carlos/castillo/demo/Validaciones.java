package edu.prof.carlos.castillo.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase incluye algunos ejemplos de validaciones que pueden ser implementadas dentro de un programa
 */
public class Validaciones {

    //Ejemplo de validacion de datos numericos
    /*
     *Cuando se implementan validaciones es recomendable separar el código de lectura del código principal para una mejor lectura
     * */
    public static void leerNumeros() {

        int valorNumerico = getIntValidated("Introduce un numero");

        System.out.printf("El valor numérico introducido es %d", valorNumerico);


    }

    /**
     * Este es un método auxiliar que me permite leer un numéro del teclado, si el valor introducido no corresponde
     * con un valor numérico este método seguirá solicitando el dato de entrada hasta que se introduzca un valor válido
     * al separar el código de esta manera, mi programa principal es más fácil de leer, y puedo reutilizar esta misma validación
     * cada que necesite leer un número del teclado.
     * <p>
     * cuando se usa el scanner para leer numeros y el usuario proporciona un valor que no corresponda con un número
     * * el sistema lanzara un error similar al siguiente:
     * * Exception in thread "main" java.util.InputMismatchException
     * at java.base/java.util.Scanner.throwFor(Scanner.java:943)
     * at java.base/java.util.Scanner.next(Scanner.java:1598)
     * at java.base/java.util.Scanner.nextInt(Scanner.java:2263)
     * at java.base/java.util.Scanner.nextInt(Scanner.java:2217)
     * at edu.prof.carlos.castillo.demo.Validaciones.leerNumeros(Validaciones.java:17)
     * at edu.prof.carlos.castillo.demo.Validaciones.main(Validaciones.java:23)
     * *
     * * por lo que se recomienda el uso de una estructura try catch para prevenir al programa de este error y manejarlo
     */
    public static int getIntValidated(String message) {
        while (true) {
            System.out.println(message);
            try {
                Scanner scanner = new Scanner(System.in);
                int numero = scanner.nextInt();
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Error de datos de entrada: se espera un número, el valor leído no se puede convertir a un tipo numérico");
            }
        }
    }

    public static void main(String[] args) {
        leerNumeros();
    }


}
