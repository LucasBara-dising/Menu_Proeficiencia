package com.example.menu_proeficiencia.ui.bd_interno;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Bd_internoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Bd_internoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}