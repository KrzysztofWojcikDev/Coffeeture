package com.example.coffeeture.DrinkClass;

import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;
import com.example.coffeeture.Enums.WhatFirst;
import com.example.coffeeture.R;

public final class Lungo extends Drink {

    private final int amountOfMilkFoam = 0;
    private final int amountOfMilk = 0;
    private final int amountOfHotWater = 0;
    private final Enum whatFirst = WhatFirst.VOID;
    private final String type = "Lungo";
    private final int imageResourceId = R.id.imageViewLungo;

    private int amountOfCoffee;
    private String name;
    private Enum cupsQuantity;
    private Enum aromaProfile;
    private Enum temperatureOfDrink;

    private Lungo(Builder builder){
        this.amountOfCoffee = builder.amountOfCoffee;
        this.name = builder.name;
        this.cupsQuantity = builder.cupsQuantity;
        this.aromaProfile = builder.aromaProfile;
        this.temperatureOfDrink = builder.temperatureOfDrink;
    }

    @Override
    public int getAmountOfMilkFoam() {
        return amountOfMilkFoam;
    }

    @Override
    public int getAmountOfMilk() {
        return amountOfMilk;
    }

    @Override
    public int getAmountOfCoffee() {
        return amountOfCoffee;
    }

    @Override
    public int getAmountOfHotWater() {
        return amountOfHotWater;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Enum getWhatFirst() {
        return whatFirst;
    }

    @Override
    public Enum getCupsQuantity() {
        return cupsQuantity;
    }

    @Override
    public Enum getAromaProfile() {
        return aromaProfile;
    }

    @Override
    public Enum getTemperatureOfDrink() {
        return temperatureOfDrink;
    }


    public static class Builder extends Drink.Builder{

        //default values in case when the client will initiate an Coffee object without called set methods
        private int amountOfCoffee = 120;
        private String name = "Lungo";
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
        public Lungo build() {
            return new Lungo(this);
        }
    }
}
