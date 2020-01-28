package com.company;

public class Hotel {
    int numberOfRooms;
    int[] rooms;

    public Hotel(int numberOfRooms) { this.numberOfRooms = numberOfRooms; }

    public void hireRoom(int roomNumber)throws InsufficientNumberOfRoomsException{
        if(rooms==null){
            rooms=new int[1];
            rooms[0]=roomNumber;
        }
        else{
            if(rooms.length >= numberOfRooms){
                throw new InsufficientNumberOfRoomsException(numberOfRooms);
            }
            int newRooms[]=new int [rooms.length+1];
            System.arraycopy(rooms,0,newRooms,0,rooms.length);
            newRooms[rooms.length]= roomNumber;
            rooms=newRooms.clone();
        }
    }
    public void printHiredRooms(){
        for(int roomNumber:rooms){
            System.out.println(roomNumber);
        }
    }
}
