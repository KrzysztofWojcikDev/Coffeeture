package com.example.coffeeture.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
<<<<<<< HEAD
<<<<<<< Updated upstream

import com.example.coffeeture.R;

import android.widget.ImageView;

import com.example.coffeeture.Presenters.PresenterSettingDrink;


import com.example.coffeeture.ViewModels.ViewModelSettingDrink;
=======

import com.example.coffeeture.R;
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
import com.example.coffeeture.ViewModels.ViewModelToolbar;

public class SettingDrinkActivity extends AppCompatActivity {

    ViewModelToolbar viewModelToolbar;
<<<<<<< HEAD

    ViewModelSettingDrink viewModelSettingDrink;
    PresenterSettingDrink<?>presenterSettingDrink;
    ImageView drinkImageView;

=======
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_drink);

<<<<<<< HEAD
        presenterSettingDrink = (PresenterSettingDrink<?>) getIntent().getSerializableExtra("presenter");
        viewModelSettingDrink = presenterSettingDrink.getViewModelSettingDrink();


        viewModelSettingDrink = ViewModelProviders.of(SettingDrinkActivity.this).get(ViewModelSettingDrink.class);

=======
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
        viewModelToolbar = ViewModelProviders.of(SettingDrinkActivity.this).get(ViewModelToolbar.class);
        viewModelToolbar = new ViewModelToolbar.ToolbarBuilder()
                .setHeadline("")
                .setVisibilityForBackButton(true)
                .setVisibilityForOptionsButton(false)
                .setVisibilityForRinseButton(false)
                .build();
<<<<<<< HEAD

=======
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
    }
}