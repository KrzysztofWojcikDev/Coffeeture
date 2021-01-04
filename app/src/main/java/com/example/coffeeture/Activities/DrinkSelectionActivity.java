package com.example.coffeeture.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;



import android.annotation.SuppressLint;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.coffeeture.DrinkClass.Americano;
import com.example.coffeeture.DrinkClass.CafeLate;
import com.example.coffeeture.DrinkClass.Cappuccino;
import com.example.coffeeture.DrinkClass.Coffee;
import com.example.coffeeture.DrinkClass.HotWater;
import com.example.coffeeture.DrinkClass.Latte;
import com.example.coffeeture.DrinkClass.Milk;
import com.example.coffeeture.Presenters.PresenterSettingDrink;
import com.example.coffeeture.R;
import com.example.coffeeture.ViewModels.ViewModelToolbar;


public class DrinkSelectionActivity extends AppCompatActivity implements View.OnClickListener {


    ViewModelToolbar viewModelToolbar;
    PresenterSettingDrink<?> presenterSettingDrink;
    // PresenterToolbar presenterToolbar;
    Button button_options;
    Button button_rinse;

    Button button_small_coffee;
    Button button_coffee;
    Button button_americano;
    Button button_cappuccino;
    Button button_cafe_late;
    Button button_latte;
    Button button_milk;
    Button button_favorite;
    Button button_hot_water;

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




        // presenterToolbar = new PresenterToolbar(viewModelToolbar);
        button_options = findViewById(R.id.button_options);

        button_rinse = findViewById(R.id.button_rinse);

        button_small_coffee = findViewById(R.id.first_recipe_button);

        button_coffee = findViewById(R.id.second_recipe_button);

        button_americano = findViewById(R.id.third_recipe_button);

        button_cappuccino = findViewById(R.id.fourth_recipe_button);

        button_cafe_late = findViewById(R.id.fift_recipe_button);

        button_latte = findViewById(R.id.sixth_recipe_button);

        button_milk = findViewById(R.id.seventh_recipe_button);

        button_favorite = findViewById(R.id.eighth_recipe_button);

        button_hot_water = findViewById(R.id.ninth_recipe_button);

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

    }

    private void activityStarter(PresenterSettingDrink<?> presenterSettingDrink, Intent intent) {
        intent.putExtra("presenter", presenterSettingDrink);
        startActivity(intent);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first_recipe_button:
                Intent intentSmallCoffees = new Intent(DrinkSelectionActivity.this, SmallDrinkSelectionActivity.class);
                startActivity(intentSmallCoffees);
                break;
            case R.id.second_recipe_button:
                Intent intentCoffee = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                Coffee coffee = new Coffee.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(coffee);
                activityStarter(presenterSettingDrink, intentCoffee);
                break;
            case R.id.third_recipe_button:
                Intent intentAmericano = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                Americano americano = new Americano.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(americano);
                activityStarter(presenterSettingDrink, intentAmericano);
                break;
            case R.id.fourth_recipe_button:
                Intent intentCappuccino = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                Cappuccino cappuccino = new Cappuccino.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(cappuccino);
                activityStarter(presenterSettingDrink, intentCappuccino);
                break;
            case R.id.fift_recipe_button:
                Intent intentCafeLate = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                CafeLate cafeLate = new CafeLate.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(cafeLate);
                activityStarter(presenterSettingDrink, intentCafeLate);
                break;
            case R.id.sixth_recipe_button:
                Intent intentLatte = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                Latte latte = new Latte.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(latte);
                activityStarter(presenterSettingDrink, intentLatte);
                break;
            case R.id.seventh_recipe_button:
                Intent intentMilk = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                Milk milk = new Milk.Builder().build();
                presenterSettingDrink = new PresenterSettingDrink<>(milk);
                activityStarter(presenterSettingDrink, intentMilk);
                break;
            case R.id.eighth_recipe_button:
                Intent intentFavorite = new Intent(DrinkSelectionActivity.this, SettingDrinkActivity.class);
                startActivity(intentFavorite);
                break;
            case R.id.ninth_recipe_button:
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