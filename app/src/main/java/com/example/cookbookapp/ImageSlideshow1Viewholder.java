package com.example.cookbookapp;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageSlideshow1Viewholder extends RecyclerView.ViewHolder {

    private ImageView imgSlide;

    public ImageSlideshow1Viewholder(@NonNull View itemView) {
        super(itemView);

        imgSlide = itemView.findViewById(R.id.img_slide);
    }

    public void bind(int imageId){
        imgSlide.setImageResource(imageId);
    }

}
