package com.example.coffeeture.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
<<<<<<< HEAD

=======
<<<<<<< HEAD
<<<<<<< Updated upstream
>>>>>>> 5306049562a0ae769312798ae45e41df857d77f4

import com.example.coffeeture.R;

import android.widget.ImageView;

import com.example.coffeeture.Presenters.PresenterSettingDrink;


import com.example.coffeeture.ViewModels.ViewModelSettingDrink;
<<<<<<< HEAD
=======
=======

import com.example.coffeeture.R;
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
>>>>>>> 5306049562a0ae769312798ae45e41df857d77f4
import com.example.coffeeture.ViewModels.ViewModelToolbar;

public class SettingDrinkActivity extends AppCompatActivity {

    ViewModelToolbar viewModelToolbar;
<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> 5306049562a0ae769312798ae45e41df857d77f4

    ViewModelSettingDrink viewModelSettingDrink;
    PresenterSettingDrink<?>presenterSettingDrink;
    ImageView drinkImageView;

<<<<<<< HEAD

=======
=======
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
>>>>>>> 5306049562a0ae769312798ae45e41df857d77f4
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_drink);

<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> 5306049562a0ae769312798ae45e41df857d77f4
        presenterSettingDrink = (PresenterSettingDrink<?>) getIntent().getSerializableExtra("presenter");
        viewModelSettingDrink = presenterSettingDrink.getViewModelSettingDrink();


        viewModelSettingDrink = ViewModelProviders.of(SettingDrinkActivity.this).get(ViewModelSettingDrink.class);

<<<<<<< HEAD
=======
=======
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
>>>>>>> 5306049562a0ae769312798ae45e41df857d77f4
        viewModelToolbar = ViewModelProviders.of(SettingDrinkActivity.this).get(ViewModelToolbar.class);
        viewModelToolbar = new ViewModelToolbar.ToolbarBuilder()
                .setHeadline("")
                .setVisibilityForBackButton(true)
                .setVisibilityForOptionsButton(false)
                .setVisibilityForRinseButton(false)
                .build();
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
>>>>>>> 5306049562a0ae769312798ae45e41df857d77f4
    }
}