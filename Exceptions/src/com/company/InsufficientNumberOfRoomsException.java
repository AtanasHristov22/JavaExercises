package com.company;

public class InsufficientNumberOfRoomsException extends Exception {
    int numberOfRooms;

    public InsufficientNumberOfRoomsException(){
    }

    public InsufficientNumberOfRoomsException(int numberOfRooms){this.numberOfRooms=numberOfRooms;}

    public int getNumberOfRooms(){return numberOfRooms;}

    @Override
    public String toString() {
        return "InsufficientNumberOfRoomsException{" +
                "numberOfRooms=" + numberOfRooms +
                '}';
    }
}
