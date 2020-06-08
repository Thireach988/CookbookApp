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
        recipe1.setUser("Sarah");
        recipe1.setR_name("Boiled Eggs");
        recipe1.setR_description("First, fill a pot with water and boil the water till it bubbles. Then, slowly add your eggs in and cover the lid. Wait 5 minutes and your boiled eggs will be done.");

        Recipes recipe2 = new Recipes();
        recipe2.setUser("Jake");
        recipe2.setR_name("Pancakes");
        recipe2.setR_description("You will need a pancake mix. Crack some eggs into a mixing bowl and whisk it until it becomes smooth. Then, pour the pancake mix in and stir until it is combined. Cook it under medium heat and finally, serve it. ");

        Recipes recipe3 = new Recipes();
        recipe3.setUser("Peter");
        recipe3.setR_name("Fried eggs");
        recipe3.setR_description("Heat up some oil in a skillet. Crack and cook your eggs. Serve it with some bread or sauce. ");

        return new Recipes[] {recipe1,recipe2,recipe3};
    }

}
