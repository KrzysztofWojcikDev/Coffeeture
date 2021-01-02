package com.example.coffeeture.DrinkClass;

import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;
import com.example.coffeeture.Enums.WhatFirst;

public final class Latte extends Drink{
    private final int amountOfHotWater = 0;
    private final Enum cupsQuantity = CupsQuantity.VOID;
    private final String type = "Latte";

    private int amountOfMilkFoam;
    private int amountOfMilk;
    private int amountOfCoffee;
    private String name;
    private Enum whatFirst;
    private Enum aromaProfile;
    private Enum temperatureOfDrink;

    private Latte(Builder builder){
        this.amountOfCoffee = builder.amountOfCoffee;
        this.amountOfMilk = builder.amountOfMilk;
        this.amountOfMilkFoam = builder.amountOfMilkFoam;
        this.name = builder.name;
        this.whatFirst = builder.whatFirst;
        this.aromaProfile = builder.aromaProfile;
        this.temperatureOfDrink = builder.temperatureOfDrink;

    }
    public static class Builder extends Drink.Builder{

        //default values in case when the client will initiate an Coffee object without called set methods
        private int amountOfMilkFoam = 50;
        private int amountOfMilk = 100;
        private int amountOfCoffee = 100;
        private String name = "Latte";
        private Enum whatFirst = WhatFirst.MILK;
        private Enum aromaProfile = AromaProfile.INTENSE;
        private Enum temperatureOfDrink = TemperatureOfDrink.WARM;

        //set method available for the client
        public Builder setAmountOfCoffee(int amountOfCoffee){
            this.amountOfCoffee = amountOfCoffee;
            return this;
        }
        public Builder setAmountOfMilk(int amountOfMilk){
            this.amountOfMilk = amountOfMilk;
            return this;
        }
        public Builder setAmountOfMilkFoam(int amountOfMilkFoam){
            this.amountOfMilkFoam = amountOfMilkFoam;
            return this;
        }
        public Builder setNameOfDrink(String name){
            this.name = name;
            return this;
        }
        public Builder setWhatFirst(WhatFirst whatFirst){
            this.whatFirst = whatFirst;
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
        public Latte build() {
            return new Latte(this);
        }
    }
}
