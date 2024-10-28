/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forumpboweek5;

/**
 *
 * @author RANGGA ADITYA
 */
public class Booking {
    private Customer customer;
    private Kendaraan kendaraan;

    public Booking(Customer customer, Kendaraan kendaraan) {
        this.customer = customer;
        this.kendaraan = kendaraan;
    }

    public String getBookingDetails() {
        return "Booking by: " + customer.getName() + " for " + kendaraan.getDetails();
    }
}

