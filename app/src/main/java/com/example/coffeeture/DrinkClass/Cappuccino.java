package com.example.coffeeture.DrinkClass;

import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;
import com.example.coffeeture.Enums.WhatFirst;

public class Cappuccino {

    private int amountOfMilkFoam = 50;
    private int amountOfMilk = 100;
    private int amountOfCoffee = 50;
    private String name = "Cappuccino";
    private final String type = "Cappuccino";
    private Enum whatFirst = WhatFirst.MILK;
    private Enum cupsQuantity = CupsQuantity.ONE;
    private Enum aromaProfile = AromaProfile.INTENSE;
    private Enum temperatureOfDrink = TemperatureOfDrink.WARM;
}
