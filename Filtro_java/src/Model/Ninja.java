/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author camper
 */
public class Ninja {
    private String Nombre;
    private String Rango;
    private String Aldea;

    public Ninja(String Nombre, String Rango, String Aldea) {
        this.Nombre = Nombre;
        this.Rango = Rango;
        this.Aldea = Aldea;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public String getRango(){
        return Rango;
    }
    
    public String getAldea(){
        return Aldea;
    }
    
    @Override
    public String toString() {
        return String.format(
            "Nombre: %s\n" +
            "Rango: %s\n" +
            "Aldea: %s\n" +
            "-----------------------------------",
             getNombre(), getRango(), getAldea()
        );
    }
    
}
