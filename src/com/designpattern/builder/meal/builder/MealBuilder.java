package com.designpattern.builder.meal.builder;

import com.designpattern.builder.item.impl.burger.ChickenBurger;
import com.designpattern.builder.item.impl.burger.VegBurger;
import com.designpattern.builder.item.impl.drink.Coke;
import com.designpattern.builder.item.impl.drink.Tea;
import com.designpattern.builder.meal.Meal;

public class MealBuilder {
    // 蔬菜汉堡+可乐
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    // 鸡肉汉堡+茶
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Tea());
        return meal;
    }
}
