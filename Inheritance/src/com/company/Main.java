package com.company;


public class Main {

    public static void main(String[] args) {
        Goods goods=new Vehicle(2,2,2);
        Vehicle vehicle1=new Vehicle(1,2,3);
        Painting painting1=new Painting(4,5,6);

        System.out.println(goods.toString() + "total cost is=" + goods.totalCost() + "sales price is=" + goods.salesPrice());
        System.out.println();
        System.out.println(vehicle1.toString() + "total cost is=" + vehicle1.totalCost() + "sales price is=" + vehicle1.salesPrice());
        System.out.println();
        System.out.println(painting1.toString() + "total cost is=" + painting1.totalCost() + "sales price is=" + painting1.salesPrice());


        Painter painter1=new Painter(5);
        Engineer engineer1=new Engineer(20,500);


        for(int i=0;i<5;i++){
            painter1.addPainting(new Painting(5,4*(i+1),3*(i+1)%8));
            engineer1.addVehicle(new Vehicle(5,4*(i+1),3*(i+1)%6));
        }
        System.out.println(painter1 + " Goods created: ");
        painter1.displayGoods();
        System.out.println(painter1.toString() + " total earnings " + painter1.totalEarnings());
        System.out.println();

        System.out.println(engineer1 + " Goods created: ");
        engineer1.displayGoods();
        System.out.println(engineer1.toString() + " total earnings " + engineer1.totalEarnings());
    }
}
