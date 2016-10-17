/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bahrie
 */
public class Petugas {

    private int id;
    private String nama;
    private String jabatan;
    private String password;
    private String akses;

    public Petugas() {
    }

    public Petugas(int id, String nama, String jabatan, String password, String akses) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.password = password;
        this.akses = akses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAkses() {
        return akses;
    }

    public void setAkses(String akses) {
        this.akses = akses;
    }
    
    
    

    
    }
