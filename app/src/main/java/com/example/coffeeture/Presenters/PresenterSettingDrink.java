package com.example.coffeeture.Presenters;

import com.example.coffeeture.ViewModels.ViewModelSettingDrink;
import com.example.coffeeture.ViewModels.ViewModelToolbar;

public class PresenterSettingDrink <T>{
    private ViewModelSettingDrink viewModelSettingDrink;
    private ViewModelToolbar viewModelToolbar;
    private T drink ;

    public PresenterSettingDrink(ViewModelSettingDrink viewModelSettingDrink,ViewModelToolbar viewModelToolbar,T drink){

        this.viewModelSettingDrink = viewModelSettingDrink;
        this.viewModelToolbar = viewModelToolbar;
        this.drink = drink;
    }
}
