package com.company;

public class Painting extends Goods {
    private int paintsQuantity;
    private double paintPrice;

    public Painting(double overCharge, int paintsQuantity, double paintPrice) {
        super(overCharge);
        this.paintsQuantity = paintsQuantity;
        this.paintPrice = paintPrice;
    }
    @Override
    public double totalCost(){return paintsQuantity*paintPrice;}

    @Override
    public String toString() {
        return super.toString() + "Painting{" +
                "paintsQuantity=" + paintsQuantity +
                ", paintPrice=" + paintPrice +
                '}';
    }
}
