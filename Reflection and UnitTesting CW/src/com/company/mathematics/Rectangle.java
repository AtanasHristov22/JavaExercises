package com.company.mathematics;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {
    private int side1;
    private int side2;

    public Rectangle(){

    }

    public Rectangle(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1(){return side1;}
    public void setSide1(int side1){this.side1=side1;}

    public int getSide2(){return side2;}
    public void setSide2(int side2) throws ArithmeticException{
        if(side2 < 0){
           throw new ArithmeticException("The side2 has to be non negative number!");
        }
        this.side2 = side2;
    }
    public void increaseSides(int increase) throws ArithmeticException{
        if(increase < 0){
            throw new ArithmeticException("The increase has to be non negative number!");
        }
    }
    public List<Integer> increaseSide1(){
        List increaseSide = new ArrayList();
        for(int i=0; i < 100; i++){
            increaseSide.add(side1 + i);
        }
        return increaseSide;
    }

    public int perimeter(){
        return 2*(side1+side2);
    }
    public int area(){
        return side1+side2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
