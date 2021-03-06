package com.example.cookbookapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

public class RecipesActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        // Make a reference to the RecyclerView
        progressBar = findViewById(R.id.progress_bar);
        recyclerView = findViewById(R.id.recycler_view);

        // Create and set a layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        //  create adapter Recipes[] recipe = loadRecipes();
        loadRecipes();


    }
    public void OnRecipesClick(View view){
        Intent intent= new Intent(this, RecipesDetailActivity.class);
        startActivity(intent);
    }

    private void loadRecipes() {
        // Show loading
        showloading(true);
        // Load data from server using Volley Library
        String url = "https://my.api.mockaroo.com/recipe.json?key=3f4ef750";

        //Create a request
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //convert json string to object using Gson
                Gson gson = new Gson();
                Recipes[] recipe = gson.fromJson(response, Recipes[].class);
                // Create and set an adapter
                RecipesAdapter adapter = new RecipesAdapter(recipe);
                recyclerView.setAdapter(adapter);
                showloading(false);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(RecipesActivity.this, "Something error while loading data from the server", Toast.LENGTH_LONG).show();
                Log.d("recipesapp", "Log data error: " + error.getMessage());
                showloading(false);
            }
        });

        //Add the request to the Queue
        Volley.newRequestQueue(this).add(request);

    }

    private void showloading(boolean state) {
        if (state) {
            progressBar.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.INVISIBLE);
        } else {
            recyclerView.setVisibility(View.VISIBLE);
            progressBar.setVisibility(View.INVISIBLE);

        }
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.activity_main_option, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (item.getItemId() == R.id.sort1) {
//            Toast.makeText(this, R.string.sort1, Toast.LENGTH_LONG).show();
//        } else if (item.getItemId() == R.id.sort2){
//            Toast.makeText(this, R.string.sort2, Toast.LENGTH_LONG).show();
//        }else if (item.getItemId() == R.id.sort3){
//            Toast.makeText(this, R.string.sort3, Toast.LENGTH_LONG).show();
//        }
//       return true;
//    }
}
//dummy data
//        Recipes recipe1 = new Recipes();
//        recipe1.setUser("Sarah");
//        recipe1.setR_name("Boiled Eggs");
//        recipe1.setR_description("First, fill a pot with water and boil the water till it bubbles. Then, slowly add your eggs in and cover the lid. Wait 5 minutes and your boiled eggs will be done.");
//
//        Recipes recipe2 = new Recipes();
//        recipe2.setUser("Jake");
//        recipe2.setR_name("Pancakes");
//        recipe2.setR_description("You will need a pancake mix. Crack some eggs into a mixing bowl and whisk it until it becomes smooth. Then, pour the pancake mix in and stir until it is combined. Cook it under medium heat and finally, serve it. ");
//
//        Recipes recipe3 = new Recipes();
//        recipe3.setUser("Peter");
//        recipe3.setR_name("Fried eggs");
//        recipe3.setR_description("Heat up some oil in a skillet. Crack and cook your eggs. Serve it with some bread or sauce.");
//
//        return new Recipes[] {recipe1,recipe2,recipe3};
// }
