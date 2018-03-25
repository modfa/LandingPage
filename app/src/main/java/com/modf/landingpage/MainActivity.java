package com.modf.landingpage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding the imageView for the "Playstore"
        ImageView imageView = findViewById(R.id.google_play);
        // Setting onClickListener on this imageView to open the playstore page to download the app
        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                intent = new Intent(android.content.Intent.ACTION_VIEW);

                //Copy App URL from Google Play Store.
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.youtube&hl=en"));

                startActivity(intent);

            }
        });
        // Finding the imageView for the "Apple store"
        ImageView imageView2 = findViewById(R.id.apple_store);
        // Setting onClickListener on this imageView to open the itune/apple page to download the app
        imageView2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                intent = new Intent(android.content.Intent.ACTION_VIEW);

                //Copy App URL from Google Play Store.
                intent.setData(Uri.parse("https://itunes.apple.com/us/app/youtube-watch-listen-stream/id544007664?mt=8"));

                startActivity(intent);

            }
        });
        // Finding the tetview for the "Know more"
        TextView textView1 = findViewById(R.id.wiki_youtube);
        // set on click listener to this textview which will open the wiki page for youtube
        textView1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                intent = new Intent(android.content.Intent.ACTION_VIEW);

                //Copy App URL from Google Play Store.
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/YouTube"));

                startActivity(intent);

            }
        });
        // Finding the imageView for the "Know more"
        ImageView imageView3 = findViewById(R.id.play_button);
        // Setting onClickListener on this imageView to open the wiki/youtube page
        imageView3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                intent = new Intent(android.content.Intent.ACTION_VIEW);

                //Copy App URL from Google Play Store.
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/YouTube"));

                startActivity(intent);

            }
        });
    }
    }


