/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.List;

/**
 *
 * @author camper
 */
public class HabilidadesController {
    
    private final HabilidadesDAO habilidadesDAO;

    public HabilidadesController() {
        this.habilidadesDAO = new HabilidadesDAO();
    }
    
    public void generateDetailedReport(int eventId) {
        List<Habilidades> habilidadesList = habilidadesDAO.getHabilidadesByNinja(ninjaId);

        System.out.println("Ninja ID: " + ninjaId);
        for (Habilidades habilidades : habilidadesList) {
            System.out.println("Nombre: " + habilidades.getNombre());
            System.out.println("Descripcion: " + habilidades.getDescripcion());
            System.out.println("-----");
        }
}
