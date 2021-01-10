package com.example.coffeeture.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;

import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;
import com.example.coffeeture.Enums.TemperatureOfDrink;
import com.example.coffeeture.Enums.WhatFirst;

import com.example.coffeeture.R;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.coffeeture.Presenters.PresenterSettingDrink;
import com.example.coffeeture.ViewModels.ViewModelSettingDrink;
import com.example.coffeeture.ViewModels.ViewModelToolbar;

public class SettingDrinkActivity extends AppCompatActivity {

    private static final String TAG = "SettingDrinkActivity";
    ViewModelToolbar viewModelToolbar;
    ViewModelSettingDrink<?> viewModelSettingDrink;
    PresenterSettingDrink<?>presenterSettingDrink;

        Button button_options;
        Button button_rinse;
        Button button_back;
        ConstraintLayout visibility_button_back;
        TextView headline;



        EditText editTextAmountOfMilkFoam;
        EditText editTextAmountOfMilk;
        EditText editTextAmountOfCoffee;
        EditText editTextAmountOfHotWater;
        LinearLayout linearLayoutAmountOfMilkFoam;
        LinearLayout linearLayoutAmountOfMilk;
        LinearLayout linearLayoutAmountOfCoffee;
        LinearLayout linearLayoutAmountOfHotWater;
        ToggleButton toggleButtonFirstBean;
        ToggleButton toggleButtonSecondBean;
        ToggleButton toggleButtonThirdBean;
        ToggleButton toggleButtonFirstThermometer;
        ToggleButton toggleButtonSecondThermometer;
        ToggleButton toggleButtonThirdThermometer;
        ToggleButton toggleButtonWhatFirst;
        ToggleButton  toggleButtonCupsQuantity;
        ConstraintLayout constraintLayoutAroma;
        ConstraintLayout constraintLayoutTemperature;
        ConstraintLayout constraintLayoutWhatFirst;
        ConstraintLayout constraintLayoutQuantity;
        ConstraintLayout viewForCreateButton;
        ConstraintLayout viewForAddButton;
        ConstraintLayout viewForUpdateButton;
        ConstraintLayout viewForDeleteButton;
        Button buttonCreateYourOwn;
        Button buttonStartImplementing;
        Button buttonAddToFavorite;
        Button buttonDeleteRecipe;
        Button buttonUpdateFavoriteRecipe;
        ImageView mainDrinkImage;




    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_drink);


        presenterSettingDrink = getIntent().getParcelableExtra("presenter");
        viewModelSettingDrink = new ViewModelProvider(this,presenterSettingDrink.getViewModelFactorySettingDrink()).get(ViewModelSettingDrink.class);
        viewModelToolbar = new ViewModelProvider(this,presenterSettingDrink.getViewModelFactoryToolbar()).get(ViewModelToolbar.class);



        editTextAmountOfMilkFoam = findViewById(R.id.edit_amountOfMilkFoam);
        editTextAmountOfMilk = findViewById(R.id.edit_amountOfMilk);
        editTextAmountOfCoffee = findViewById(R.id.edit_amountOfCoffee);
        editTextAmountOfHotWater = findViewById(R.id.edit_amountOfHotWater);

        linearLayoutAmountOfMilkFoam = findViewById(R.id.linear_visibility_amountOfMilkFoam);
        linearLayoutAmountOfMilk = findViewById(R.id.linear_visibility_amountOfMilk);
        linearLayoutAmountOfCoffee= findViewById(R.id.linear_visibility_amountOfCoffee);
        linearLayoutAmountOfHotWater = findViewById(R.id.linear_visibility_amountOfHotWater);

        toggleButtonFirstBean = findViewById(R.id.toggleButton_first_bean);
        toggleButtonSecondBean = findViewById(R.id.toggleButton_second_bean);
        toggleButtonThirdBean = findViewById(R.id.toggleButton_third_bean);
        toggleButtonFirstThermometer = findViewById(R.id.toggleButton_first_thermometer);
        toggleButtonSecondThermometer = findViewById(R.id.toggleButton_second_thermometer);
        toggleButtonThirdThermometer = findViewById(R.id.toggleButton_third_thermometer);
        toggleButtonWhatFirst = findViewById(R.id.toggleButton_what_first);
        toggleButtonCupsQuantity = findViewById(R.id.toggleButton_one_cup);

        constraintLayoutAroma = findViewById(R.id.layout_aroma);
        constraintLayoutTemperature = findViewById(R.id.layout_temperature);
        constraintLayoutWhatFirst = findViewById(R.id.layout_what_first);
        constraintLayoutQuantity = findViewById(R.id.layout_quantity);
        visibility_button_back = findViewById(R.id.visibility_button_back);

        viewForAddButton = findViewById(R.id.constraint_visibility_add);
        viewForUpdateButton = findViewById(R.id.constraint_visibility_update);
        viewForCreateButton = findViewById(R.id.view_for_create_button);
        viewForDeleteButton = findViewById(R.id.constraint_visibility_delete);

        buttonStartImplementing = findViewById(R.id.button_start);
        buttonCreateYourOwn = findViewById(R.id.button_create_your_own);
        buttonAddToFavorite = findViewById(R.id.button_add);
        buttonDeleteRecipe = findViewById(R.id.button_delete);
        buttonUpdateFavoriteRecipe = findViewById(R.id.button_update);


        button_options = findViewById(R.id.button_options);
        button_rinse = findViewById(R.id.button_rinse);
        button_back = findViewById(R.id.button_back);
        headline = findViewById(R.id.text_headline);


        viewModelToolbar.getHeadline().observe(this, content-> {
            if(content!=null) {
                headline.setVisibility(View.VISIBLE);
                headline.setText(content);

            }
        });

        viewModelToolbar.getVisibilityForBackButton().observe(this, state -> {
            if(state)
                visibility_button_back.setVisibility(View.VISIBLE);
            else
                visibility_button_back.setVisibility(View.INVISIBLE);
        });

        viewModelToolbar.getVisibilityForOptionsButton().observe(this, state -> {
            if(state)
                button_options.setVisibility(View.VISIBLE);
            else
                button_options.setVisibility(View.INVISIBLE);
        });

        viewModelToolbar.getVisibilityForRinseButton().observe(this, state -> {
            if(state)
                button_rinse.setVisibility(View.VISIBLE);
            else
                button_rinse.setVisibility(View.INVISIBLE);
        });

        viewModelSettingDrink.getVisionForButtonStartImplementing().observe(this, state -> {
            if(state)
                buttonStartImplementing.setVisibility(View.VISIBLE);
            else
                buttonStartImplementing.setVisibility(View.INVISIBLE);
        });

        viewModelSettingDrink.getVisionForButtonAddToFavorite().observe(this, state -> {
            if(state)
                buttonAddToFavorite.setVisibility(View.VISIBLE);
            else
                buttonAddToFavorite.setVisibility(View.INVISIBLE);
        });

        viewModelSettingDrink.getVisionForButtonUpdateFavoriteRecipe().observe(this, state -> {
            if(state)
                buttonUpdateFavoriteRecipe.setVisibility(View.VISIBLE);
            else
                buttonUpdateFavoriteRecipe.setVisibility(View.INVISIBLE);
        });

        viewModelSettingDrink.getVisionForButtonDeleteFavoriteRecipe().observe(this, state -> {
            if(state)
                buttonDeleteRecipe.setVisibility(View.VISIBLE);
            else
                buttonDeleteRecipe.setVisibility(View.INVISIBLE);
        });

        viewModelSettingDrink.getVisionForMainDrinkImage().observe(this, content -> {
            mainDrinkImage=findViewById(content);
            mainDrinkImage.setVisibility(View.VISIBLE);
            if (content == R.id.image_americano){
                toggleButtonWhatFirst.setBackgroundDrawable(getResources().getDrawable(R.drawable.what_first_americano_selector));
            }

        });

        viewModelSettingDrink.getVisionForConstraintLayoutAroma().observe(this, state -> {
            if(state) {
                constraintLayoutAroma.setVisibility(View.VISIBLE);

                viewModelSettingDrink.getContentForConstraintLayoutAroma().observe(this,content->{
                    if(content == AromaProfile.INTENSE) {
                        toggleButtonFirstBean.setChecked(true);
                        toggleButtonSecondBean.setChecked(true);
                        toggleButtonThirdBean.setChecked(true);
                        }
                        else if(content == AromaProfile.STATIC){
                        toggleButtonFirstBean.setChecked(true);
                        toggleButtonSecondBean.setChecked(true);
                        toggleButtonThirdBean.setChecked(false);
                        }
                        else if(content == AromaProfile.DYNAMIC){
                        toggleButtonFirstBean.setChecked(true);
                        toggleButtonSecondBean.setChecked(false);
                        toggleButtonThirdBean.setChecked(false);
                        }
                    });
            }
            else
                    constraintLayoutAroma.setVisibility(View.INVISIBLE);
        });

        viewModelSettingDrink.getVisionForConstraintLayoutTemperature().observe(this, state -> {
            if(state) {
                constraintLayoutTemperature.setVisibility(View.VISIBLE);

                viewModelSettingDrink.getContentForConstraintLayoutTemperature().observe(this,content->{
                    if(content == TemperatureOfDrink.HOT) {
                        toggleButtonFirstThermometer.setChecked(true);
                        toggleButtonSecondThermometer.setChecked(true);
                        toggleButtonThirdThermometer.setChecked(true);
                    }
                    else if(content ==TemperatureOfDrink.WARM){
                        toggleButtonFirstThermometer.setChecked(true);
                        toggleButtonSecondThermometer.setChecked(true);
                        toggleButtonThirdThermometer.setChecked(false);
                    }
                    else if(content == TemperatureOfDrink.NORMAL){
                        toggleButtonFirstThermometer.setChecked(true);
                        toggleButtonSecondThermometer.setChecked(false);
                        toggleButtonThirdThermometer.setChecked(false);
                    }

                });
            }
            else
                constraintLayoutTemperature.setVisibility(View.INVISIBLE);
        });

        viewModelSettingDrink.getVisionForConstraintLayoutWhatFirst().observe(this, state -> {
            if(state) {
                constraintLayoutWhatFirst.setVisibility(View.VISIBLE);

                viewModelSettingDrink.getContentForConstraintLayoutWhatFirst().observe(this,content->{
                    if(content == WhatFirst.COFFEE) {
                        toggleButtonWhatFirst.setChecked(true);
                    }
                    else if(content ==WhatFirst.MILK || content == WhatFirst.WATER){
                        toggleButtonWhatFirst.setChecked(false);
                    }
                });
            }
            else
                constraintLayoutWhatFirst.setVisibility(View.INVISIBLE);
        });

        viewModelSettingDrink.getVisionForConstraintLayoutQuantity().observe(this, state -> {
            if(state) {
                constraintLayoutQuantity.setVisibility(View.VISIBLE);

                viewModelSettingDrink.getContentForConstraintLayoutQuantity().observe(this,content->{
                    if(content == CupsQuantity.ONE) {
                        toggleButtonCupsQuantity.setChecked(false);
                    }
                    else if(content == CupsQuantity.TWO){
                        toggleButtonCupsQuantity.setChecked(true);
                    }
                });
            }
            else
                constraintLayoutQuantity.setVisibility(View.INVISIBLE);
        });

        viewModelSettingDrink.getVisionForLinearLayoutAmountOfMilkFoam().observe(this, state ->{

            if(state) {
                linearLayoutAmountOfMilkFoam.setVisibility(View.VISIBLE);
                viewModelSettingDrink.getContentForEditTextAmountOfMilkFoam().observe(this, content -> editTextAmountOfMilkFoam.setText(String.valueOf(content)));
            }
            else
                linearLayoutAmountOfMilkFoam.setVisibility(View.INVISIBLE);
        });

        viewModelSettingDrink.getVisionForLinearLayoutAmountOfMilk().observe(this, state ->{

            if(state) {
                linearLayoutAmountOfMilk.setVisibility(View.VISIBLE);
                viewModelSettingDrink.getContentForEditTextAmountOfMilk().observe(this, content -> editTextAmountOfMilk.setText(String.valueOf(content)));
            }
            else
                linearLayoutAmountOfMilk.setVisibility(View.INVISIBLE);
        });


        viewModelSettingDrink.getVisionForLinearLayoutAmountOfCoffee().observe(this, state -> {

            if(state) {
                linearLayoutAmountOfCoffee.setVisibility(View.VISIBLE);
                viewModelSettingDrink.getContentForEditTextAmountOfCoffee().observe(this, content -> editTextAmountOfCoffee.setText(String.valueOf(content)));
            }
            else
                linearLayoutAmountOfCoffee.setVisibility(View.INVISIBLE);
        });

        viewModelSettingDrink.getVisionForLinearLayoutAmountOfHotWater().observe(this, state -> {

            if(state) {
                linearLayoutAmountOfHotWater.setVisibility(View.VISIBLE);
                viewModelSettingDrink.getContentForEditTextAmountOfHotWater().observe(this, content -> editTextAmountOfHotWater.setText(String.valueOf(content)));
            }
            else
                linearLayoutAmountOfHotWater.setVisibility(View.INVISIBLE);
        });

    }


    }




