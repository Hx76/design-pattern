package com.designpattern.builder.test;

import com.designpattern.builder.meal.Meal;
import com.designpattern.builder.meal.builder.MealBuilder;

public class BuilderMain {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
    }
}
