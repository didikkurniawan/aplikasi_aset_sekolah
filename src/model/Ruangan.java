 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DidikKurniawan
 */
public class Ruangan {
    private int idRuangan;
    private String namaRuangan;
    private String jenisRuangan;
    private String lokasi;
    private String namaPetugas;

    public Ruangan() {
    }

    public Ruangan(int idRuangan, String namaRuangan, String jenisRuangan, String lokasi, String namaPetugas) {
        this.idRuangan = idRuangan;
        this.namaRuangan = namaRuangan;
        this.jenisRuangan = jenisRuangan;
        this.lokasi = lokasi;
        this.namaPetugas = namaPetugas;
    }

    public int getIdRuangan() {
        return idRuangan;
    }

    public void setIdRuangan(int idRuangan) {
        this.idRuangan = idRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    public String getJenisRuangan() {
        return jenisRuangan;
    }

    public void setJenisRuangan(String jenisRuangan) {
        this.jenisRuangan = jenisRuangan;
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
