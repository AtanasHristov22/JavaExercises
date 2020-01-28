package com.company;

public class Box {
    double width;
    double hight;
    double depth;

    public Box(){

    }

    public Box(double width,double hight,double depth){
        this.width=width;
        this.hight=hight;
        this.depth=depth;
    }

   double volume() {return this.width*this.hight*this.depth;}

   void increaseDimensions(double increaseNumber){
        if(increaseNumber<0 || increaseNumber>100){
            throw new IllegalArgumentException("The value of the argument must be between 0 and 100. The argument is:" + increaseNumber);
        }
        else{
            this.width+=this.width*increaseNumber/100;
            this.hight+=this.hight*increaseNumber/100;
            this.depth+=this.depth*increaseNumber/100;
        }
   }

   void conditionalIncreaseDimensions(double increaseNumber, double volumeNumber){
        try{
            if(volume()<=volumeNumber){
                increaseDimensions(increaseNumber);
            }
        }
        catch(IllegalArgumentException e){
            System.err.println("caught" + e);
        }
   }


    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", hight=" + hight +
                ", depth=" + depth +
                '}';
    }
}
