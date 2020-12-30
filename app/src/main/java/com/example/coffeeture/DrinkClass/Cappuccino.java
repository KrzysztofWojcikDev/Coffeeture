package com.example.coffeeture.DrinkClass;

public class Cappuccino {

    private int amountOfMilkFoam = 50;
    private int amountOfMilk = 100;
    private int amountOfCoffee = 50;
    private String name = "Cappuccino";
    private final String type = "Cappuccino";
    private enum aromaProfile{
        DYNAMIC,STATIC,INTENSE;
    }
    private enum temperatureOfDrink{
        NORMAL,WARM,HOT;
    }
    private enum whatFirst{
        MILK,COFFEE;
    }
    private enum cupsQuantity{
        ONE,TWO;
    }
}
