package com.company;


public class Main {

    public static void main(String[] args) {
        //Task 1 box
    Box box1=new Box(10,5,2);

    System.out.println(box1.toString());
    System.out.println(box1.volume());

    box1.increaseDimensions(5);
    System.out.println(box1.toString());

    box1.conditionalIncreaseDimensions(10,150);
    System.out.println(box1.toString());

        //Task 2 hotel

    Hotel hotel1=new Hotel(10);
    hotel1.printHiredRooms();
    }
}
