package com.example.coffeeture.DrinkClass;

public class Latte {

    private int amountOfMilkFoam = 50;
    private int amountOfMilk = 100;
    private int amountOfCoffee = 100;
    private String name = "Latte";
    private final String type = "Latte";
    private enum aromaProfile{
        DYNAMIC,STATIC,INTENSE
    }
    private enum temperatureOfDrink{
        NORMAL,WARM,HOT
    }
    private enum whatFirst{
        MILK,COFFEE
    }

}
