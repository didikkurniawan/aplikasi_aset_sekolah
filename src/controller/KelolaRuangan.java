/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Ruangan;

/**
 *
 * @author DidikKurniawan
 */
public class KelolaRuangan implements ControllerRuangan {

    public Ruangan insert(Ruangan ruangan) throws SQLException {
        PreparedStatement ps = koneksi.Connection.getConnection().prepareStatement("insert into ruangan values(?,?,?,?,?)");
        ps.setInt(1, ruangan.getIdRuangan());
        ps.setString(2, ruangan.getNamaRuangan());
        ps.setString(3, ruangan.getJenisRuangan());
        ps.setString(4, ruangan.getLokasi());
        ps.setString(5, ruangan.getNamaPetugas());
        ps.executeUpdate();
        return ruangan;
    }

    public void update(Ruangan ruangan) throws SQLException {
        PreparedStatement ps = koneksi.Connection.getConnection().prepareStatement("update ruangan set namaRuangan=?,jenisRuangan=? "
                + " , lokasi=? , namaPetugas=? where idRuangan=?");
        ps.setString(1, ruangan.getNamaRuangan());
        ps.setString(2, ruangan.getJenisRuangan());
        ps.setString(3, ruangan.getLokasi());
        ps.setString(4, ruangan.getNamaPetugas());
        ps.setInt(5, ruangan.getIdRuangan());

        ps.executeUpdate();
    }

    public void delete(int ruangan) throws SQLException {
        PreparedStatement ps = koneksi.Connection.getConnection().prepareStatement("delete from ruangan where idRuangan=?");
        ps.setInt(1, ruangan);
        ps.executeUpdate();
    }

    public List<Ruangan> getAll() throws SQLException {
        Statement st = koneksi.Connection.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select *from ruangan");
        List<Ruangan> list = new ArrayList<Ruangan>();
        while (rs.next()) {
            Ruangan ruangan = new Ruangan();
            ruangan.setIdRuangan(rs.getInt("idRuangan"));
            ruangan.setNamaRuangan(rs.getString("namaRuangan"));
            ruangan.setJenisRuangan(rs.getString("jenisRuangan"));
            ruangan.setLokasi(rs.getString("lokasi"));
            ruangan.setNamaPetugas(rs.getString("namaPetugas"));
            list.add(ruangan);
        }
        return list;
    }

    public Ruangan getName(String ruang) throws SQLException {
        PreparedStatement ps = koneksi.Connection.getConnection().prepareStatement("select *from ruangan where namaRuangan=?");
        ps.setString(1, ruang);
        ResultSet rs = ps.executeQuery();
        Ruangan ruangan = new Ruangan();
        if (rs.next()) {
            ruangan.setIdRuangan(rs.getInt("idRuangan"));
            ruangan.setNamaRuangan(rs.getString("namaRuangan"));
            ruangan.setJenisRuangan(rs.getString("jenisRuangan"));
            ruangan.setLokasi(rs.getString("lokasi"));
            ruangan.setNamaPetugas(rs.getString("namaPetugas"));

        }
        return ruangan;
    }

    public List<Ruangan> getSearch(String ruang) throws SQLException {
        PreparedStatement ps = koneksi.Connection.getConnection().prepareStatement("select *from ruangan where namaRuangan like ?");
        ps.setString(1, "%" + ruang + "%");
        ResultSet rs = ps.executeQuery();
        List<Ruangan> list = new ArrayList<Ruangan>();
        if (rs.next()) {
            Ruangan ruangan = new Ruangan();
            ruangan.setIdRuangan(rs.getInt("idRuangan"));
            ruangan.setNamaRuangan(rs.getString("namaRuangan"));
            ruangan.setJenisRuangan(rs.getString("jenisRuangan"));
            ruangan.setLokasi(rs.getString("lokasi"));
            ruangan.setNamaPetugas(rs.getString("namaPetugas"));
            list.add(ruangan);
        }
        return list;
    }

}
