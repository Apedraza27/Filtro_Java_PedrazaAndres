/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.NinjaDAO;
import Model.Ninja;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author camper
 */
public class NinjaController {
    private NinjaDAO ninjaDAO;
    
    public NinjaController() {
        this.ninjaDAO = new NinjaDAO();
    }
    
    public void listarNinjas() {
        try {
            List<Ninja> ninja = ninjaDAO.listarNinjas();
            if (ninja.isEmpty()) {
                System.out.println("No hay ninjas para mostrar.");
            } else {
                // Uso de Stream API para mostrar ninjas
                ninja.stream()
                    .forEach(evento -> {
                        System.out.println(ninja);
                        System.out.println(); 
                    });
            }
        } catch (SQLException e) {
            mostrarError("Error al listar ninjas: " + e.getMessage());
        }
    }

    private void mostrarError(String mensaje) {
        System.err.println(mensaje);
    }
    
}
