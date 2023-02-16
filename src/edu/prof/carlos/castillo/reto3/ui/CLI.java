package edu.prof.carlos.castillo.reto3.ui;

import edu.prof.carlos.castillo.reto3.process.ConversorNumerico;
import edu.prof.carlos.castillo.utils.Menu;
import edu.prof.carlos.castillo.utils.MenuAction;

public class CLI {
    /*
     * Strings de interfaz para solicitar entrada de datos
     * */
    private static String DECIMAL_REQUEST = "Introduce un número en base decimal: ";
    private static String BINARY_REQUEST = "Introduce un número en base Binaria: ";
    private static String OCTAL_REQUEST = "Introduce un número en base Octal: ";
    private static String HEX_REQUEST = "Introduce un número en base Hexadecimal: ";

    /*
     * String de interfaz para mostrar resultado
     * */
    private static String CONVERSION_RESULT = "\n El resultado de la conversión es: %s >> %s \n\n ";

    /*
     *  Strings de las diferentes opciones del menu
     * */
    private static String DECIMAL_BINARY_OPTION = "Convertir Decimal a Binario";
    private static String DECIMAL_OCTAL_OPTION = "Convertir Decimal a Octal";
    private static String DECIMAL_HEX_OPTION = "Convertir Decimal a Hexadecimal";
    private static String BINARY_DECIMAL_OPTION = "Convertir Binario a Decimal";
    private static String OCTAL_DECIMAL_OPTION = "Convertir Octal a Decimal";
    private static String HEX_DECIMAL_OPTION = "Convertir Hexadecimal a Decimal";

    private static Menu menu = new Menu();
    /*
     * Funciones para cada una de las opciones del menu
     * */
    private static MenuAction decimalABinarioAction = (scanner) -> {
        String valorAConvertir = "";
        String valorResultado = "";
        System.out.print(DECIMAL_REQUEST);
        valorAConvertir = scanner.nextLine();
        valorResultado = ConversorNumerico.convertirDecimalaBinario(valorAConvertir);
        System.out.printf(CONVERSION_RESULT, valorAConvertir, valorResultado);
    };

    private static MenuAction decimalAOctalAction = (scanner) -> {
        String valorAConvertir = "";
        String valorResultado = "";
        System.out.print(DECIMAL_REQUEST);
        valorAConvertir = scanner.nextLine();
        valorResultado = ConversorNumerico.convertirDecimalaOctal(valorAConvertir);
        System.out.printf(CONVERSION_RESULT, valorAConvertir, valorResultado);
    };

    private static MenuAction decimalAHexadecimalAction = (scanner) -> {
        String valorAConvertir = "";
        String valorResultado = "";
        System.out.print(DECIMAL_REQUEST);
        valorAConvertir = scanner.nextLine();
        valorResultado = ConversorNumerico.convertirDecimalaHexadecimal(valorAConvertir);
        System.out.printf(CONVERSION_RESULT, valorAConvertir, valorResultado);
    };

    private static MenuAction binarioADecimalAction = (scanner) -> {
        String valorAConvertir = "";
        String valorResultado = "";
        System.out.print(BINARY_REQUEST);
        valorAConvertir = scanner.nextLine();
        valorResultado = ConversorNumerico.convertirBinarioADecimal(valorAConvertir);
        System.out.printf(CONVERSION_RESULT, valorAConvertir, valorResultado);
    };

    private static MenuAction octalADecimalAction = (scanner) -> {
        String valorAConvertir = "";
        String valorResultado = "";
        System.out.print(OCTAL_REQUEST);
        valorAConvertir = scanner.nextLine();
        valorResultado = ConversorNumerico.convertirOctalADecimal(valorAConvertir);
        System.out.printf(CONVERSION_RESULT, valorAConvertir, valorResultado);
    };


    private static MenuAction hexadecimalADecimalAction = (scanner) -> {
        String valorAConvertir = "";
        String valorResultado = "";
        System.out.print(HEX_REQUEST);
        valorAConvertir = scanner.nextLine();
        valorResultado = ConversorNumerico.convertirHexadecimalDecimal(valorAConvertir);
        System.out.printf(CONVERSION_RESULT, valorAConvertir, valorResultado);
    };

    static {
        // inicializar el menu
        menu
                .addOption(DECIMAL_BINARY_OPTION, decimalABinarioAction)
                .addOption(DECIMAL_OCTAL_OPTION, decimalAOctalAction)
                .addOption(DECIMAL_HEX_OPTION, decimalAHexadecimalAction)
                .addOption(BINARY_DECIMAL_OPTION, binarioADecimalAction)
                .addOption(OCTAL_DECIMAL_OPTION, octalADecimalAction)
                .addOption(HEX_DECIMAL_OPTION, hexadecimalADecimalAction)
                .createMenu();
    }

    public static void startConversor() {

        do {
            //mostrar opciones
            menu.showMenu();
            // elegir una opción dentro del rango
            var option = menu.readOption();
            // ejecutar el código de la opción elegida
            menu.selectAndRunOption(option);

        } while (menu.isAlive());
    }
}
