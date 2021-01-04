package com.example.coffeeture.ViewModels;

<<<<<<< HEAD

import androidx.lifecycle.LiveData;
=======
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelToolbar extends ViewModel {

<<<<<<< HEAD

    private final LiveData<String> headline;
    private final LiveData<Boolean>visibilityForOptionsButton;
    private final LiveData<Boolean>visibilityForBackButton;
    private MutableLiveData<Boolean>visibilityForRinseButton;
=======
    private MutableLiveData<String>headline;
    private MutableLiveData<Boolean>visibilityForRinseButton;
    private MutableLiveData<Boolean>visibilityForOptionsButton;
    private MutableLiveData<Boolean>visibilityForBackButton;
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52

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
<<<<<<< HEAD

        this.headline = new MutableLiveData<>(toolbarBuilder.headline);
        this.visibilityForRinseButton = new MutableLiveData<>(toolbarBuilder.visibilityForRinseButton);
        this.visibilityForOptionsButton = new MutableLiveData<>(toolbarBuilder.visibilityForOptionsButton);
        this.visibilityForBackButton = new MutableLiveData<>(toolbarBuilder.visibilityForBackButton);
    }

    public LiveData<String> getHeadline() {
=======
        this.headline.setValue(toolbarBuilder.headline);
        this.visibilityForRinseButton.setValue(toolbarBuilder.visibilityForRinseButton);
        this.visibilityForOptionsButton.setValue(toolbarBuilder.visibilityForOptionsButton);
        this.visibilityForBackButton.setValue(toolbarBuilder.visibilityForBackButton);
    }

    public MutableLiveData<String> getHeadline() {
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
        return headline;
    }

    public MutableLiveData<Boolean> getVisibilityForRinseButton() {
        return visibilityForRinseButton;
    }

<<<<<<< HEAD
    public LiveData<Boolean> getVisibilityForOptionsButton() {
        return visibilityForOptionsButton;
    }

    public LiveData<Boolean> getVisibilityForBackButton() {
        return visibilityForBackButton;
    }

    public void setVisibilityForRinseButton(boolean state){
        this.visibilityForRinseButton.setValue(state);
    }

=======
    public MutableLiveData<Boolean> getVisibilityForOptionsButton() {
        return visibilityForOptionsButton;
    }

    public MutableLiveData<Boolean> getVisibilityForBackButton() {
        return visibilityForBackButton;
    }
>>>>>>> 825079d4b611db42f85afc30ccf6928bba2eaa52
}
