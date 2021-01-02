package com.example.coffeeture.DrinkClass;

import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;
import com.example.coffeeture.Enums.WhatFirst;

public final class Milk extends Drink{

    private final int amountOfCoffee = 0;
    private final int amountOfHotWater = 0;
    private final Enum cupsQuantity = CupsQuantity.VOID;
    private final Enum whatFirst= WhatFirst.VOID;
    private final Enum aromaProfile = AromaProfile.VOID;
    private final String type = "Milk";
    private int amountOfMilkFoam = 50;
    private int amountOfMilk = 100;
    private String name = type;
    private Enum temperatureOfDrink = TemperatureOfDrink.WARM;
}
