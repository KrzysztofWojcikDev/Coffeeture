package com.example.coffeeture.DrinkClass;

public class Coffee {

    private int amountOfCoffee = 200;
    private String name = "Coffee";
    private final String type = "Coffee";
    private enum aromaProfile{
        DYNAMIC,STATIC,INTENSE
    }
    private enum temperatureOfDrink{
        NORMAL,WARM,HOT
    }
    private enum cupsQuantity{
        ONE,TWO
    }
}
