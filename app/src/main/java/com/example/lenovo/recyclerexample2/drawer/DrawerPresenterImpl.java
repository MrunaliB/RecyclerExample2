package com.example.lenovo.recyclerexample2.drawer;

import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

/**
 * Created by Mrunali on 8/26/2017.
 */
public class DrawerPresenterImpl implements DrawerPresenter, DrawerListener {

    DrawerInteractorImpl drawerInteractor;
    DrawerView drawerView;

    public DrawerPresenterImpl(DrawerView drawerView) {
        this.drawerView = drawerView;
        drawerInteractor = new DrawerInteractorImpl();
    }

    @Override
    public void navigationItemSelected(MenuItem item, DrawerLayout drawerLayout) {
        drawerInteractor.navigateTo(item, drawerLayout, this);
    }

    @Override
    public void fragmentReplace(Fragment fragment) {
        drawerView.navigateUsingTo(fragment);
    }

    public interface DrawerView {
        void navigateUsingTo(Fragment fragment);
    }

}

