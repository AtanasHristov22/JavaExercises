package com.company;


public class Order implements Comparable<Order>{
    private String name;
    private Priority priority;

    public Order(){
        name = "No name";
        priority = Priority.MEDIUM;
    }

    public Order(String name){
        this.name = name;
        this.priority = Priority.MEDIUM;
    }

    public Order(String name, Priority priority){
        this.name = name;
        this.priority = priority;
    }

    public String getName(){
        return name;
    }

    public Priority getPriority(){
        return priority;
    }

    @Override
    public String toString(){
        return "Order{ " + "name: " + name + ", priority: " + priority + '}';
    }
    @Override
    public int compareTo(Order order){
        return this.priority.compareTo(order.priority);
    }
}
