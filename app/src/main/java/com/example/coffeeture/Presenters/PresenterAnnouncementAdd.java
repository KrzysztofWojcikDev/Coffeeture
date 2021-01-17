package com.example.coffeeture.Presenters;

import com.example.coffeeture.DrinkClass.Drink;

public class PresenterAnnouncementAdd<T extends Drink> {

    private final T drink;

    public PresenterAnnouncementAdd(T drink) {this.drink = drink;}
}
