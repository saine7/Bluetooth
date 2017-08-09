package com.gayedesign.alagiesaine.learnbasics;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Songs extends ListFragment {
    MediaPlayer mediaPlayer;


    public Songs() {
        // Required empty public constructor
    }

    final String[] songs = {"Twinkle twinkle little star", "London bridge is falling down", "Marry had a little lamb", "Three little kittens",
            "Wheels on the bus", "The butterfly", "Finger family cat family", "Five little monkeys", "Little snowflake",
             "A B C D", "A for Apple"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> abc = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, songs);
        setListAdapter(abc);
        mediaPlayer = new MediaPlayer();
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }

        if (l.getItemAtPosition(position) == "Twinkle twinkle little star") {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.twinkle_twinkle_little_star);
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            } else {
                mediaPlayer.start();
            }

        } else if (l.getItemAtPosition(position) == "London bridge is falling down") {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.londonbridgeisfallingdown);
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            } else {
                mediaPlayer.start();
            }
        } else if (l.getItemAtPosition(position) == "Marry had a little lamb") {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.maryhadalittlelamb);
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            } else {
                mediaPlayer.start();
            }

        } else if (l.getItemAtPosition(position) == "Three little kittens") {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.threelittlekittens);
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            } else {
                mediaPlayer.start();
            }

        } else if (l.getItemAtPosition(position) == "Wheels on the bus") {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wheelsonthebus);
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            } else {
                mediaPlayer.start();
            }

        }else if (l.getItemAtPosition(position) ==  "The butterfly"){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.thebutterfly);
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
            }else {
                mediaPlayer.start();
            }

        }else if (l.getItemAtPosition(position) == "Finger family cat family"){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.fingerfamilycatfamily);
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
            }else {
                mediaPlayer.start();
            }

        }else if (l.getItemAtPosition(position) == "Five little monkeys"){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.five_little_monkeys);
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
            }else {
                mediaPlayer.start();
            }

        }else if (l.getItemAtPosition(position) ==  "Little snowflake"){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.littlesnowflake);
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
            }else {
                mediaPlayer.start();
            }

        }else if (l.getItemAtPosition(position) == "A B C D"){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.abcdef);
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
            }else {
                mediaPlayer.start();
            }

        }else if (l.getItemAtPosition(position) == "A for Apple"){
            mediaPlayer = MediaPlayer.create(getActivity(),R.raw.a_for_appl_audio);
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
            }else {
                mediaPlayer.start();
            }

        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }
}