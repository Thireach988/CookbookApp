package com.example.cookbookapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class ImageSlideshow2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slide_show2);

        ViewPager2 viewPager2 = findViewById(R.id.view_pager2);

        int[] imageIds = new int[]{R.drawable.img_slide_1, R.drawable.img_slide_2, R.drawable.img_slide_3};
        ImageSlideshow2Adapter adapter = new ImageSlideshow2Adapter(imageIds);

        viewPager2.setAdapter(adapter);

    }
}
