package com.example.lenovo.recyclerexample2.model;

import android.os.Handler;

import com.example.lenovo.recyclerexample2.R;

import java.util.ArrayList;

/**
 * Created by Mrunali on 8/25/2017.
 */
public class PictureInteractor implements Interactor {

    private final static String[] pictureNames = {
            "Rocket in the universe",
            "A scene in London",
            "Moon over mountains",
            "A simple moon",
            "Sun and volcano",
            "A collection of mountains",
            "River between mountains",
            "Some pine trees",
            "On Small Town",
            "Volcanos reflection"

    };

    private final static int  pictureImages[] = {
            R.drawable.cohete_flat,
            R.drawable.london_flat,
            R.drawable.material_flat,
            R.drawable.moon_flat,
            R.drawable.mountain_flat,
            R.drawable.mountain_mo_flat,
            R.drawable.mountain_go_flat,
            R.drawable.pine_flat,
            R.drawable.towers_flat,
            R.drawable.vulcan_flat

    };


    @Override
    public void loadItems(final LoaderListener loaderListener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loaderListener.onFinished(createCollectionPictures());
            }
        }, 2000);
    }


    private ArrayList<Picture> createCollectionPictures() {




        ArrayList<Picture> pictures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Picture picture = new Picture(pictureNames[i], pictureImages[i]);
            pictures.add(picture);
        }


        return pictures;

    }
}

