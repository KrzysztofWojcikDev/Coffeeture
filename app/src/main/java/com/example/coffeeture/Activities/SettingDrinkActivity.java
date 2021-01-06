package com.example.coffeeture.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.coffeeture.DrinkClass.Drink;
import com.example.coffeeture.Presenters.PresenterDrinkSelection;
import com.example.coffeeture.R;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.coffeeture.Presenters.PresenterSettingDrink;
import com.example.coffeeture.ViewModels.ViewModelSettingDrink;
import com.example.coffeeture.ViewModels.ViewModelToolbar;

public class SettingDrinkActivity extends AppCompatActivity {

    ViewModelToolbar viewModelToolbar;
    ViewModelSettingDrink viewModelSettingDrink;
    PresenterSettingDrink<?>presenterSettingDrink;

        Button button_options;
        Button button_rinse;
        ConstraintLayout button_back;
        TextView headline;


        TextView textViewCommon;
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
        ToggleButton toggleButtonOneCup;
        ToggleButton toggleButtonTwoCups;
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





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_drink);
        viewModelSettingDrink = new ViewModelProvider(this).get(ViewModelSettingDrink.class);

        presenterSettingDrink = (PresenterSettingDrink<? extends Drink>) getIntent().getParcelableExtra("presenter");
        viewModelSettingDrink = presenterSettingDrink.getViewModelSettingDrink();
        viewModelToolbar = new ViewModelProvider(this).get(ViewModelToolbar.class);
        viewModelToolbar = presenterSettingDrink.getViewModelToolbar();


       // viewModelToolbar = ViewModelProviders.of(SettingDrinkActivity.this).get(ViewModelToolbar.class);


        System.out.println(presenterSettingDrink.getDrinkInt());
        System.out.println(presenterSettingDrink.getViewModelToolbar().getVisibilityForRinseButton());
        System.out.println(presenterSettingDrink.getViewModelToolbar().getHeadline().getValue()+"rinse button");




        Toast.makeText(this,presenterSettingDrink.getDrinkInt(), Toast.LENGTH_SHORT).show();

        editTextAmountOfMilkFoam = findViewById(R.id.editText_amount_of_milk_foam);
        editTextAmountOfMilk = findViewById(R.id.editText_amount_of_milk);
        editTextAmountOfCoffee = findViewById(R.id.editText_amount_of_coffee);
        editTextAmountOfHotWater = findViewById(R.id.editText_amount_of_hot_water);

        linearLayoutAmountOfMilkFoam = findViewById(R.id.linear_layout_amount_of_milk_foam);
        linearLayoutAmountOfMilk = findViewById(R.id.linear_layout_amount_of_milk);
        linearLayoutAmountOfCoffee= findViewById(R.id.linear_layout_amount_of_coffee);
        linearLayoutAmountOfHotWater = findViewById(R.id.linear_layout_amount_of_hot_water);

        toggleButtonFirstBean = findViewById(R.id.toggleButton_first_bean);
        toggleButtonSecondBean = findViewById(R.id.toggleButton_second_bean);
        toggleButtonThirdBean = findViewById(R.id.toggleButton_third_bean);
        toggleButtonFirstThermometer = findViewById(R.id.toggleButton_first_thermometer);
        toggleButtonSecondThermometer = findViewById(R.id.toggleButton_second_thermometer);
        toggleButtonThirdThermometer = findViewById(R.id.toggleButton_third_thermometer);
        toggleButtonWhatFirst = findViewById(R.id.toggleButton_what_first);
        toggleButtonOneCup = findViewById(R.id.toggleButton_one_cup);
        toggleButtonTwoCups = findViewById(R.id.toggleButton_two_cups);
        constraintLayoutAroma = findViewById(R.id.layout_aroma);
        constraintLayoutTemperature = findViewById(R.id.layout_temperature);
        constraintLayoutWhatFirst = findViewById(R.id.layout_what_first);
        constraintLayoutQuantity = findViewById(R.id.layout_quantity);

        viewForAddButton = findViewById(R.id.view_for_add_button);
        viewForUpdateButton = findViewById(R.id.view_for_update_button);
        viewForCreateButton = findViewById(R.id.view_for_create_button);
        viewForDeleteButton = findViewById(R.id.view_for_delete_button);

        buttonStartImplementing = findViewById(R.id.button_start_implementing);
        buttonCreateYourOwn = findViewById(R.id.button_create_your_own);
        buttonAddToFavorite = findViewById(R.id.button_add_to_favorite);
        buttonDeleteRecipe = findViewById(R.id.button_delete_recipe);
        buttonUpdateFavoriteRecipe = findViewById(R.id.button_update_favorite_recipe);

        button_options = findViewById(R.id.button_options);
        button_rinse = findViewById(R.id.button_rinse);
        button_back = findViewById(R.id.view_for_back_button);
        headline = findViewById(R.id.textView_common);

        System.out.println(viewModelSettingDrink.getContentForConstraintLayoutAroma()+"aroma");
        viewModelToolbar.getHeadline().observe(this, content-> {
            if(content!=null) {
                headline.setVisibility(View.VISIBLE);
                headline.setText(content);


            }
        });

        viewModelToolbar.getVisibilityForBackButton().observe(this, state -> {
            if(state)
                button_back.setVisibility(View.VISIBLE);
            else
                button_back.setVisibility(View.INVISIBLE);
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

}
