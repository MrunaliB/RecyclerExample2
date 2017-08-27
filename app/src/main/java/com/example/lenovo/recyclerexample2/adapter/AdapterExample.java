package com.example.lenovo.recyclerexample2.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.recyclerexample2.R;
import com.example.lenovo.recyclerexample2.model.Picture;
import com.example.lenovo.recyclerexample2.presenter.RecyclerItemClickListener;

import java.util.ArrayList;


import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Mrunali on 8/26/2017.
 */
public class AdapterExample extends RecyclerView.Adapter<AdapterExample.ExampleHolder> {


    private ArrayList<Picture> pictureArrayList;
    private int itemLayout;
    private RecyclerItemClickListener recyclerItemClickListener;

    public void setRecyclerItemClickListener(RecyclerItemClickListener recyclerItemClickListener) {
        this.recyclerItemClickListener = recyclerItemClickListener;
    }


    public AdapterExample() {
    }

    public AdapterExample(ArrayList<Picture> pictureArrayList, int itemLayout) {
        this.pictureArrayList = pictureArrayList;
        this.itemLayout = itemLayout;
    }

    @Override
    public ExampleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ExampleHolder(view);
    }
    @Override
    public void onBindViewHolder(final ExampleHolder holder, final int position) {
        final Picture picture = pictureArrayList.get(position);
        holder.title.setText(picture.getName());
        holder.imageView.setImageResource(picture.getImage());
    }



    @Override
    public int getItemCount() {
        return pictureArrayList.size();
    }


    public class ExampleHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @Bind(R.id.txt_title)
        TextView title;
        @Bind(R.id.imageView)
        ImageView imageView;

        public ExampleHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            if (recyclerItemClickListener != null)
                recyclerItemClickListener.onItemClickListener(getAdapterPosition());
        }
    }


}
