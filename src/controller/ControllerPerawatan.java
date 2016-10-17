/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import model.Perawatan;

/**
 *
 * @author DidikKurniawan
 */
public interface ControllerPerawatan{
    
    // Perintah untuk insert, update, delete, dan search yang sudah konek ke SQL server
   
    Perawatan insert(Perawatan perawatan)throws SQLException;

   void update(Perawatan  perawatan)throws SQLException;

    void delete(int perawatan) throws SQLException;

    List<Perawatan>getAll() throws SQLException;

//    List<Perawatan>getCombo() throws Exception;
    
    List<Perawatan>getSearch(String rawat) throws SQLException;
    
    Perawatan getName(String rawat) throws SQLException;


}
