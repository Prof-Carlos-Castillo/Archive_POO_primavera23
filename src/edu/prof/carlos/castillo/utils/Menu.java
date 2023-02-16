package edu.prof.carlos.castillo.utils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    private String REQUEST_OPTION = "Favor de elegir una opción: ";
    private String NUMERIC_TYPE_ERROR = "El valor ingresado no tiene formato numérico, favor de introducir un valor válido: ";
    private String OUT_OF_RANGE_ERROR = "Opción no disponible, favor de elegir una opción válida: ";
    private ArrayList<String> optionList = new ArrayList<>();
    private ArrayList<MenuAction> actionList = new ArrayList<>();
    private boolean alive = true;

    public boolean isAlive() {
        return alive;
    }

    public void killMenu() {
        alive = false;
    }

    public Menu addOption(String option, MenuAction action) {
        optionList.add(option);
        actionList.add(action);
        return this;
    }

    public void createMenu() {
        optionList.add("Salir");
    }

    public void cleanMenu() {
        optionList.clear();
    }

    public void showMenu() {
        System.out.println("******************");
        System.out.println("       MENU");
        System.out.println("******************");
        for (int i = 0; i < optionList.size(); i++) {
            System.out.printf("%d) %s.\n", i + 1, optionList.get(i));
        }
        System.out.println();
        System.out.print(REQUEST_OPTION);
    }

    public int readOption() {
        while (true) {
            try {
                int numero = scanner.nextInt();
                scanner.nextLine();
                if (numero < 1 || numero > actionList.size() + 1) {
                    System.out.print(OUT_OF_RANGE_ERROR);
                    continue;
                }
                return numero;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.print(NUMERIC_TYPE_ERROR);
            }
        }
    }

    public void selectAndRunOption(int option) {
        if (option == optionList.size()) {
            killMenu();
            System.out.println("Que tenga buen día!");
            return;
        }
        actionList.get(option - 1).run(scanner);

    }
}
