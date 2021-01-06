package com.example.coffeeture.ViewModels;

import android.app.Application;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelToolbar extends ViewModel implements Parcelable {

    private  LiveData<String>  headline ;
    private  LiveData<Boolean> visibilityForOptionsButton;
    private  LiveData<Boolean> visibilityForBackButton;
    private  MutableLiveData<Boolean> visibilityForRinseButton;

    public ViewModelToolbar(){

    }//this constructor is only for ViewModelProvider


    public static class ToolbarBuilder {
        private final String headline;
        private boolean visibilityForRinseButton = false;
        private boolean visibilityForOptionsButton = false;
        private boolean visibilityForBackButton = false;

        public ToolbarBuilder(String headline){
            this.headline = headline;
        }

        public ToolbarBuilder setVisibilityForRinseButton(boolean visibilityForRinseButton) {
            this.visibilityForRinseButton = visibilityForRinseButton;
            return this;
        }

        public ToolbarBuilder setVisibilityForOptionsButton(boolean visibilityForOptionsButton) {
            this.visibilityForOptionsButton = visibilityForOptionsButton;
            return this;
        }

        public ToolbarBuilder setVisibilityForBackButton(boolean visibilityForBackButton) {
            this.visibilityForBackButton = visibilityForBackButton;
            return this;
        }

        public ViewModelToolbar build() {
            return new ViewModelToolbar(this);
        }

    }


    private ViewModelToolbar(ToolbarBuilder toolbarBuilder) {

        this.headline = new MutableLiveData<>(toolbarBuilder.headline);
        this.visibilityForRinseButton = new MutableLiveData<>(toolbarBuilder.visibilityForRinseButton);
        this.visibilityForOptionsButton = new MutableLiveData<>(toolbarBuilder.visibilityForOptionsButton);
        this.visibilityForBackButton = new MutableLiveData<>(toolbarBuilder.visibilityForBackButton);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.headline.getValue());
        dest.writeBoolean(this.visibilityForBackButton.getValue());
        dest.writeBoolean(this.visibilityForOptionsButton.getValue());
        dest.writeBoolean(this.visibilityForRinseButton.getValue());

    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ViewModelToolbar> CREATOR = new Creator<ViewModelToolbar>() {
        @Override
        public ViewModelToolbar createFromParcel(Parcel in) {

            return new ViewModelToolbar.ToolbarBuilder(in.readString())
                    .setVisibilityForBackButton(in.readBoolean())
                    .setVisibilityForRinseButton(in.readBoolean())
                    .setVisibilityForOptionsButton(in.readBoolean())
                    .build();
        }

        @Override
        public ViewModelToolbar[] newArray(int size) {
            return new ViewModelToolbar[size];
        }
    };

    public LiveData<String> getHeadline() {
        return this.headline;
    }

    public MutableLiveData<Boolean> getVisibilityForRinseButton() {
        return visibilityForRinseButton;
    }

    public LiveData<Boolean> getVisibilityForOptionsButton() {
        return visibilityForOptionsButton;
    }

    public LiveData<Boolean> getVisibilityForBackButton() {
        return visibilityForBackButton;
    }

    public void setVisibilityForRinseButton(boolean state) {
        this.visibilityForRinseButton.setValue(state);
    }

}

