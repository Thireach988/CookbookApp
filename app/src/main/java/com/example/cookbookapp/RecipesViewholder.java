package com.example.cookbookapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecipesViewholder extends RecyclerView.ViewHolder {

    private TextView txtUser;
    private TextView txtR_name;
    private TextView txtR_description;

    public RecipesViewholder(@NonNull View itemView) {
        super(itemView);

        txtUser = itemView.findViewById(R.id.txt_User);
        txtR_name = itemView.findViewById(R.id.txt_R_name);
        txtR_description = itemView.findViewById(R.id.txt_R_description);
    }

    public void bind(Recipes email){
        txtUser.setText(email.getUser());
        txtR_name.setText(email.getR_name());
        txtR_description.setText(email.getR_description());
    }
}
