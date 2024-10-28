/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forumpboweek5;

/**
 *
 * @author RANGGA ADITYA
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void buatBooking(Kendaraan kendaraan) {
        Booking booking = new Booking(this, kendaraan);
        System.out.println(booking.getBookingDetails());
    }
}


