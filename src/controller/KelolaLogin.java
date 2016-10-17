/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Petugas;

/**
 *
 * @author DidikKurniawan
 */
public class KelolaLogin implements ControllerLogin{

    public Petugas Username(String login) throws SQLException {
        PreparedStatement ps=koneksi.Connection.getConnection().prepareStatement("select *from petugas where jabatan=?");
        ps.setString(1, login);
        ResultSet rs=ps.executeQuery();
        Petugas petugas = new Petugas();
        if(rs.next()){
            petugas.setId(rs.getInt("idPetugas"));
            petugas.setNama(rs.getString("namaPetugas"));
            petugas.setJabatan(rs.getString("jabatan"));
            petugas.setPassword(rs.getString("password"));
            petugas.setAkses(rs.getString("akses"));
            
        }
        return petugas;
    }   

}
