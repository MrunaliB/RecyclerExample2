package com.example.lenovo.recyclerexample2.presenter;

import com.example.lenovo.recyclerexample2.model.LoaderListener;
import com.example.lenovo.recyclerexample2.model.Picture;
import com.example.lenovo.recyclerexample2.model.PictureInteractor;
import com.example.lenovo.recyclerexample2.view.PictureMvpView;

import java.util.ArrayList;



/**
 * Created by Mrunali on 8/26/2017.
 */
public class PicturePresenter implements Presenter<PictureMvpView>, LoaderListener {

    private PictureMvpView pictureMvpView;
    private PictureInteractor pictureInteractor;

    public PicturePresenter() {
        pictureInteractor = new PictureInteractor();
    }

    @Override
    public void attachedView(PictureMvpView view) {
        if (view == null)
            throw new IllegalArgumentException("You can't set a null view");

        pictureMvpView = view;
    }

    @Override public void detachView() {
        pictureMvpView = null;
    }

    @Override public void onResume() {
        pictureMvpView.showProgress();
        pictureInteractor.loadItems(this);
    }

    @Override public void onItemSelected(int position) {
        pictureMvpView.showMessage(Integer.toString(position));

    }

    @Override public void onFinished(ArrayList<Picture> pictureList) {
        pictureMvpView.setItems(pictureList);
        pictureMvpView.hideProgress();
    }
}

