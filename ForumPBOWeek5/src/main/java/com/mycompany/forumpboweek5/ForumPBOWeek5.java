/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forumpboweek5;

/**
 *
 * @author RANGGA ADITYA
 */
public class ForumPBOWeek5 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", "B 1234 XYZ", "Rangga", 4, "Jakarta");
        Motor motor = new Motor("Yamaha", "B 4321 ZYX", "Wiraldy", 2, "Bandung");
        Bus bus = new Bus("Mercedes", "B 5678 ABC", "Candra", 40, "Surabaya");

        Perusahaan perusahaan = new Perusahaan("PT Tarutung Jaya");
        perusahaan.tambahKendaraan(mobil);
        perusahaan.tambahKendaraan(motor);
        perusahaan.tambahKendaraan(bus);

        perusahaan.getKendaraanList();

        Customer customer = new Customer("rangga dan wiraldy familia");
        customer.buatBooking(mobil);  
    }
}

