package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Creator implements Provider {
    protected List<Goods> goodsList;

    public Creator(){goodsList=new ArrayList<>();}

    public void displayGoods(){
     for(Goods goods: goodsList){
         System.out.println(goods.toString());
         System.out.println("Total cost: " + goods.totalCost());
         System.out.println("Sales price: "+goods.salesPrice());
     }
    }

    @Override
    public String toString() {
        return "Creator{" +
                "goodsList=" + goodsList +
                '}';
    }
}


