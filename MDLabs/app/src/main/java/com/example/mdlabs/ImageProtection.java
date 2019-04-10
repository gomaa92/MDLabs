package com.example.mdlabs;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ImageProtection extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    Button button;
    String name;
    String population;
    String rank;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_protection);

        imageView = findViewById(R.id.img);
        textView = findViewById(R.id.country);
        button = findViewById(R.id.button);

        Intent intent = getIntent();

        url = intent.getStringExtra("image");
        name = intent.getStringExtra("name");
        rank = intent.getStringExtra("rank");
        population = intent.getStringExtra("population");
        Glide.with(getApplicationContext()).load(url).into(imageView);

        textView.setText(name);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent1 = new Intent(ImageProtection.this, Details.class);
                //ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(ImageProtection.this,imageView
                //, ViewCompat.getTransitionName(imageView));
                intent1.putExtra("image", url);
                intent1.putExtra("name", name);
                intent1.putExtra("rank", rank);
                intent1.putExtra("population", population);

                startActivity(intent1);
                overridePendingTransition(R.anim.xmlslide_in_right , R.anim.xmlslide_out_left);

            }
        });

    }
}
