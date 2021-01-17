package com.example.coffeeture.Presenters;
import com.example.coffeeture.DrinkClass.Drink;

public class PresenterAnnouncementDelete<T extends Drink> {

    private final T drink;

    public PresenterAnnouncementDelete(T drink) {this.drink = drink;}
}
