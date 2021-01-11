package com.example.coffeeture.Presenters;

import com.example.coffeeture.DrinkClass.Drink;

public class PresenterImplementingDrink<T extends Drink> {

    private final T drink;

    public PresenterImplementingDrink(T drink) {this.drink = drink;}
}
