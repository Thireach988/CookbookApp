package com.example.cookbookapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecipesAdapter extends RecyclerView.Adapter<RecipesViewholder> {
    // Dataset
    private Recipes[] recipe;

    public RecipesAdapter(Recipes[] recipe) {
        this.recipe = recipe;
    }
    @NonNull
    @Override
    public RecipesViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Load a layout file
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.viewholder_recipes, parent, false);

        return new RecipesViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipesViewholder holder, int position) {
        Recipes recipes = recipe[position];
        holder.bind(recipes);
    }

    @Override
    public int getItemCount() {
        return recipe.length;
    }
}
