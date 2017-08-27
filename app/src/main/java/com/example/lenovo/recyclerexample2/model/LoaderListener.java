package com.example.lenovo.recyclerexample2.model;

import java.util.ArrayList;
import com.example.lenovo.recyclerexample2.model.Picture;



/**
 * Created by Mrunali on 8/25/2017.
 */
public interface LoaderListener {

    void onFinished(ArrayList<Picture> pictureList);
}
