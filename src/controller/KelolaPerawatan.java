/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.Perawatan;

/**
 *
 * @author DidikKurniawan
 */
public class  KelolaPerawatan implements ControllerPerawatan{
    
    public Perawatan insert(Perawatan perawatan) throws SQLException {
        PreparedStatement ps=koneksi.Connection.getConnection().prepareStatement("insert into perawatan values(?,?,?,?,?,?)") ;
        
        ps.setInt(1, perawatan.getIdPerawatan());
        ps.setString(2, perawatan.getNamaAsset());
        ps.setString(3, perawatan.getNamaPetugas());
        ps.setDate(4, perawatan.getTanggalPerawatan());
        ps.setString(5, perawatan.getKondisi());
        ps.setString(6, perawatan.getKeterangan());
        ps.executeUpdate();
        return perawatan;
    }

    public void update(Perawatan perawatan) throws SQLException {
        PreparedStatement ps=koneksi.Connection.getConnection().prepareStatement("update perawatan set namaAsset=? "
                + "  , namaPetugas=?, tanggalPerawatan=?, kondisi=?,keterangan=? where idPerawatan=?");
        ps.setString(1, perawatan.getNamaAsset());
        ps.setString(2, perawatan.getNamaPetugas());
        ps.setDate(3, perawatan.getTanggalPerawatan());
        ps.setString(4, perawatan.getKondisi());
        ps.setString(5, perawatan.getKeterangan());
        ps.setInt(6, perawatan.getIdPerawatan());
        ps.executeUpdate();
    }

    public void delete(int perawatan) throws SQLException {
        PreparedStatement ps=koneksi.Connection.getConnection().prepareStatement("delete from perawatan where idPerawatan=?");
        ps.setInt(1, perawatan);
        ps.executeUpdate();
    }

    public List<Perawatan> getAll() throws SQLException {
        Statement st=koneksi.Connection.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select *from perawatan");
        List<Perawatan> list=new ArrayList<Perawatan>();
        while(rs.next()){
            Perawatan perawatan=new Perawatan();
            perawatan.setIdPerawatan(rs.getInt("idPerawatan"));
            perawatan.setNamaAsset(rs.getString("namaAsset"));
            perawatan.setNamaPetugas(rs.getString("namaPetugas"));
            perawatan.setTanggalPerawatan(rs.getDate("tanggalPerawatan"));
            perawatan.setKondisi(rs.getString("kondisi"));
            perawatan.setKeterangan(rs.getString("keterangan"));
            list.add(perawatan);
        }
        return list;
    }

    public Perawatan getName(String rawat) throws SQLException {
        PreparedStatement ps=koneksi.Connection.getConnection().prepareStatement("select *from perawatan where tanggalPerawatan=?");
        ps.setString(1, rawat);
        ResultSet rs=ps.executeQuery();
        Perawatan perawatan = new Perawatan();
        if(rs.next()){
            perawatan.setIdPerawatan(rs.getInt("idPerawatan"));
            perawatan.setNamaAsset(rs.getString("namaAsset"));
            perawatan.setNamaPetugas(rs.getString("namaPetugas"));
            perawatan.setTanggalPerawatan(rs.getDate("tanggalPerawatan"));
            perawatan.setKondisi(rs.getString("kondisi"));
            perawatan.setKeterangan(rs.getString("keterangan"));
            
        }
        return perawatan;
    }
    
    public List<Perawatan> getSearch(String rawat) throws SQLException {
        PreparedStatement ps=koneksi.Connection.getConnection().prepareStatement("select *from perawatan where namaAsset like ?");
        ps.setString(1, "%"+rawat+"%");
        ResultSet rs=ps.executeQuery();
        List<Perawatan>list=new ArrayList<Perawatan>();
        if(rs.next()){
            Perawatan perawatan = new Perawatan();
            perawatan.setIdPerawatan(rs.getInt("idPerawatan"));
            perawatan.setNamaAsset(rs.getString("namaAsset"));
            perawatan.setNamaPetugas(rs.getString("namaPetugas"));
            perawatan.setTanggalPerawatan(rs.getDate("tanggalPerawatan"));
            perawatan.setKondisi(rs.getString("kondisi"));
            perawatan.setKeterangan(rs.getString("keterangan"));
            list.add(perawatan);
        }
        return list;
    }
    

}
