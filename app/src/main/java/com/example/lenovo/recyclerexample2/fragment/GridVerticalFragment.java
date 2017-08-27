package com.example.lenovo.recyclerexample2.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lenovo.recyclerexample2.adapter.AdapterExample;
import com.example.lenovo.recyclerexample2.model.Picture;
import com.example.lenovo.recyclerexample2.R;

import java.util.ArrayList;



/**
 * Created by Mrunali on 8/27/2017.
 */
public class GridVerticalFragment extends BaseFragment {

    public static GridVerticalFragment newInstance() {
        return new GridVerticalFragment();
    }

    @Override protected int getLayout() {
        return R.layout.fragment_base;
    }

    @Override protected RecyclerView.LayoutManager getLayoutManager() {
        return getGridLayoutManager();
    }


    @Override protected AdapterExample getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExample(pictureList,R.layout.item_type_two);
    }


    private GridLayoutManager getGridLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(
                getActivity(),
                2,
                GridLayoutManager.VERTICAL,
                false);

        return gridLayoutManager;
    }
}

