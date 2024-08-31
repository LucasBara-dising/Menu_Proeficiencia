package com.example.menu_proeficiencia.ui.geo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Acessa Geolocalizão");
    }

    public LiveData<String> getText() {
        return mText;
    }
}