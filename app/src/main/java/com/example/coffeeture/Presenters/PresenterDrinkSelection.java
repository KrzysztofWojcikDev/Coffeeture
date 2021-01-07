package com.example.coffeeture.Presenters;

import com.example.coffeeture.ViewModels.ViewModelFactoryToolbar;


public class PresenterDrinkSelection {
    private final ViewModelFactoryToolbar factoryToolbar;


    public PresenterDrinkSelection(String headLine){
        this.factoryToolbar = new ViewModelFactoryToolbar(headLine,false,false,true);
    }

    public ViewModelFactoryToolbar getViewModelFactoryToolbar() { return this.factoryToolbar; }
}
