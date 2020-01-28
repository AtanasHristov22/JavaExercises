package com.company;

import java.util.PriorityQueue;

public class OnlineShop {
    private String name;
    private PriorityQueue<Order> listOfOrders;

    public OnlineShop(){
        name = "No name";
        listOfOrders = new PriorityQueue<>();
    }

    public OnlineShop(String name) {
        this.name = name;
        this.listOfOrders = new PriorityQueue<>();
    }

    public OnlineShop(String name, PriorityQueue<Order> listOfOrders) {
        this.name = name;
        this.listOfOrders = new PriorityQueue<>();
    }

    void addOrder(Order order){
        listOfOrders.offer(order);
    }

    public void displayOrders(){
        if(listOfOrders.isEmpty()){
            System.out.println("There are no orders!!");
        } else {
            System.out.println(listOfOrders);
        }
    }

    public void removeOrder(){
        System.out.println("Removing this order: " + listOfOrders.poll());
    }

    public void removeAllOrders(){
        if(listOfOrders.isEmpty()){
            System.out.println("There are no orders!!");
        }else {
            Order polled;
            while((polled = listOfOrders.poll()) != null){
                System.out.println("Removing this order: " + polled);
            }
        }
    }

    @Override
    public String toString() {
        return "OnlineShop{" +
                "name='" + name + '\'' +
                ", listOfOrders=" + listOfOrders +
                '}';
    }
}
