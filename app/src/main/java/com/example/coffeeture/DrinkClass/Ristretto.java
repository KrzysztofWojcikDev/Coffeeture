package com.example.coffeeture.DrinkClass;

import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;
import com.example.coffeeture.Enums.WhatFirst;

public final class Ristretto extends Drink{
    private final int amountOfMilkFoam = 0;
    private final int amountOfMilk = 0;
    private final int amountOfHotWater = 0;
    private final Enum whatFirst = WhatFirst.VOID;
    private final String type = "Ristretto";

    private int amountOfCoffee;
    private String name;
    private Enum cupsQuantity;
    private Enum aromaProfile;
    private Enum temperatureOfDrink;

    private Ristretto(Builder builder){
        this.amountOfCoffee = builder.amountOfCoffee;
        this.name = builder.name;
        this.cupsQuantity = builder.cupsQuantity;
        this.aromaProfile = builder.aromaProfile;
        this.temperatureOfDrink = builder.temperatureOfDrink;
    }

    public static class Builder extends Drink.Builder{

        //default values in case when the client will initiate an Coffee object without called set methods
        private int amountOfCoffee = 80;
        private String name = "Espresso";
        private Enum cupsQuantity = CupsQuantity.ONE;
        private Enum aromaProfile = AromaProfile.INTENSE;
        private Enum temperatureOfDrink = TemperatureOfDrink.WARM;

        //set method available for the client
        public Builder setAmountOfCoffee(int amountOfCoffee){
            this.amountOfCoffee = amountOfCoffee;
            return this;
        }
        public Builder setNameOfDrink(String name){
            this.name = name;
            return this;
        }
        public Builder setCupsQuantity(CupsQuantity cupsQuantity){
            this.cupsQuantity = cupsQuantity;
            return this;
        }
        public Builder setAromaProfile(AromaProfile aromaProfile){
            this.aromaProfile = aromaProfile;
            return this;
        }
        public Builder setTemperatureOfDrink(TemperatureOfDrink temperatureOfDrink){
            this.temperatureOfDrink = temperatureOfDrink;
            return this;
        }

        @Override
        public Ristretto build() {
            return new Ristretto(this);
        }
    }

}
