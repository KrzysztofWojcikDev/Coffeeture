package com.example.coffeeture.DrinkClass;

public class Ristretto {

    private int amountOfCoffee = 40;
    private String name = "Ristretto";
    private final String type = "Ristretto";
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
