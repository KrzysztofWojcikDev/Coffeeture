package com.example.coffeeture.DrinkClass;

public abstract class Drink {

     abstract static class Builder{

         abstract Drink build();
     }
    public abstract int getAmountOfMilkFoam();

    public abstract int getAmountOfMilk();

    public abstract int getAmountOfHotWater();

    public abstract Enum getWhatFirst();

    public abstract String getType();

    public abstract int getAmountOfCoffee();

    public abstract String getName();

    public abstract Enum getCupsQuantity();

    public abstract Enum getAromaProfile();

    public abstract Enum getTemperatureOfDrink();

}