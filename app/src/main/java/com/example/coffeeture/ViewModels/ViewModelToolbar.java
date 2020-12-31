package com.example.coffeeture.ViewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelToolbar extends ViewModel {

    private MutableLiveData<String>headline;
    private MutableLiveData<Boolean>visibilityForRinseButton;
    private MutableLiveData<Boolean>visibilityForOptionsButton;
    private MutableLiveData<Boolean>visibilityForBackButton;

    public static class ToolbarBuilder{
        String headline = "default headline";
        boolean visibilityForRinseButton = false;
        boolean visibilityForOptionsButton = false;
        boolean visibilityForBackButton = false;

        public ToolbarBuilder setHeadline(String headline){
            this.headline = headline;
            return this;
        }
        public ToolbarBuilder setVisibilityForRinseButton(boolean visibilityForRinseButton){
            this.visibilityForRinseButton = visibilityForRinseButton;
            return this;
        }
        public ToolbarBuilder setVisibilityForOptionsButton(boolean visibilityForOptionsButton){
            this.visibilityForOptionsButton = visibilityForOptionsButton;
            return this;
        }
        public ToolbarBuilder setVisibilityForBackButton(boolean visibilityForBackButton){
            this.visibilityForBackButton = visibilityForBackButton;
            return this;
        }
        public ViewModelToolbar build(){
           return new ViewModelToolbar(this);
        }

    }

    private ViewModelToolbar(ToolbarBuilder toolbarBuilder){
        this.headline.setValue(toolbarBuilder.headline);
        this.visibilityForRinseButton.setValue(toolbarBuilder.visibilityForRinseButton);
        this.visibilityForOptionsButton.setValue(toolbarBuilder.visibilityForOptionsButton);
        this.visibilityForBackButton.setValue(toolbarBuilder.visibilityForBackButton);
    }

    public MutableLiveData<String> getHeadline() {
        return headline;
    }

    public MutableLiveData<Boolean> getVisibilityForRinseButton() {
        return visibilityForRinseButton;
    }

    public MutableLiveData<Boolean> getVisibilityForOptionsButton() {
        return visibilityForOptionsButton;
    }

    public MutableLiveData<Boolean> getVisibilityForBackButton() {
        return visibilityForBackButton;
    }
}
