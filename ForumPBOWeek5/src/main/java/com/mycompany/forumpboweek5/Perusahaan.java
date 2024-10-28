/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forumpboweek5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RANGGA ADITYA
 */
public class Perusahaan {
    private String namaPerusahaan;
    private List<Kendaraan> kendaraanList = new ArrayList<>();

    public Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public void getKendaraanList() {
        System.out.println("Daftar Kendaraan di " + namaPerusahaan + ":");
        for (Kendaraan kendaraan : kendaraanList) {
            System.out.println(kendaraan.getDetails());
        }
    }
}


