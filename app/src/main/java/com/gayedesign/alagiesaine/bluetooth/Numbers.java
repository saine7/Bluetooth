package com.gayedesign.alagiesaine.learnbasics;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Numbers extends ListFragment {
    MediaPlayer mediaPlayer;


    public Numbers() {
        // Required empty public constructor
    }
    final String[] numbersFragment = {"1 - 30","O-N-E 1","Singing the numbers"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> abc = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,numbersFragment);
        setListAdapter(abc);
        mediaPlayer = new MediaPlayer();
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
        if(l.getItemAtPosition(position) == "1 - 30"){
            Intent one_to_thirty = new Intent(getActivity(),Digits.class);
            startActivity(one_to_thirty);
        }else if(l.getItemAtPosition(position) == "O-N-E 1"){
            if (mediaPlayer.isPlaying()){
                mediaPlayer.pause();
            }
            if (!mediaPlayer.isPlaying()){
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.spellthenumbers);
                mediaPlayer.start();
            }

        }else if(l.getItemAtPosition(position) == "Singing the numbers"){
            if (mediaPlayer.isPlaying()){
                mediaPlayer.pause();
            }
            if (!mediaPlayer.isPlaying()){
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.one_to_20numbers);
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
