package com.example.menu_proeficiencia.ui.bd_intern;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Banco de dados interno");
    }

    public LiveData<String> getText() {
        return mText;
    }
}