package com.example.lenovo.recyclerexample2.presenter;

/**
 * Created by Mrunali on 8/26/2017.
 */
public interface Presenter <V> {

    void attachedView(V view);

    void detachView();

    void onResume();

    void onItemSelected(int position);
}
