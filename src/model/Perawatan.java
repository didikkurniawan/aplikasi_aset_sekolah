/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author DidikKurniawan
 */
public class Perawatan {
    
    private int idPerawatan;
    private String namaAsset;
    private String namaPetugas;
    private Date tanggalPerawatan;
    private String kondisi;
    private String keterangan;

    public Perawatan() {
    }

    public Perawatan(int idPerawatan, String namaAsset, String namaPetugas, Date tanggalPerawatan, String kondisi, String keterangan) {
        this.idPerawatan = idPerawatan;
        this.namaAsset = namaAsset;
        this.namaPetugas = namaPetugas;
        this.tanggalPerawatan = tanggalPerawatan;
        this.kondisi = kondisi;
        this.keterangan = keterangan;
    }

    public int getIdPerawatan() {
        return idPerawatan;
    }

    public void setIdPerawatan(int idPerawatan) {
        this.idPerawatan = idPerawatan;
    }

    public String getNamaAsset() {
        return namaAsset;
    }

    public void setNamaAsset(String namaAsset) {
        this.namaAsset = namaAsset;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public Date getTanggalPerawatan() {
        return tanggalPerawatan;
    }

    public void setTanggalPerawatan(Date tanggalPerawatan) {
        this.tanggalPerawatan = tanggalPerawatan;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    
    
        
}
