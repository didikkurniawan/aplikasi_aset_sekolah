/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;


import java.sql.SQLException;
import java.util.List;
import model.Asset;

/**
 *
 * @author DidikKurniawan
 */
public interface ControllerAsset {
    
    // Perintah untuk insert, update, delete, dan search yang sudah konek ke SQL server

    Asset insert(Asset asset)throws SQLException;

    void update(Asset  asset)throws SQLException;

    void delete(int asset) throws SQLException;

    List<Asset>getAll() throws SQLException;
    
    List<Asset>getSearch(String ass) throws SQLException;
        
    Asset getName(String ass) throws SQLException;


}
