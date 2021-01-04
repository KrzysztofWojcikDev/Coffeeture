package com.example.coffeeture.Presenters;

<<<<<<< HEAD
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

=======
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
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
}
