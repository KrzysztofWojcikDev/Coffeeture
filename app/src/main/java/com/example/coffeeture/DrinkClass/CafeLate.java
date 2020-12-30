package com.example.coffeeture.DrinkClass;

public class CafeLate {

    private int amountOfMilk = 150;
    private int amountOfCoffee = 50;
    private String name = "Cafe Late";
    private final String type = "Cafe Late";
    private enum aromaProfile{
        DYNAMIC,STATIC,INTENSE
    }
    private enum temperatureOfDrink{
        NORMAL,WARM,HOT
    }
    private enum whatFirst{
        MILK,COFFEE
    }
    private enum cupsQuantity{
        ONE,TWO
    }
}
