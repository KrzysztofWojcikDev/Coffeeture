package com.example.coffeeture.Presenters;

import com.example.coffeeture.DrinkClass.Drink;
import com.example.coffeeture.ViewModels.ViewModelSettingDrink;
import com.example.coffeeture.ViewModels.ViewModelToolbar;

import java.io.Serializable;

public class PresenterSettingDrink <T extends Drink> implements Serializable {

    private ViewModelSettingDrink viewModelSettingDrink;
    private ViewModelToolbar viewModelToolbar;
    private final T DRINK ;

    public PresenterSettingDrink(T drink){
        this.DRINK = drink;
        this.viewModelSettingDrink = new ViewModelSettingDrink(drink);
        this.viewModelToolbar = new ViewModelToolbar.ToolbarBuilder().setHeadline(drink.getName()).build();



    }

    public ViewModelSettingDrink getViewModelSettingDrink() { return this.viewModelSettingDrink;}
    public ViewModelToolbar getViewModelToolbar() { return this.viewModelToolbar; }

}
