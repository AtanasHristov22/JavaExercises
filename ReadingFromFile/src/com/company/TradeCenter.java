package com.company;

public class TradeCenter {
    private String name;
    transient protected String address;
    protected static double tax;

    public TradeCenter(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "TradeCenter{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
