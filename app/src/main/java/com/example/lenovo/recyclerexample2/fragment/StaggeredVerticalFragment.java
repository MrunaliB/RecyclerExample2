package com.example.lenovo.recyclerexample2.fragment;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.lenovo.recyclerexample2.adapter.AdapterExample;
import com.example.lenovo.recyclerexample2.model.Picture;
import com.example.lenovo.recyclerexample2.R;

import java.util.ArrayList;


/**
 * Created by Mrunali on 8/26/2017.
 */
public class StaggeredVerticalFragment extends BaseFragment {

    public static StaggeredVerticalFragment newInstance() {
        return new StaggeredVerticalFragment();
    }

    @Override protected int getLayout() {
        return R.layout.fragment_base;
    }

    @Override protected RecyclerView.LayoutManager getLayoutManager() {
        return getStaggeredLayoutManager();
    }

    @Override protected AdapterExample getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExample(pictureList,R.layout.item_type_three);
    }

    private StaggeredGridLayoutManager getStaggeredLayoutManager() {

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(
                2, //number of grid columns
                StaggeredGridLayoutManager.VERTICAL);
        //Sets the gap handling strategy for StaggeredGridLayoutManager
        staggeredGridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);

        return staggeredGridLayoutManager;
    }
}

