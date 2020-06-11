package com.nathankruiz3.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView catImageView, dogImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catImageView = (ImageView) findViewById(R.id.catImageView);
        dogImageView = (ImageView) findViewById(R.id.dogImageView);
        catImageView.setOnClickListener(this);
        dogImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.catImageView: {
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Jarvis");
                catIntent.putExtra("bio", "Great cat, loves people, and meows a lot!");
                startActivity(catIntent);
            } break;
            case R.id.dogImageView: {
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Duffus");
                dogIntent.putExtra("bio", "Great dog, loves people, and eats a lot!");
                startActivity(dogIntent);
            } break;
        }
    }
}