/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;


import java.sql.SQLException;
import model.Petugas;

/**
 *
 * @author DidikKurniawan
 */
public interface ControllerLogin {
    
    // Perintah untuk mengambil data pada SQL server

    Petugas Username(String login) throws SQLException;


}
