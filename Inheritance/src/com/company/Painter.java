package com.company;

public class Painter extends Creator {
    private int numberOfPaintingsSold;

    public Painter(int numberOfPaintingsSold){this.numberOfPaintingsSold=numberOfPaintingsSold;}

    public int getNumberOfPaintingsSold(){return numberOfPaintingsSold;}
    public void setNumberOfPaintingsSold(int numberOfPaintingsSold){this.numberOfPaintingsSold=numberOfPaintingsSold;}

    public void addPainting(Painting painting){ goodsList.add(painting); }

    @Override
    public double totalEarnings(){
        double totalEarnings=0;
        for(Goods goods:goodsList){
            if(goods!=null){
                totalEarnings+=goods.salesPrice();
            }
        }
        return totalEarnings;
    }

    @Override
    public String toString() {
        return super.toString()+"Painter{" +
                "numberOfPaintingsSold=" + numberOfPaintingsSold + '}';
    }
}
