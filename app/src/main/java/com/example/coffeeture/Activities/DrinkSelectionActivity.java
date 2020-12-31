package com.example.coffeeture.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.coffeeture.Presenters.PresenterToolbar;
import com.example.coffeeture.R;
import com.example.coffeeture.ViewModels.ViewModelToolbar;

public class DrinkSelectionActivity extends AppCompatActivity {


    ViewModelToolbar viewModelToolbar;
    PresenterToolbar presenterToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_selection);

        viewModelToolbar = ViewModelProviders.of(DrinkSelectionActivity.this).get(ViewModelToolbar.class);
        viewModelToolbar = new ViewModelToolbar.ToolbarBuilder()
                .setHeadline("Choose your drink")
                .setVisibilityForBackButton(false)
                .setVisibilityForOptionsButton(true)
                .setVisibilityForRinseButton(false)
                .build();

        presenterToolbar = new PresenterToolbar(viewModelToolbar);

    }

}