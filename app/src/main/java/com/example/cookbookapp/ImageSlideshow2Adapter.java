package com.example.cookbookapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageSlideshow2Adapter extends RecyclerView.Adapter<ImageSlideshow1Viewholder> {

    private int[] imageIds;

    public ImageSlideshow2Adapter(int[] imageIds){
        this.imageIds =imageIds;
    }

    @NonNull
    @Override
    public ImageSlideshow1Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_image_slide_item,parent, false);
        return new ImageSlideshow1Viewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageSlideshow1Viewholder holder, int position) {
        int imageId = imageIds[position];
        holder.bind(imageId);
    }

    @Override
    public int getItemCount() {
        return imageIds.length;
    }
}
