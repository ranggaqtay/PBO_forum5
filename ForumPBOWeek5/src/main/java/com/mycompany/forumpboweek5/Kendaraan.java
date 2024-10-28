/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forumpboweek5;

/**
 *
 * @author RANGGA ADITYA
 */
public class Kendaraan {
    protected String merk;
    protected String platKendaraan;
    protected String namaSupir;
    protected int kapasitasKendaraan;
    protected String tujuan;

    public Kendaraan(String merk, String platKendaraan, String namaSupir, int kapasitasKendaraan, String tujuan) {
        this.merk = merk;
        this.platKendaraan = platKendaraan;
        this.namaSupir = namaSupir;
        this.kapasitasKendaraan = kapasitasKendaraan;
        this.tujuan = tujuan;
    }

    public String getDetails() {
        return "Merk: " + merk + ", Plat: " + platKendaraan + ", Supir: " + namaSupir +
               ", Kapasitas: " + kapasitasKendaraan + ", Tujuan: " + tujuan;
    }
}



