package com.gayedesign.alagiesaine.learnbasics;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.MediaController;
import android.widget.VideoView;

public class A_For_Apple extends AppCompatActivity{
    VideoView videoView;
    MediaController mediaController;
    DisplayMetrics displayMetrics;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_for_apple);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        videoView = (VideoView) findViewById(R.id.a_for_apple);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        displayMetrics = new DisplayMetrics();

        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        Uri uri = Uri.parse("android.resource://com.gayedesign.alagiesaine.learnbasics/"+R.raw.a_for_apple);

        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        videoView.requestFocus();
        videoView.setMinimumHeight(height);
        videoView.setMinimumWidth(width);
        videoView.start();
    }
}
