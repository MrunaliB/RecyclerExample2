package com.example.lenovo.recyclerexample2.fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lenovo.recyclerexample2.adapter.AdapterExample;
import com.example.lenovo.recyclerexample2.model.Picture;
import com.example.lenovo.recyclerexample2.R;

import java.util.ArrayList;



/**
 * Created by Mrunali on 8/25/2017.
 */
public class GridSpanSizeVerticalFragment extends BaseFragment {

    public static GridSpanSizeVerticalFragment newInstance() {
        return new GridSpanSizeVerticalFragment();
    }


    @Override
    protected int getLayout() {
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

        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                //stagger rows custom
                return (position % 3 == 0 ? 2 : 1);
            }
        });


        return gridLayoutManager;
    }
}

