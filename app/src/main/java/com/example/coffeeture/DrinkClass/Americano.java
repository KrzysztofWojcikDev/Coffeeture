package com.example.coffeeture.DrinkClass;

public class Americano {

    private int amountOfCoffee = 100;
    private int amountOfHotWater = 150;
    private String name = "Americano";
    private final String type = "Americano";
    private enum aromaProfile{
        DYNAMIC,STATIC,INTENSE;
    }
    private enum temperatureOfDrink{
        NORMAL,WARM,HOT;
    }
    private enum whatFirst{
        WATER,COFFEE;
    }


}
