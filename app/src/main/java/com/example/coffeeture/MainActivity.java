package com.example.coffeeture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.coffeeture.DrinkClass.Americano;
import com.example.coffeeture.DrinkClass.Coffee;
import com.example.coffeeture.Enums.AromaProfile;
import com.example.coffeeture.Enums.CupsQuantity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}