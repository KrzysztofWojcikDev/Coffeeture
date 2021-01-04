package com.example.coffeeture.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
<<<<<<< Updated upstream

import com.example.coffeeture.R;

import android.widget.ImageView;

import com.example.coffeeture.Presenters.PresenterSettingDrink;


import com.example.coffeeture.ViewModels.ViewModelSettingDrink;
import com.example.coffeeture.ViewModels.ViewModelToolbar;

public class SettingDrinkActivity extends AppCompatActivity {

    ViewModelToolbar viewModelToolbar;

    ViewModelSettingDrink viewModelSettingDrink;
    PresenterSettingDrink<?>presenterSettingDrink;
    ImageView drinkImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_drink);

        presenterSettingDrink = (PresenterSettingDrink<?>) getIntent().getSerializableExtra("presenter");
        viewModelSettingDrink = presenterSettingDrink.getViewModelSettingDrink();


        viewModelSettingDrink = ViewModelProviders.of(SettingDrinkActivity.this).get(ViewModelSettingDrink.class);

        viewModelToolbar = ViewModelProviders.of(SettingDrinkActivity.this).get(ViewModelToolbar.class);
        viewModelToolbar = new ViewModelToolbar.ToolbarBuilder()
                .setHeadline("")
                .setVisibilityForBackButton(true)
                .setVisibilityForOptionsButton(false)
                .setVisibilityForRinseButton(false)
                .build();

    }
}