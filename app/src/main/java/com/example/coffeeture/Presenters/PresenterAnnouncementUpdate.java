package com.example.coffeeture.Presenters;

import com.example.coffeeture.DrinkClass.Drink;

public class PresenterAnnouncementUpdate<T extends Drink> {

    private final T drink;

    public PresenterAnnouncementUpdate(T drink) {this.drink = drink;}
}