package org.pdev.Model;

import org.pdev.realty.IRealEstate;

public class House implements IRealEstate {

    private double price;
    private double squareMeter;
    private int numberOfRooms;
    private int numberOfLivingRooms;
    private String type;

    public House(double price, double squareMeter, int numberOfRooms, int numberOfLivingRooms, String type) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
        this.type=type;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getSquareMeter() {
        return this.squareMeter;
    }

    @Override
    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    @Override
    public int getNumberOfLivingRooms() {
        return this.numberOfLivingRooms;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
