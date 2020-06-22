package com.example.cookbookapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

public class RecipesViewholder extends RecyclerView.ViewHolder {

    private TextView txtUser;
    private TextView txtR_name;
    private TextView txtR_description;
    private SimpleDraweeView imgSender;

    public RecipesViewholder(@NonNull View itemView) {
        super(itemView);

        txtUser = itemView.findViewById(R.id.txt_User);
        txtR_name = itemView.findViewById(R.id.txt_R_name);
        txtR_description = itemView.findViewById(R.id.txt_R_description);
        imgSender = itemView.findViewById(R.id.img_sender);
    }

    public void bind(Recipes recipe){
        txtUser.setText(recipe.getUser());
        txtR_name.setText(recipe.getR_name());
        txtR_description.setText(recipe.getR_description());
        imgSender.setImageURI(recipe.getFood_picture());
    }
}
