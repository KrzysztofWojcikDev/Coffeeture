package com.example.coffeeture.DrinkClass;

import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;

public class Coffee {

    private int amountOfCoffee = 200;
    private String name = "Coffee";
    private final String type = "Coffee";
    private Enum cupsQuantity = CupsQuantity.ONE;
    private Enum aromaProfile = AromaProfile.INTENSE;
    private Enum temperatureOfDrink = TemperatureOfDrink.WARM;
}
