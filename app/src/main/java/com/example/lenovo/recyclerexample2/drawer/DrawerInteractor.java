package com.example.lenovo.recyclerexample2.drawer;

import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;


/**
 * Created by Mrunali on 8/26/2017.
 */
public interface DrawerInteractor {
    void navigateTo(MenuItem item, DrawerLayout drawerLayout,DrawerListener listener);
}
