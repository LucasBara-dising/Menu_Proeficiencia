package com.example.menu_proeficiencia.ui.bd_externo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Banco de dados externo");
    }

    public LiveData<String> getText() {
        return mText;
    }
}