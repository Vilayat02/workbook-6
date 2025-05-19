package com.pluralsight.finance;

public class House extends FixedAsset{
    private int yerBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int yerBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yerBuilt = yerBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getYerBuilt() {
        return yerBuilt;
    }

    public void setYerBuilt(int yerBuilt) {
        this.yerBuilt = yerBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
