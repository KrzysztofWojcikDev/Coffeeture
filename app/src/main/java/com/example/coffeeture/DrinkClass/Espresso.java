package com.example.coffeeture.DrinkClass;

public class Espresso {

    private int amountOfCoffee = 80;
    private String name = "Espresso";
    private final String type = "Espresso";
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
