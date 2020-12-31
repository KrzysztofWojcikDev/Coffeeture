package com.example.coffeeture.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.coffeeture.R;
import com.example.coffeeture.ViewModels.ViewModelToolbar;

public class SettingDrinkActivity extends AppCompatActivity {

    ViewModelToolbar viewModelToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_drink);

        viewModelToolbar = ViewModelProviders.of(SettingDrinkActivity.this).get(ViewModelToolbar.class);
        viewModelToolbar = new ViewModelToolbar.ToolbarBuilder()
                .setHeadline("")
                .setVisibilityForBackButton(true)
                .setVisibilityForOptionsButton(false)
                .setVisibilityForRinseButton(false)
                .build();
    }
}