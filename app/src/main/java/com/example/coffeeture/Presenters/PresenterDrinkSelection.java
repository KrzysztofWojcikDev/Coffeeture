package com.example.coffeeture.Presenters;

import com.example.coffeeture.ViewModels.ViewModelToolbar;

public class PresenterDrinkSelection {
    private ViewModelToolbar viewModelToolbar;


    public PresenterDrinkSelection(String headLine){
        this.viewModelToolbar = new ViewModelToolbar.ToolbarBuilder(headLine)
                .setVisibilityForOptionsButton(true)
                .build();
    }

    public ViewModelToolbar getViewModelToolbar() {
        return viewModelToolbar;
    }
}
