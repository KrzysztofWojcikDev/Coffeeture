package com.example.coffeeture.DrinkClass;

public class Lungo {

    private int amountOfCoffee = 120;
    private String name = "Lungo";
    private final String type = "Lungo";
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
