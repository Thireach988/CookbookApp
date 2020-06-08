package com.example.cookbookapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class ImageSlideshow1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slide_show);
        ViewPager viewPager = findViewById(R.id.view_pager);
        int[] imageIds = new int[]{R.drawable.img_slide_1, R.drawable.img_slide_2, R.drawable.img_slide_3};
        ImageSlideshow1Adapter adapter = new ImageSlideshow1Adapter(imageIds);
        viewPager.setAdapter(adapter);
    }
}
