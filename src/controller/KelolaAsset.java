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
import model.Asset;

/**
 *
 * @author DidikKurniawan
 */
public class  KelolaAsset implements ControllerAsset{
    
    // perintah insert asset 
//        >> Koneksi kedatabase
//        >> Menuju ke tabel yang akan dipilih
//        >> mengisikan tabel berdasarkan kelas pada Asset
    public Asset insert(Asset asset) throws SQLException {
        PreparedStatement ps=koneksi.Connection.getConnection().prepareStatement("insert into asset values(?,?,?,?,?,?,?,?,?)");
        ps.setInt(1, asset.getIdAsset());
        ps.setString(2, asset.getJenisAsset());
        ps.setString(3, asset.getNama());
        ps.setString(4, asset.getMarkAsset());
        ps.setString(5, asset.getWarnaAsset());
        ps.setDate(6,asset.getTanggal());
        ps.setDouble(7, asset.getHarga());
        ps.setString(8, asset.getLokasi());
        ps.setString(9, asset.getNamaPetugas());
        ps.executeUpdate();
        return asset;
    }

    public void update(Asset asset) throws SQLException {
        
//        perintah update pada asset
//                >> mengkoneksikan ke database
//                >> memangil tabel yang akan di update
//                >> update akan dipilih berdasarkan id yang telah di select
//                >> kemudian men-SET tabel berdasarkan atribut yang akan di Update
        PreparedStatement ps=koneksi.Connection.getConnection().prepareStatement("update asset set jenisAsset=?,namaAsset=? "
                + " , merk=? , warna=?, tanggalPembelian=?, harga=?,lokasi=?, namaPetugas=? where idAsset=?");
        ps.setString(1, asset.getJenisAsset());
        ps.setString(2, asset.getNama());
        ps.setString(3, asset.getMarkAsset());
        ps.setString(4, asset.getWarnaAsset());
        ps.setDate(5, asset.getTanggal());
        ps.setDouble(6, asset.getHarga());
        ps.setString(7, asset.getLokasi());
        ps.setString(8, asset.getNamaPetugas());
        ps.setInt(9, asset.getIdAsset());
        ps.executeUpdate();
    }

    public void delete(int asset) throws SQLException {
//        Menghapus tabel asset berdasarkan id yang telah di select pada tabel
        PreparedStatement ps=koneksi.Connection.getConnection().prepareStatement("delete from asset where idAsset=?");
        ps.setInt(1, asset);
        ps.executeUpdate();
    }

    public List<Asset> getAll() throws SQLException {
        Statement st=koneksi.Connection.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select *from asset");
        List<Asset> list =new ArrayList<Asset>();
        while(rs.next()){
            Asset asset =new Asset();
            asset.setIdAsset(rs.getInt("idAsset"));
            asset.setJenisAsset(rs.getString("jenisAsset"));
            asset.setNama(rs.getString("namaAsset"));
            asset.setMarkAsset(rs.getString("merk"));
            asset.setWarnaAsset(rs.getString("warna"));
            asset.setTanggal(rs.getDate("tanggalPembelian"));
            asset.setHarga(rs.getDouble("harga"));
            asset.setLokasi(rs.getString("lokasi"));
            asset.setNamaPetugas(rs.getString("namaPetugas"));
            list.add(asset);
        }
        return list;
    }
    public Asset getName(String ass) throws SQLException {
        PreparedStatement ps=koneksi.Connection.getConnection().prepareStatement("select *from asset where namaAsset=?");
        ps.setString(1,ass);
        ResultSet rs=ps.executeQuery();
        Asset asset = new Asset();
        if(rs.next()){
            
            asset.setIdAsset(rs.getInt("idAsset"));
            asset.setJenisAsset(rs.getString("jenisAsset"));
            asset.setNama(rs.getString("namaAsset"));
            asset.setMarkAsset(rs.getString("merk"));
            asset.setWarnaAsset(rs.getString("warna"));
            asset.setTanggal(rs.getDate("tanggalPembelian"));
            asset.setHarga(rs.getDouble("harga"));
            asset.setLokasi(rs.getString("lokasi"));
            asset.setNamaPetugas(rs.getString("namaPetugas"));
            
        }
        return asset;
    }

    public List<Asset> getSearch(String ass) throws SQLException {
        PreparedStatement ps=koneksi.Connection.getConnection().prepareStatement("select *from asset where namaAsset like ?");
        ps.setString(1, "%"+ass+"%");
        ResultSet rs=ps.executeQuery();
        List<Asset>list=new ArrayList<Asset>();
        if(rs.next()){
            Asset asset = new Asset();
            asset.setIdAsset(rs.getInt("idAsset"));
            asset.setJenisAsset(rs.getString("jenisAsset"));
            asset.setNama(rs.getString("namaAsset"));
            asset.setMarkAsset(rs.getString("merk"));
            asset.setWarnaAsset(rs.getString("warna"));
            asset.setTanggal(rs.getDate("tanggalPembelian"));
            asset.setHarga(rs.getDouble("harga"));
            asset.setLokasi(rs.getString("lokasi"));
            asset.setNamaPetugas(rs.getString("namaPetugas"));
            list.add(asset);
        }
        return list;
    }

}
