package edu.prof.carlos.castillo.reto3.process;

import java.util.Arrays;
import java.util.List;

/**
 * Esta clase contiene metodos para convertir numeros de una base numerica a otra
 */
public class ConversorNumerico {

    private static List<String> hexadecimalMap = Arrays.asList(
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"
    );

    /**
     * Este metodo recibe un string que representa un numero en base decimal
     * y regresa el mismo numero en su representacion de base binaria
     *
     * @param decimal numero a convertir en base decimal
     * @return numero en base binaria
     */
    public static String convertirDecimalaBinario(String decimal) {
        int numeroBase = Integer.parseInt(decimal);
        String numeroBinario = "";
        if (numeroBase == 0) {
            return "0";
        }
        while (numeroBase > 0) {
            numeroBinario = (numeroBase % 2) + numeroBinario;
            numeroBase /= 2;

        }
        return numeroBinario;
    }

    public static String convertirDecimalaOctal(String decimal) {
        int numeroBase = Integer.parseInt(decimal);
        String numeroOctal = "";
        if (numeroBase == 0) {
            return "0";
        }
        while (numeroBase > 0) {
            numeroOctal = (numeroBase % 8) + numeroOctal;
            numeroBase /= 8;

        }
        return numeroOctal;
    }

    public static String convertirDecimalaHexadecimal(String decimal) {
        int numeroBase = Integer.parseInt(decimal);
        String numeroHexaDecimal = "";
        if (numeroBase == 0) {
            return "0";
        }
        while (numeroBase > 0) {
            numeroHexaDecimal = hexadecimalMap.get(numeroBase % 16) + numeroHexaDecimal;
            numeroBase /= 16;

        }
        return numeroHexaDecimal;
    }

    public static String convertirBinarioADecimal(String binario) {
        int valorDecimal = 0;
        int valorPosicional = 1;
        for (int i = binario.length() - 1; i >= 0; i--) {
            char digito = binario.charAt(i);
            if (digito == '1') {
                valorDecimal += valorPosicional;
            }
            valorPosicional *= 2;
        }
        return valorDecimal + "";
    }

    public static String convertirOctalADecimal(String octal) {
        int valorDecimal = 0;
        int valorPosicional = 1;
        for (int i = octal.length() - 1; i >= 0; i--) {
            char digito = octal.charAt(i);
            if (digito >= '1' && digito <= '7') {
                valorDecimal += (digito - 48) * valorPosicional;
            }
            valorPosicional *= 8;
        }
        return valorDecimal + "";
    }

    public static String convertirHexadecimalDecimal(String hexadecimal) {
        int valorDecimal = 0;
        int valorPosicional = 1;
        for (int i = hexadecimal.length() - 1; i >= 0; i--) {
            char digito = hexadecimal.charAt(i);
            valorDecimal += hexadecimalMap.indexOf(digito + "") * valorPosicional;
            valorPosicional *= 16;
        }
        return valorDecimal + "";
    }
}
