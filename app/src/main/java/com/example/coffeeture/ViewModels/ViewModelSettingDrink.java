package com.example.coffeeture.ViewModels;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.coffeeture.DrinkClass.Drink;
import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.WhatFirst;

import java.io.Serializable;

    public class ViewModelSettingDrink<T extends Drink>  extends ViewModel implements Parcelable {


    private MutableLiveData<Integer> contentForEditTextAmountOfMilkFoam;
    private MutableLiveData<Integer> contentForEditTextAmountOfMilk;
    private MutableLiveData<Integer> contentForEditTextAmountOfCoffee;
    private MutableLiveData<Integer> contentForEditTextAmountOfHotWater;

    private final LiveData<Boolean> visionForLinearLayoutAmountOfMilkFoam;
    private final LiveData<Boolean> visionForLinearLayoutAmountOfMilk;
    private final LiveData<Boolean> visionForLinearLayoutAmountOfCoffee;
    private final LiveData<Boolean> visionForLinearLayoutAmountOfHotWater;

    private final LiveData<Integer> visionForMainDrinkImage;

    private final LiveData<Boolean> visionForConstraintLayoutAroma;
    private final LiveData<Boolean> visionForConstraintLayoutTemperature;
    private final LiveData<Boolean> visionForConstraintLayoutWhatFirst;
    private final LiveData<Boolean> visionForConstraintLayoutQuantity;

    private MutableLiveData<Enum> contentForConstraintLayoutAroma;
    private MutableLiveData<Enum> contentForConstraintLayoutTemperature;
    private MutableLiveData<Enum> contentForConstraintLayoutWhatFirst;
    private MutableLiveData<Enum> contentForConstraintLayoutQuantity;

    private final LiveData<Boolean> visionForButtonStartImplementing;//this parameter is always true
    private MutableLiveData<Boolean> visionForButtonCreateYourOwn;//this parameter is possible to change by setter
    private final LiveData<Boolean> visionForButtonAddToFavorite;
    private final LiveData<Boolean> visionForButtonDeleteFavoriteRecipe;
    private MutableLiveData<Boolean>visionForButtonUpdateFavoriteRecipe;//this parameter is possible to change by seTTER



    public ViewModelSettingDrink(T drink) {


        this.visionForMainDrinkImage = new MutableLiveData<>(drink.getImageResourceId());
        this.visionForButtonStartImplementing = new MutableLiveData<>(true);
        this.visionForButtonAddToFavorite = new MutableLiveData<>(drink.getType().equals(drink.getName()));
        this.visionForButtonDeleteFavoriteRecipe = new MutableLiveData<>(!drink.getType().equals(drink.getName()));


        this.visionForButtonCreateYourOwn = new MutableLiveData<>(true);
        this.visionForButtonUpdateFavoriteRecipe = new MutableLiveData<>(true);

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

    public MutableLiveData<Integer> getContentForEditTextAmountOfMilkFoam() {
        return contentForEditTextAmountOfMilkFoam;
    }

    public MutableLiveData<Integer> getContentForEditTextAmountOfMilk() {
        return contentForEditTextAmountOfMilk;
    }

    public MutableLiveData<Integer> getContentForEditTextAmountOfCoffee() {
        return contentForEditTextAmountOfCoffee;
    }

    public MutableLiveData<Integer> getContentForEditTextAmountOfHotWater() {
        return contentForEditTextAmountOfHotWater;
    }

    public LiveData<Boolean> getVisionForLinearLayoutAmountOfMilkFoam() {
        return visionForLinearLayoutAmountOfMilkFoam;
    }

    public LiveData<Boolean> getVisionForLinearLayoutAmountOfMilk() {
        return visionForLinearLayoutAmountOfMilk;
    }

    public LiveData<Boolean> getVisionForLinearLayoutAmountOfCoffee() {
        return visionForLinearLayoutAmountOfCoffee;
    }

    public LiveData<Boolean> getVisionForLinearLayoutAmountOfHotWater() {
        return visionForLinearLayoutAmountOfHotWater;
    }

    public LiveData<Integer> getVisionForMainDrinkImage() {
        return visionForMainDrinkImage;
    }

    public LiveData<Boolean> getVisionForConstraintLayoutAroma() {
        return visionForConstraintLayoutAroma;
    }

    public LiveData<Boolean> getVisionForConstraintLayoutTemperature() {
        return visionForConstraintLayoutTemperature;
    }

    public LiveData<Boolean> getVisionForConstraintLayoutWhatFirst() {
        return visionForConstraintLayoutWhatFirst;
    }

    public LiveData<Boolean> getVisionForConstraintLayoutQuantity() {
        return visionForConstraintLayoutQuantity;
    }

    public MutableLiveData<Enum> getContentForConstraintLayoutAroma() {
        return contentForConstraintLayoutAroma;
    }

    public MutableLiveData<Enum> getContentForConstraintLayoutTemperature() {
        return contentForConstraintLayoutTemperature;
    }

    public MutableLiveData<Enum> getContentForConstraintLayoutWhatFirst() {
        return contentForConstraintLayoutWhatFirst;
    }

    public MutableLiveData<Enum> getContentForConstraintLayoutQuantity() {
        return contentForConstraintLayoutQuantity;
    }

    public LiveData<Boolean> getVisionForButtonStartImplementing() {
        return visionForButtonStartImplementing;
    }

    public MutableLiveData<Boolean> getVisionForButtonCreateYourOwn() {
        return visionForButtonCreateYourOwn;
    }

    public LiveData<Boolean> getVisionForButtonAddToFavorite() {
        return visionForButtonAddToFavorite;
    }

    public LiveData<Boolean> getVisionForButtonDeleteFavoriteRecipe() {
        return visionForButtonDeleteFavoriteRecipe;
    }

    public MutableLiveData<Boolean> getVisionForButtonUpdateFavoriteRecipe() {
        return visionForButtonUpdateFavoriteRecipe;
    }
    //setters

    public void setContentForEditTextAmountOfMilkFoam(int contentForEditTextAmountOfMilkFoam) {
        this.contentForEditTextAmountOfMilkFoam.setValue(contentForEditTextAmountOfMilkFoam);
    }

    public void setContentForEditTextAmountOfMilk(int contentForEditTextAmountOfMilk) {
        this.contentForEditTextAmountOfMilk.setValue(contentForEditTextAmountOfMilk);
    }

    public void setContentForEditTextAmountOfCoffee(int contentForEditTextAmountOfCoffee) {
        this.contentForEditTextAmountOfCoffee.setValue(contentForEditTextAmountOfCoffee);
    }

    public void setContentForEditTextAmountOfHotWater(int contentForEditTextAmountOfHotWater) {
        this.contentForEditTextAmountOfHotWater.setValue(contentForEditTextAmountOfHotWater);
    }

    public void setContentForConstraintLayoutAroma(Enum contentForConstraintLayoutAroma) {
        this.contentForConstraintLayoutAroma.setValue(contentForConstraintLayoutAroma);
    }

    public void setContentForConstraintLayoutTemperature(Enum contentForConstraintLayoutTemperature) {
        this.contentForConstraintLayoutTemperature.setValue(contentForConstraintLayoutTemperature);
    }

    public void setContentForConstraintLayoutWhatFirst(Enum contentForConstraintLayoutWhatFirst) {
        this.contentForConstraintLayoutWhatFirst.setValue(contentForConstraintLayoutWhatFirst);
    }

    public void setContentForConstraintLayoutQuantity(Enum contentForConstraintLayoutQuantity) {
        this.contentForConstraintLayoutQuantity.setValue(contentForConstraintLayoutQuantity);
    }

    public void setVisionForButtonCreateYourOwn(boolean visionForButtonCreateYourOwn) {
        this.visionForButtonCreateYourOwn.setValue(visionForButtonCreateYourOwn);
    }

    public void setVisionForButtonUpdateFavoriteRecipe(boolean visionForButtonUpdateFavoriteRecipe) {
        this.visionForButtonUpdateFavoriteRecipe.setValue(visionForButtonUpdateFavoriteRecipe);
    }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {

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
