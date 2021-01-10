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
import com.example.coffeeture.DrinkClass.CafeLate;
import com.example.coffeeture.DrinkClass.Cappuccino;
import com.example.coffeeture.DrinkClass.Coffee;
import com.example.coffeeture.DrinkClass.Drink;
import com.example.coffeeture.DrinkClass.HotWater;
import com.example.coffeeture.DrinkClass.Latte;
import com.example.coffeeture.DrinkClass.Milk;
import com.example.coffeeture.Presenters.PresenterDrinkSelection;
import com.example.coffeeture.Presenters.PresenterSettingDrink;
import com.example.coffeeture.R;
import com.example.coffeeture.ViewModels.ViewModelToolbar;


public class DrinkSelectionActivity extends AppCompatActivity implements View.OnClickListener {

    ViewModelToolbar viewModelToolbar;
    PresenterSettingDrink<? extends Drink> presenterSettingDrink;

    Button button_options;
    Button button_rinse;
    Button button_back;
    TextView headline;

    Button button_small_coffee;
    Button button_coffee;
    Button button_americano;
    Button button_cappuccino;
    Button button_cafe_late;
    Button button_latte;
    Button button_milk;
    Button button_favorite;
    Button button_hot_water;

    ConstraintLayout visibility_button_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_selection);

        viewModelToolbar = new ViewModelProvider(this,new PresenterDrinkSelection("Choose your drink").getViewModelFactoryToolbar()).get(ViewModelToolbar.class);



        button_options = findViewById(R.id.button_options);
        button_rinse = findViewById(R.id.button_rinse);
        button_back = findViewById(R.id.button_back);
        headline = findViewById(R.id.text_headline);

        button_small_coffee = findViewById(R.id.button_smallCoffees);
        button_coffee = findViewById(R.id.button_coffee);
        button_americano = findViewById(R.id.button_americano);
        button_cappuccino = findViewById(R.id.button_cappuccino);
        button_cafe_late = findViewById(R.id.button_cafeLate);
        button_latte = findViewById(R.id.button_latte);
        button_milk = findViewById(R.id.button_milk);
        button_favorite = findViewById(R.id.button_favorite);
        button_hot_water = findViewById(R.id.button_hotWater);

        visibility_button_back = findViewById(R.id.visibility_button_back);

        button_back.setOnClickListener(this);
        button_options.setOnClickListener(this);
        button_rinse.setOnClickListener(this);
        button_coffee.setOnClickListener(this);
        button_americano.setOnClickListener(this);
        button_cappuccino.setOnClickListener(this);
        button_cafe_late.setOnClickListener(this);
        button_latte.setOnClickListener(this);
        button_milk.setOnClickListener(this);
        button_favorite.setOnClickListener(this);
        button_hot_water.setOnClickListener(this);
        button_small_coffee.setOnClickListener(this);


        viewModelToolbar.getHeadline().observe(this, content-> {
            if(content!=null) {
                headline.setVisibility(View.VISIBLE);
                headline.setText(content);
            }
        });

     /*   viewModelToolbar.getVisibilityForBackButton().observe(this, state -> {
            if(state)
                visibility_button_back.setVisibility(View.VISIBLE);
            else
                visibility_button_back.setVisibility(View.INVISIBLE);
        });*/

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
            case R.id.button_smallCoffees:
                Intent intentSmallCoffees = new Intent(DrinkSelectionActivity.this, SmallDrinkSelectionActivity.class);
                startActivity(intentSmallCoffees);
                break;
            case R.id.button_coffee:
                Intent intentCoffee = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                Coffee coffee = new Coffee.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(coffee);
                activityStarter(presenterSettingDrink, intentCoffee);
                break;
            case R.id.button_americano:
                Intent intentAmericano = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                Americano americano = new Americano.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(americano);
                activityStarter(presenterSettingDrink, intentAmericano);
                break;
            case R.id.button_cappuccino:
                Intent intentCappuccino = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                Cappuccino cappuccino = new Cappuccino.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(cappuccino);
                activityStarter(presenterSettingDrink, intentCappuccino);
                break;
            case R.id.button_cafeLate:
                Intent intentCafeLate = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                CafeLate cafeLate = new CafeLate.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(cafeLate);
                activityStarter(presenterSettingDrink, intentCafeLate);
                break;
            case R.id.button_latte:
                Intent intentLatte = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                Latte latte = new Latte.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(latte);
                activityStarter(presenterSettingDrink, intentLatte);
                break;
            case R.id.button_milk:
                Intent intentMilk = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                Milk milk = new Milk.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(milk);
                activityStarter(presenterSettingDrink, intentMilk);
                break;
            case R.id.button_favorite:
                Intent intentFavorite = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                startActivity(intentFavorite);
                break;
            case R.id.button_hotWater:
                Intent intentHotWater = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                HotWater hotWater = new HotWater.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(hotWater);
                activityStarter(presenterSettingDrink, intentHotWater);
                break;
            case R.id.button_options:
                Intent intentOptions = new Intent(DrinkSelectionActivity.this, OptionsActivity.class);
                startActivity(intentOptions);
                break;
            case R.id.button_rinse:
                Intent intentRinse = new Intent(DrinkSelectionActivity.this, RinsingActivity.class);
                startActivity(intentRinse);
                break;


        }

    }

}