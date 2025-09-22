/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class WahanaDarat extends Wahana {
    public WahanaDarat(String nama, String lokasi, int harga) {
        super(nama, lokasi, harga);
    }

    // Overriding
    @Override
    public String toString() {
        return "[Wahana Darat] " + super.toString();
    }
}
