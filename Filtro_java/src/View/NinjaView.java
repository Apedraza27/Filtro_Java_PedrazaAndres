/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Ninja;
import java.util.List;

/**
 *
 * @author camper
 */
public class NinjaView {
    
    public void displayNinjaDetails(Ninja ninja) {
        System.out.println(ninja);
    }

    public void displayAllNinjas(List<Ninja> ninjas) {
        for (Ninja ninja : ninjas) {
            displayNinjaDetails(ninja);
        }
    }
}
    
