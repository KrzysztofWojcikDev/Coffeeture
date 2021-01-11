package com.example.coffeeture.Presenters;

import com.example.coffeeture.DrinkClass.Drink;

public class PresenterAnnouncement<T extends Drink> {

    private final T drink;

    public PresenterAnnouncement(T drink) {this.drink = drink;}
}
