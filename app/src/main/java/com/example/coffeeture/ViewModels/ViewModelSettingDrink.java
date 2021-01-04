package com.example.coffeeture.ViewModels;


import android.widget.ImageView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.coffeeture.DrinkClass.Drink;
import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;
import com.example.coffeeture.Enums.WhatFirst;

public class ViewModelSettingDrink<T extends Drink>  extends ViewModel {


    private MutableLiveData<Integer> contentForEditTextAmountOfMilkFoam;
    private MutableLiveData<Integer> contentForEditTextAmountOfMilk;
    private MutableLiveData<Integer> contentForEditTextAmountOfCoffee;
    private MutableLiveData<Integer> contentForEditTextAmountOfHotWater;

    private final LiveData<Boolean> visionForLinearLayoutAmountOfMilkFoam;
    private final LiveData<Boolean> visionForLinearLayoutAmountOfMilk;
    private final LiveData<Boolean> visionForLinearLayoutAmountOfCoffee;
    private final LiveData<Boolean> visionForLinearLayoutAmountOfHotWater;

    private final LiveData<ImageView> visionForMainDrinkImage;

    private final LiveData<Boolean> visionForConstraintLayoutAroma;
    private final LiveData<Boolean> visionForConstraintLayoutTemperature;
    private final LiveData<Boolean> visionForConstraintLayoutWhatFirst;
    private final LiveData<Boolean> visionForConstraintLayoutQuantity;

    private MutableLiveData<Enum> contentForConstraintLayoutAroma;
    private MutableLiveData<Enum> contentForConstraintLayoutTemperature;
    private MutableLiveData<Enum> contentForConstraintLayoutWhatFirst;
    private MutableLiveData<Enum> contentForConstraintLayoutQuantity;

    private final LiveData<Boolean> visionForButtonStartImplementing;
    private MutableLiveData<Boolean> visionForButtonCreateYourOwn;
    private final LiveData<Boolean> visionForButtonAddToFavorite;

    /*
        private final LiveData<Boolean>visionForButtonStartImplementing;
        MutableLiveData<Boolean>visionForButtonCreateYourOwn;


        MutableLiveData<Boolean>visionForButtonAddToFavorite = new MutableLiveData<>();
        MutableLiveData<Boolean>visionForButtonDeleteFavoriteRecipe= new MutableLiveData<>();
        MutableLiveData<Boolean>visionForButtonUpdateFavoriteRecipe= new MutableLiveData<>();

    */
    public ViewModelSettingDrink(T drink) {
        if (drink.getAmountOfMilkFoam() == 0)
            this.visionForLinearLayoutAmountOfMilkFoam = new MutableLiveData<>(false);
        else {
            this.visionForLinearLayoutAmountOfMilkFoam = new MutableLiveData<>(true);
            this.contentForEditTextAmountOfMilkFoam = new MutableLiveData<>(drink.getAmountOfMilkFoam());
        }

        if (drink.getAmountOfMilk() == 0)
            this.visionForLinearLayoutAmountOfMilk = new MutableLiveData<>(false);
        else {
            this.visionForLinearLayoutAmountOfMilk = new MutableLiveData<>(true);
            this.contentForEditTextAmountOfMilk = new MutableLiveData<>(drink.getAmountOfMilk());
        }

        if (drink.getAmountOfCoffee() == 0)
            this.visionForLinearLayoutAmountOfCoffee = new MutableLiveData<>(false);
        else {
            this.visionForLinearLayoutAmountOfCoffee = new MutableLiveData<>(true);
            this.contentForEditTextAmountOfCoffee = new MutableLiveData<>(drink.getAmountOfCoffee());
        }

        if (drink.getAmountOfHotWater() == 0)
            this.visionForLinearLayoutAmountOfHotWater = new MutableLiveData<>(false);
        else {
            this.visionForLinearLayoutAmountOfHotWater = new MutableLiveData<>(true);
            this.contentForEditTextAmountOfHotWater = new MutableLiveData<>(drink.getAmountOfHotWater());
        }

        if (drink.getAromaProfile() == AromaProfile.VOID)
            this.visionForConstraintLayoutAroma = new MutableLiveData<>(false);
        else {
            this.visionForConstraintLayoutAroma = new MutableLiveData<>(true);
            this.contentForConstraintLayoutAroma = new MutableLiveData<>(drink.getAromaProfile());
        }

        this.visionForConstraintLayoutTemperature = new MutableLiveData<>(true);
        this.contentForConstraintLayoutTemperature = new MutableLiveData<>(drink.getTemperatureOfDrink());


        if (drink.getAromaProfile() == WhatFirst.VOID)
            this.visionForConstraintLayoutWhatFirst = new MutableLiveData<>(false);
        else {
            this.visionForConstraintLayoutWhatFirst = new MutableLiveData<>(true);
            this.contentForConstraintLayoutWhatFirst = new MutableLiveData<>(drink.getWhatFirst());
        }

        if (drink.getAromaProfile() == CupsQuantity.VOID)
            this.visionForConstraintLayoutQuantity = new MutableLiveData<>(false);
        else {
            this.visionForConstraintLayoutQuantity = new MutableLiveData<>(true);
            this.contentForConstraintLayoutQuantity = new MutableLiveData<>(drink.getCupsQuantity());
        }


    }
}

    /*


    public static class ViewModelSettingDrinkBuilder{
      private boolean visionForLinearLayoutAmountOfMilkFoam;
      private boolean visionForLinearLayoutAmountOfMilk;
      private boolean visionForLinearLayoutAmountOfCoffee;
      private boolean visionForLinearLayoutAmountOfHotWater;
      private boolean visionForConstraintLayoutAroma;
      private boolean visionForConstraintLayoutTemperature;
      private boolean visionForConstraintLayoutWhatFirst;
      private boolean visionForConstraintLayoutQuantity;

      private int contentForEditTextAmountOfMilkFoam ;
      private int contentForEditTextAmountOfMilk;
      private int contentForEditTextAmountOfCoffee ;
      private int contentForEditTextAmountOfHotWater ;
      /*  public ViewModelSettingBuilder(boolean visionForLinearLayoutAmountOfMilkFoam){
            this.VISION_FOR_LINEAR_LAYOUT_AMOUNT_OF_MILK_FOAM = visionForLinearLayoutAmountOfMilkFoam;

        }

      public ViewModelSettingDrinkBuilder setAmountOfMilkFoamAttributes(int amountOfMilkFoam){
          if(amountOfMilkFoam == 0)
              this.visionForLinearLayoutAmountOfMilkFoam = false;
          else{
              this.visionForLinearLayoutAmountOfMilkFoam = true;
              this.contentForEditTextAmountOfMilkFoam = amountOfMilkFoam;
          }
          return this;
      }
      public ViewModelSettingDrinkBuilder setAmountOfMilkAttributes(int amountOfMilk){
          if(amountOfMilk == 0)
              this.visionForLinearLayoutAmountOfMilk= false;
          else{
              this.visionForLinearLayoutAmountOfMilk = true;
              this.contentForEditTextAmountOfMilk = amountOfMilk;
          }
          return this;
      }
        public ViewModelSettingDrinkBuilder setAmountOfCoffeeAttributes(int amountOfCoffee){
            if(amountOfCoffee == 0)
                this.visionForLinearLayoutAmountOfCoffee = false;
            else{
                this.visionForLinearLayoutAmountOfCoffee = true;
                this.contentForEditTextAmountOfCoffee = amountOfCoffee;
            }

            return this;
        }
        public ViewModelSettingDrinkBuilder setAmountOfHotWaterAttributes(int amountOfHotWater){
            if(amountOfHotWater == 0)
                this.visionForLinearLayoutAmountOfHotWater = false;
            else{
                this.visionForLinearLayoutAmountOfHotWater = true;
                this.contentForEditTextAmountOfHotWater = amountOfHotWater;
            }
            return this;
        }
        public ViewModelSettingDrinkBuilder setAromaAttributes(AromaProfile aroma){
            this.visionForConstraintLayoutAroma = visionForConstraintLayoutAroma;
            return this;
        }
        public ViewModelSettingDrinkBuilder setTemperatureAttributes (TemperatureOfDrink temperature){
            this.visionForConstraintLayoutTemperature = visionForConstraintLayoutTemperature;
            return this;
        }
        public ViewModelSettingDrinkBuilder setWhatFirstAttributes (WhatFirst WhatFirst){
            this.visionForConstraintLayoutWhatFirst = visionForConstraintLayoutWhatFirst;
            return this;
        }
        public ViewModelSettingDrinkBuilder setQuantityAttributes (CupsQuantity cupsQuantity){
            this.visionForConstraintLayoutQuantity = visionForConstraintLayoutQuantity;
            return this;
        }
      public ViewModelSettingDrink build(){
          return new ViewModelSettingDrink(this);
      }


    }
    private ViewModelSettingDrink(ViewModelSettingDrinkBuilder builder){
        //boolean data
        this.visionForLinearLayoutAmountOfMilkFoam = new MutableLiveData<>(builder.visionForLinearLayoutAmountOfMilkFoam);
        this.visionForLinearLayoutAmountOfMilk = new MutableLiveData<>(builder.visionForLinearLayoutAmountOfMilk);
        this.visionForLinearLayoutAmountOfCoffee = new MutableLiveData<>(builder.visionForLinearLayoutAmountOfCoffee);
        this.visionForLinearLayoutAmountOfHotWater = new MutableLiveData<>(builder.visionForLinearLayoutAmountOfHotWater);
        this.visionForConstraintLayoutAroma = new MutableLiveData<>(builder.visionForConstraintLayoutAroma);
        this.visionForConstraintLayoutTemperature = new MutableLiveData<>(builder.visionForConstraintLayoutTemperature);
        this.visionForConstraintLayoutWhatFirst = new MutableLiveData<>(builder.visionForConstraintLayoutWhatFirst);
        this.visionForConstraintLayoutQuantity = new MutableLiveData<>(builder.visionForConstraintLayoutQuantity);
        //int data


    }
*/
