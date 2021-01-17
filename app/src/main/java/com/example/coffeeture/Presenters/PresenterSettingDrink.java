package com.example.coffeeture.Presenters;

import android.os.Parcel;
import android.os.Parcelable;
import com.example.coffeeture.DrinkClass.Drink;
import com.example.coffeeture.ViewModels.ViewModelFactorySettingDrink;
import com.example.coffeeture.ViewModels.ViewModelFactoryToolbar;


public class PresenterSettingDrink <T extends Drink> implements Parcelable {


    private final ViewModelFactorySettingDrink<T> factorySettingDrink;
    private final ViewModelFactoryToolbar factoryToolbar;




    public PresenterSettingDrink(T drink) {
        this.drink = drink;
        factorySettingDrink = new ViewModelFactorySettingDrink<>(drink);

        factoryToolbar = new ViewModelFactoryToolbar(drink.getName(),true,false,false);
    }

    protected PresenterSettingDrink(Parcel in) {

        this.factorySettingDrink = in.readParcelable(ViewModelFactorySettingDrink.class.getClassLoader());
        this.factoryToolbar = in.readParcelable(ViewModelFactoryToolbar.class.getClassLoader());

    }

    public static final Creator<PresenterSettingDrink<? extends Drink>> CREATOR = new Creator<PresenterSettingDrink<? extends Drink>>() {
        @Override
        public PresenterSettingDrink<? extends Drink> createFromParcel(Parcel in) {

            return new PresenterSettingDrink<>(in);
        }

        @Override
        public PresenterSettingDrink<? extends Drink>[] newArray(int size) {
            return new PresenterSettingDrink<?>[size];
        }
    };

    public ViewModelFactorySettingDrink<? extends Drink> getViewModelFactorySettingDrink(){return this.factorySettingDrink;}

    public ViewModelFactoryToolbar getViewModelFactoryToolbar() { return this.factoryToolbar; }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeParcelable(factorySettingDrink,flags);
        dest.writeParcelable(factoryToolbar,flags);


    }

}