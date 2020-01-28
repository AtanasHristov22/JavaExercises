package com.company;

public class Point {
    private double x;
    private double y;

    public Point(){

    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){return x;}
    public double getY(){return y;}

    public void Sum(){
        MyNumber myNumber = (x, y) -> {
            System.out.println(x + y);
            return x + y;
        };
        myNumber.getValue(x,y);
    }
}
