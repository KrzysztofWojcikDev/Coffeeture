package com.example.coffeeture.DrinkClass;

import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;
import com.example.coffeeture.Enums.WhatFirst;

public class Americano {

    private int amountOfCoffee = 100;
    private int amountOfHotWater = 150;
    private String name = "Americano";
    private final String type = "Americano";
    private Enum whatFirst = WhatFirst.COFFEE;
    private Enum cupsQuantity = CupsQuantity.ONE;
    private Enum aromaProfile = AromaProfile.INTENSE;
    private Enum temperatureOfDrink = TemperatureOfDrink.WARM;
}
