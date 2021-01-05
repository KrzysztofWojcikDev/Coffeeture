package com.example.coffeeture.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.io.Serializable;

public class ViewModelToolbar extends ViewModel implements Serializable {

    private final LiveData<String> headline ;
    private final LiveData<Boolean> visibilityForOptionsButton;
    private final LiveData<Boolean> visibilityForBackButton;
    private MutableLiveData<Boolean> visibilityForRinseButton;

    public ViewModelToolbar(){
        this.headline = new MutableLiveData<>("");
        this.visibilityForOptionsButton = new MutableLiveData<>(false);
        this.visibilityForRinseButton = new MutableLiveData<>(false);
        this.visibilityForBackButton = new MutableLiveData<>(false);
    }
    public static class ToolbarBuilder implements Serializable{
        String headline = "default headline";
        boolean visibilityForRinseButton = false;
        boolean visibilityForOptionsButton = false;
        boolean visibilityForBackButton = false;

        public ToolbarBuilder setHeadline(String headline) {
            this.headline = headline;
            return this;
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

