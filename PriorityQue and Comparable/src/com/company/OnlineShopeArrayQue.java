package com.company;

import java.util.ArrayDeque;

public class OnlineShopeArrayQue {
    private String name;
    private ArrayDeque<Order> arrayDequeOfOrders;

    public OnlineShopeArrayQue(){
        name = "No Name";
        arrayDequeOfOrders = new ArrayDeque<>();
    }
    public OnlineShopeArrayQue(String name){
        this.name = name;
        arrayDequeOfOrders = new ArrayDeque<>();
    }
    public OnlineShopeArrayQue(String name, ArrayDeque<Order> arrayDequeOfOrders){
        this.name = name;
        this.arrayDequeOfOrders = new ArrayDeque<>();
    }

    public String getName(){
        return name;
    }

    public void addOrder(Order order){
        arrayDequeOfOrders.offer(order);
    }
    public void removeOrder(){
        System.out.println("Removing this order: " + arrayDequeOfOrders.remove());
    }
    public void removeAllOrders(){
        if(arrayDequeOfOrders.isEmpty()){
            System.out.println("There are no orders!!");
        }else {
        int size = arrayDequeOfOrders.size();
        for(int i = 0; i < size; i++){
            System.out.println("Removing this order: " + arrayDequeOfOrders.remove());
        }
        }
    }

    public void displayOrders(){
        if(arrayDequeOfOrders.isEmpty()){
            System.out.println("There are no orders!!");
        }else {
            System.out.println(arrayDequeOfOrders);
        }
    }

    @Override
    public String toString() {
        return "OnlineShopeArrayQue{" +
                "name='" + name + '\'' +
                ", arrayDequeOfOrders=" + arrayDequeOfOrders +
                '}';
    }
}
