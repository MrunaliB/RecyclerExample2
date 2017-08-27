package com.example.lenovo.recyclerexample2.view;

import com.example.lenovo.recyclerexample2.model.Picture;

import java.util.ArrayList;



/**
 * Created by Mrunali on 8/26/2017.
 */
public interface PictureMvpView {

    void setItems(ArrayList<Picture> pictureList);

    void showProgress();

    void hideProgress();

    void showMessage(String message);

}

