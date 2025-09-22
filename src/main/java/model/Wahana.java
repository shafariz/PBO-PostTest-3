/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Wahana {
    private String nama;
    private String lokasi;
    private int harga;

    // Constructor
    public Wahana(String nama, String lokasi, int harga) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.harga = harga;
    }

    // Getter dan Setter (Encapsulation)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Bisa dioverride oleh subclass
    @Override
    public String toString() {
        return nama + " - " + lokasi + " - Rp" + harga;
    }
}