/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Ninja;
import java.util.List;
import Database.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 *
 * @author camper
 */
public class NinjaDAO {
    private Connection con;
    
    public NinjaDAO() {
        this.con = Conexion.getConnection(); 
    }

    public List<Ninja> listarNinjas() throws SQLException {
        String query = "SELECT * FROM Ninja";
        try (PreparedStatement stmt = con.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            return Stream.generate(() -> {
                try {
                    if (rs.next()) {
                        return new Ninja(
                            rs.getString("Nombre"),
                            rs.getString("Rango"),
                            rs.getString("Aldea")
                        );
                    } else {
                        return null; 
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            })
            .takeWhile(ninja -> ninja != null) 
            .collect(Collectors.toList());
        }
    }
}
