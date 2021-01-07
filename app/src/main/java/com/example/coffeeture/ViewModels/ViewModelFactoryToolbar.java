package com.example.coffeeture.ViewModels;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ViewModelFactoryToolbar implements ViewModelProvider.Factory, Parcelable {


    private final String headline;
    private final boolean backButton;
    private final boolean rinseButton;
    private final boolean optionsButton;

    public ViewModelFactoryToolbar(String headline,boolean backButton,boolean rinseButton,boolean optionsButton){

        this.headline = headline;
        this.backButton = backButton;
        this.rinseButton = rinseButton;
        this.optionsButton = optionsButton;
    }


    public static final Creator<ViewModelFactoryToolbar> CREATOR = new Creator<ViewModelFactoryToolbar>() {
        @Override
        public ViewModelFactoryToolbar createFromParcel(Parcel in) {

            return new ViewModelFactoryToolbar(in.readString(),in.readBoolean(),in.readBoolean(),in.readBoolean());
        }

        @Override
        public ViewModelFactoryToolbar[] newArray(int size) {
            return new ViewModelFactoryToolbar[size];
        }
    };

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        ViewModelToolbar viewModelToolbar = new ViewModelToolbar.ToolbarBuilder(headline)
                .setVisibilityForBackButton(backButton)
                .setVisibilityForOptionsButton(optionsButton)
                .setVisibilityForRinseButton(rinseButton)
                .build();

        return (T) viewModelToolbar;


    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(headline);
            dest.writeBoolean(backButton);
            dest.writeBoolean(rinseButton);
            dest.writeBoolean(optionsButton);
    }
}
