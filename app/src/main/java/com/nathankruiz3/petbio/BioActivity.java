package com.nathankruiz3.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private TextView nameTextView, bioTextView;
    private ImageView imageView;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        imageView = (ImageView) findViewById(R.id.imageView);
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        bioTextView = (TextView) findViewById(R.id.bioTextView);

        extras = getIntent().getExtras();

        if(extras != null) {
            String name = extras.getString("name");
            String bio = extras.getString("bio");
             setUp(name, bio);
        }
    }

    public void setUp(String name, String bio) {
        if (name.equals("Duffus")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.imageedit_3_8970612304));
            nameTextView.setText(name);
            bioTextView.setText(bio);
        } else if (name.equals("Jarvis")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.cat_icon));
            nameTextView.setText(name);
            bioTextView.setText(bio);
        }
    }
}