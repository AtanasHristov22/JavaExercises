package com.company;

public class Vehicle extends Goods {
    private double materialCost;
    private double honoraiumCost;

    public Vehicle(double overCharge, double materialCost, double honoraiumCost) {
        super(overCharge);
        this.materialCost = materialCost;
        this.honoraiumCost = honoraiumCost;
    }
    @Override
    public double totalCost(){return materialCost+honoraiumCost;}

    @Override
    public String toString() {
        return super.toString() + "Vehicle{" +
                "materialCost=" + materialCost +
                ", honoraiumCost=" + honoraiumCost +
                '}';
    }
}

