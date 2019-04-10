package com.example.mdlabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Details extends AppCompatActivity {
    ImageView imageView;
    TextView name ;
    TextView rank ;
    TextView population ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.imageDeatails);
        name = findViewById(R.id.name);
        rank = findViewById(R.id.rank);
        population = findViewById(R.id.population);

        Intent intent = getIntent();
        Glide.with(this).load(intent.getStringExtra("image")).into(imageView);
        name.setText(intent.getStringExtra("name"));
        rank.setText(intent.getStringExtra("rank"));
        population.setText(intent.getStringExtra("population"));

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.xmlslide_out_right);
    }
}
