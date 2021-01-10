package com.example.coffeeture.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.coffeeture.DrinkClass.Americano;
import com.example.coffeeture.DrinkClass.Cappuccino;
import com.example.coffeeture.DrinkClass.Coffee;
import com.example.coffeeture.DrinkClass.Drink;
import com.example.coffeeture.DrinkClass.Espresso;
import com.example.coffeeture.DrinkClass.Lungo;
import com.example.coffeeture.DrinkClass.Ristretto;
import com.example.coffeeture.Presenters.PresenterDrinkSelection;
import com.example.coffeeture.Presenters.PresenterSettingDrink;
import com.example.coffeeture.R;
import com.example.coffeeture.ViewModels.ViewModelToolbar;

public class SmallDrinkSelectionActivity extends AppCompatActivity implements View.OnClickListener {

    ViewModelToolbar viewModelToolbar;
    PresenterSettingDrink<?> presenterSettingDrink;

    Button button_ristretto;
    Button button_espresso;
    Button button_lungo;

    Button button_options;
    Button button_rinse;
    Button button_back;
    TextView headline;

    ConstraintLayout visibility_button_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small_drink_selection);

        viewModelToolbar = new ViewModelProvider(this,new PresenterDrinkSelection("Choose your drink").getViewModelFactoryToolbar()).get(ViewModelToolbar.class);

        button_ristretto = findViewById(R.id.button_ristretto);
        button_espresso = findViewById(R.id.button_espresso);
        button_lungo = findViewById(R.id.button_lungo);

        button_options = findViewById(R.id.button_options);
        button_rinse = findViewById(R.id.button_rinse);
        button_back = findViewById(R.id.button_back);
        headline = findViewById(R.id.text_headline);

        visibility_button_back = findViewById(R.id.visibility_button_back);

        button_back.setOnClickListener(this);
        button_ristretto.setOnClickListener(this);
        button_espresso.setOnClickListener(this);
        button_lungo.setOnClickListener(this);

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
    }


    private void activityStarter(PresenterSettingDrink<? extends Drink> presenterSettingDrink, Intent intent) {
        intent.putExtra("presenter", presenterSettingDrink);
        startActivity(intent);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_ristretto:
                Intent intentRistretto = new Intent(SmallDrinkSelectionActivity.this, SettingDrinkActivity.class);
                Ristretto ristretto = new Ristretto.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(ristretto);
                activityStarter(presenterSettingDrink, intentRistretto);
                break;
            case R.id.button_espresso:
                Intent intentEspresso = new Intent(SmallDrinkSelectionActivity.this, SettingDrinkActivity.class);
                Espresso espresso = new Espresso.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(espresso);
                activityStarter(presenterSettingDrink, intentEspresso);
                break;
            case R.id.button_lungo:
                Intent intentLungo = new Intent(SmallDrinkSelectionActivity.this, SettingDrinkActivity.class);
                Lungo lungo = new Lungo.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(lungo);
                activityStarter(presenterSettingDrink, intentLungo);
                break;
             case R.id.button_back:
                Intent intentBack = new Intent(SmallDrinkSelectionActivity.this, DrinkSelectionActivity.class);
                startActivity(intentBack);
                break;

                }
        }

}