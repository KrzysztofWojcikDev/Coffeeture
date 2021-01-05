package com.example.coffeeture.DrinkClass;

import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;
import com.example.coffeeture.Enums.WhatFirst;
import com.example.coffeeture.R;

public final class Milk extends Drink{

    private final int amountOfCoffee = 0;
    private final int amountOfHotWater = 0;
    private final Enum cupsQuantity = CupsQuantity.VOID;
    private final Enum whatFirst= WhatFirst.VOID;
    private final Enum aromaProfile = AromaProfile.VOID;
    private final String type = "Milk";
    private final int imageResourceId = R.id.imageViewMilk;

    private int amountOfMilkFoam ;
    private int amountOfMilk ;
    private String name ;
    private Enum temperatureOfDrink ;


    private Milk(Builder builder){
    this.amountOfMilkFoam = builder.amountOfMilkFoam;
    this.amountOfMilk = builder.amountOfMilk;
    this.name = builder.name;
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

    @Override
    public int getImageResourceId() {
        return imageResourceId;
    }
    public static class Builder extends Drink.Builder{

        //default values in case when the client will initiate an Coffee object without called set methods
        private int amountOfMilkFoam = 50;
        private int amountOfMilk = 100;
        private String name ="Milk";
        private Enum temperatureOfDrink = TemperatureOfDrink.WARM;

        //set method available for the client
        public Builder setAmountOfMilkFoam(int amountOfMilkFoam){
            this.amountOfMilkFoam = amountOfMilkFoam;
            return this;
        }
        public Builder setAmountOfMilk(int amountOfMilk){
            this.amountOfMilk = amountOfMilk;
            return this;
        }
        public Builder setNameOfDrink(String name){
            this.name = name;
            return this;
        }
        public Builder setTemperatureOfDrink(TemperatureOfDrink temperatureOfDrink){
            this.temperatureOfDrink = temperatureOfDrink;
            return this;
        }

        @Override
        public Milk build() {
            return new Milk(this);
        }
    }
}

