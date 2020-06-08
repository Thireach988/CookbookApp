package com.example.cookbookapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecipesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        // Make a reference to the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        // Create and set a layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        // Create and set an adapter
       Recipes[] recipe = loadRecipes();
        RecipesAdapter adapter = new RecipesAdapter(recipe);
        recyclerView.setAdapter(adapter);
    }
    private Recipes[] loadRecipes() {
        Recipes recipe1 = new Recipes();
        recipe1.getUser();
        recipe1.getR_name();
        recipe1.getR_description();

        Recipes recipe2 = new Recipes();
        recipe2.getUser();
        recipe2.getR_name();
        recipe2.getR_description();

        Recipes recipe3 = new Recipes();
        recipe3.getUser();
        recipe3.getR_name();
        recipe3.getR_description();

        return new Recipes[] {recipe1,recipe2,recipe3};
    }

}
