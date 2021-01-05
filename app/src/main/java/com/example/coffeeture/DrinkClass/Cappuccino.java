package com.example.coffeeture.DrinkClass;

import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;
import com.example.coffeeture.Enums.WhatFirst;
import com.example.coffeeture.R;

public final class Cappuccino extends Drink{

    private final int amountOfHotWater = 0;
    private final String type = "Cappuccino";
    private final int imageResourceId = R.id.imageViewCoappuccino;

    private int amountOfMilkFoam = 50;
    private int amountOfMilk = 100;
    private int amountOfCoffee = 50;
    private String name = type;
    private Enum whatFirst = WhatFirst.MILK;
    private Enum cupsQuantity = CupsQuantity.ONE;
    private Enum aromaProfile = AromaProfile.INTENSE;
    private Enum temperatureOfDrink = TemperatureOfDrink.WARM;

    private Cappuccino(Builder builder){
        this.amountOfCoffee = builder.amountOfCoffee;
        this.amountOfMilk = builder.amountOfMilk;
        this.amountOfMilkFoam = builder.amountOfMilkFoam;
        this.name = builder.name;
        this.whatFirst = builder.whatFirst;
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

    @Override
    public int getImageResourceId() {
        return imageResourceId;
    }
    public static class Builder extends Drink.Builder{

        //default values in case when the client will initiate an Coffee object without called set methods
        private int amountOfMilkFoam = 50;
        private int amountOfMilk = 100;
        private int amountOfCoffee = 50;
        private String name ="Cappuccino";
        private Enum whatFirst = WhatFirst.MILK;
        private Enum cupsQuantity = CupsQuantity.ONE;
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
        public Cappuccino build() {
            return new Cappuccino(this);
        }
    }
}
