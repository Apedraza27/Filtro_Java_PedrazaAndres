/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.NinjaController;
import Controller.MisionController;
import Controller.NinjaMisionController;
import Controller.HabilidadesController;
import java.util.Scanner;
import Database.Conexion;
/**
 *
 * @author camper
 */
public class Main {
    private static NinjaController ninjaController;
    private static MisionController misionController;
    private static NinjaMisionController ninjaMisionController;
    private static HabilidadesController habilidadesController;
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        Conexion.init();
        
        //Controladores
        ninjaController = new NinjaController();
        misionController = new MisionController();
        ninjaMisionController = new NinjaMisionController();
        habilidadesController = new HabilidadesController();
        
        // Menú principal
        while (true) {
            displayMenu("Menú Principal", new String[]{
                "1. Ninjas",
                "2. Misiones",
                "3. Salir"
            });
            int choice = getChoice(1, 3);

            switch (choice) {
                case 1 -> menuGestionNinjas();
                case 2 -> menuGestionTaquillas();
                case 3 -> {
System.out.println("Saliendo... Hasta luego!");
scanner.close();
return;
                }
                default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
    private static void displayMenu(String title, String[] options) {
        System.out.println("\n" + title);
        System.out.println("--------------------------------------------------");
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("--------------------------------------------------");
        System.out.print("Seleccione una opción: ");
    }

    private static int getChoice(int min, int max) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) {
                    return choice;
                }
                System.out.println("Opción fuera de rango. Intente de nuevo.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
            }
        }
    }

    private static void menuGestionNinjas() {
        while (true) {
            displayMenu("Gestión de Ninjas", new String[]{
                "1. Listar ninjas",
                "2. Volver al menú principal"
            });
            int choice = getChoice(1, 2);

            switch (choice) {
                case 1 -> ninjaController.listarNinjas();
                case 2 -> {
                    return;
                }
                default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
    

    private static void menuGestionTaquillas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}