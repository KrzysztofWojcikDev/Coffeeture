package com.example.coffeeture.Presenters;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.coffeeture.DrinkClass.Drink;
import com.example.coffeeture.ViewModels.ViewModelSettingDrink;
import com.example.coffeeture.ViewModels.ViewModelToolbar;


public class PresenterSettingDrink <T extends Drink> implements Parcelable {

    private  ViewModelSettingDrink<T> viewModelSettingDrink;
    private  ViewModelToolbar viewModelToolbar;
    private  String drinkInt;



    public PresenterSettingDrink(T drink) {

        this.drinkInt = "10";
        this.viewModelSettingDrink = new ViewModelSettingDrink<>(drink);
        this.viewModelToolbar = new ViewModelToolbar.ToolbarBuilder(drink.getName())
                .setVisibilityForBackButton(true)
                .build();
    }

    protected PresenterSettingDrink(Parcel in) {
        drinkInt = in.readString();
        System.out.println(drinkInt +"czy tu?");

        this.viewModelSettingDrink = in.readParcelable(ViewModelSettingDrink.class.getClassLoader());

        this.viewModelToolbar = in.readParcelable(ViewModelToolbar.class.getClassLoader());
        System.out.println(viewModelToolbar.getHeadline().getValue()+"checking");
    }

    public static final Creator<PresenterSettingDrink<? extends Drink>> CREATOR = new Creator<PresenterSettingDrink<? extends Drink>>() {
        @Override
        public PresenterSettingDrink<? extends Drink> createFromParcel(Parcel in) {

            return new PresenterSettingDrink<>(in);
        }

        @Override
        public PresenterSettingDrink<? extends Drink>[] newArray(int size) {
            return new PresenterSettingDrink[size];
        }
    };

    public ViewModelSettingDrink<? extends Drink> getViewModelSettingDrink() { return this.viewModelSettingDrink;}

    public ViewModelToolbar getViewModelToolbar() { return this.viewModelToolbar; }

    public String getDrinkInt() { return this.drinkInt; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(drinkInt);
        dest.writeParcelable(viewModelSettingDrink,flags);
        dest.writeParcelable(viewModelToolbar,flags);

    }
}