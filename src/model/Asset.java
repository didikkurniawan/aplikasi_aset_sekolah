/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Java
 */
public class Asset {
   private int idAsset;
   private String jenisAsset;
   private String nama;
   private String markAsset;
   private String warnaAsset;
   private Date tanggal;
   private Double harga;
   private String lokasi;
   private String namaPetugas;
    

    public  Asset() {
    }

    public Asset(int idAsset, String jenisAsset, String nama, String markAsset, String warnaAsset, Date tanggal, Double harga, String lokasi, String namaPetugas ) {
        this.idAsset = idAsset;
        this.jenisAsset = jenisAsset;
        this.nama = nama;
        this.markAsset = markAsset;
        this.warnaAsset = warnaAsset;
        this.tanggal = tanggal;
        this.harga = harga;
        this.lokasi = lokasi;
        this.namaPetugas = namaPetugas;
    }

    public int getIdAsset() {
        return idAsset;
    }

    public void setIdAsset(int idAsset) {
        this.idAsset = idAsset;
    }

    public String getJenisAsset() {
        return jenisAsset;
    }

    public void setJenisAsset(String jenisAsset) {
        this.jenisAsset = jenisAsset;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMarkAsset() {
        return markAsset;
    }

    public void setMarkAsset(String markAsset) {
        this.markAsset = markAsset;
    }

    public String getWarnaAsset() {
        return warnaAsset;
    }

    public void setWarnaAsset(String warnaAsset) {
        this.warnaAsset = warnaAsset;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

   
}
