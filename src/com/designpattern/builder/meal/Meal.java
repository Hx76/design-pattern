package com.designpattern.builder.meal;

import com.designpattern.builder.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> list = new ArrayList<Item>();

    public void addItem(Item item){
        list.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item i:list) {
            cost += i.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item i:list) {
            System.out.println("名称："+i.name());
            System.out.println("包装："+i.packing().pack());
            System.out.println("单价："+i.price());
        }
        System.out.println("总价："+getCost());
    }
}
