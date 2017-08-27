package com.example.lenovo.recyclerexample2.drawer;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import com.example.lenovo.recyclerexample2.fragment.GridHorizontalFragment;
import com.example.lenovo.recyclerexample2.fragment.GridQualifiersVerticalFragment;
import com.example.lenovo.recyclerexample2.fragment.GridSpanSizeVerticalFragment;
import com.example.lenovo.recyclerexample2.fragment.GridVerticalFragment;
import com.example.lenovo.recyclerexample2.fragment.ItemTypesVerticalFragment;
import com.example.lenovo.recyclerexample2.fragment.LinearHorizontalFragment;
import com.example.lenovo.recyclerexample2.fragment.LinearVerticalFragment;
import com.example.lenovo.recyclerexample2.fragment.StaggeredHorizontalFragment;
import com.example.lenovo.recyclerexample2.fragment.StaggeredVerticalFragment;
import com.example.lenovo.recyclerexample2.R;


/**
 * Created by Mrunali on 8/26/2017.
 */
public class DrawerInteractorImpl implements DrawerInteractor {

    @Override
    public void navigateTo(MenuItem item, DrawerLayout drawerLayout, DrawerListener listener) {

        switch (item.getItemId()) {
            case R.id.nav_linear_v:
                listener.fragmentReplace(LinearVerticalFragment.newInstance());
                break;
            case R.id.nav_linear_h:
                listener.fragmentReplace(LinearHorizontalFragment.newInstance());
                break;
            case R.id.nav_grid_v:
                listener.fragmentReplace(GridVerticalFragment.newInstance());
                break;
            case R.id.nav_grid_h:
                listener.fragmentReplace(GridHorizontalFragment.newInstance());
                break;
            case R.id.nav_grid_span:
                listener.fragmentReplace(GridSpanSizeVerticalFragment.newInstance());
                break;
            case R.id.nav_staggered_v:
                listener.fragmentReplace(StaggeredVerticalFragment.newInstance());
                break;
            case R.id.nav_staggered_h:
                listener.fragmentReplace(StaggeredHorizontalFragment.newInstance());
                break;

            case R.id.nav_item_types:
                listener.fragmentReplace(ItemTypesVerticalFragment.newInstance());
                break;


            case R.id.nav_item_qualifiers:
                listener.fragmentReplace(GridQualifiersVerticalFragment.newInstance());
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
    }
}

