package com.example.coffeeture.ViewModels;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.coffeeture.DrinkClass.Drink;
import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;
import com.example.coffeeture.Enums.WhatFirst;

public class ViewModelFactorySettingDrink<T extends Drink> implements ViewModelProvider.Factory, Parcelable {


    private final int amountOfMilkFoam;
    private final int amountOfMilk;
    private final int amountOfCoffee;
    private final int amountOfHotWater;
    private final int imageId;
    private final Enum<?> aroma;
    private final Enum<?> temperature;
    private final Enum<?> whatFirst;
    private final Enum<?> cupsQuantity;
    private final String name;
    private final String type;



    public ViewModelFactorySettingDrink(T drink){

       this.amountOfMilkFoam = drink.getAmountOfMilkFoam();
       this.amountOfMilk = drink.getAmountOfMilk();
       this.amountOfCoffee = drink.getAmountOfCoffee();
       this.amountOfHotWater = drink.getAmountOfHotWater();
       this.imageId = drink.getImageResourceId();
       this.aroma = drink.getAromaProfile();
       this.temperature = drink.getTemperatureOfDrink();
       this.cupsQuantity = drink.getCupsQuantity();
       this.whatFirst = drink.getWhatFirst();
       this.name = drink.getName();
       this.type = drink.getType();


    }

    protected ViewModelFactorySettingDrink(Parcel in) {
        amountOfMilkFoam = in.readInt();
        amountOfMilk = in.readInt();
        amountOfCoffee = in.readInt();
        amountOfHotWater = in.readInt();
        imageId = in.readInt();
        name = in.readString();
        type = in.readString();
        aroma = AromaProfile.valueOf(in.readString());
        temperature = TemperatureOfDrink.valueOf(in.readString());
        whatFirst = WhatFirst.valueOf(in.readString());
        cupsQuantity = CupsQuantity.valueOf(in.readString());

    }

    public static final Creator<ViewModelFactorySettingDrink<?>> CREATOR = new Creator<ViewModelFactorySettingDrink<?>>() {
        @Override
        public ViewModelFactorySettingDrink<?> createFromParcel(Parcel in) {
            return new ViewModelFactorySettingDrink<>(in);
        }

        @Override
        public ViewModelFactorySettingDrink<?>[] newArray(int size) {
            return new ViewModelFactorySettingDrink[size];
        }
    };

    @NonNull
    @Override
    public <S extends ViewModel> S create(@NonNull Class<S> modelClass) {

            ViewModelSettingDrink<?> viewModelSettingDrink = new ViewModelSettingDrink.ViewModelSettingDrinkBuilder()
                    .setAmountOfMilkFoamAttributes(amountOfMilkFoam)
                    .setAmountOfMilkAttributes(amountOfMilk)
                    .setAmountOfCoffeeAttributes(amountOfCoffee)
                    .setAmountOfHotWaterAttributes(amountOfHotWater)
                    .setAromaAttributes(aroma)
                    .setTemperatureAttributes(temperature)
                    .setQuantityAttributes(cupsQuantity)
                    .setWhatFirstAttributes(whatFirst)
                    .setImageResourceId(imageId)
                    .setVisionForButtons(type, name)
                    .build();

            return (S) viewModelSettingDrink;
        }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(amountOfMilkFoam);
        dest.writeInt(amountOfMilk);
        dest.writeInt(amountOfCoffee);
        dest.writeInt(amountOfHotWater);
        dest.writeInt(imageId);
        dest.writeString(name);
        dest.writeString(type);
        dest.writeString(aroma.name());
        dest.writeString(temperature.name());
        dest.writeString(whatFirst.name());
        dest.writeString(cupsQuantity.name());

    }
}
