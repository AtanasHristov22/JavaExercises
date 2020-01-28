package com.company;

public abstract class Goods {
    protected double overCharge;

    public Goods(double overCharge){this.overCharge=overCharge;}

    public abstract double totalCost();

    public double salesPrice(){return totalCost()+totalCost()*overCharge/100;}

    @Override
    public String toString() {
        return "Goods{" +
                "overCharge=" + overCharge +
                '}';
    }
}
