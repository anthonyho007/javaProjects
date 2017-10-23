package com.company;

public class Guitar {
    private String serialNumber;
    private GuitarSpec specs;
    private double price;

    public Guitar ( String serialNumber, double price, GuitarSpec specs){
        this.serialNumber = serialNumber;
        this.price = price;
        this.specs = specs;
    }
    public String getserialNumber(){
        return serialNumber;
    }

    public double getPrice(){ return price; }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getSpecs(){ return specs;}

}
