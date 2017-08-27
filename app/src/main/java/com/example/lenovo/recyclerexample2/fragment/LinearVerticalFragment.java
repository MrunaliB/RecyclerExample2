package com.example.lenovo.recyclerexample2.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lenovo.recyclerexample2.adapter.AdapterExample;
import com.example.lenovo.recyclerexample2.model.Picture;
import com.example.lenovo.recyclerexample2.R;

import java.util.ArrayList;



/**
 * Created by Mrunali on 8/26/2017.
 */
public class LinearVerticalFragment extends BaseFragment {


    public static LinearVerticalFragment newInstance() {
        return new LinearVerticalFragment();
    }


    @Override protected int getLayout() {
        return R.layout.fragment_base;
    }

    @Override protected RecyclerView.LayoutManager getLayoutManager() {
        return getLinearLayoutManager();
    }


    @Override protected AdapterExample getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExample(pictureList, R.layout.item_type_one);


    }

    private LinearLayoutManager getLinearLayoutManager() {
        return new LinearLayoutManager(
                getActivity(),
                LinearLayoutManager.VERTICAL,
                false);


    }
}


