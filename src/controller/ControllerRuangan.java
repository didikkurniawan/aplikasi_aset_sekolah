/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import model.Ruangan;

/**
 *
 * @author DidikKurniawan
 */
public interface ControllerRuangan {
    
    // Perintah untuk insert, update, delete, dan search yang sudah konek ke SQL server
   
   Ruangan insert(Ruangan ruangan)throws SQLException;

   void update(Ruangan  ruangan)throws SQLException;

    void delete(int ruangan) throws SQLException;

    List<Ruangan>getAll() throws SQLException;
    
    Ruangan getName(String ruang) throws SQLException;
    
    List<Ruangan>getSearch(String ruang) throws SQLException;


}
