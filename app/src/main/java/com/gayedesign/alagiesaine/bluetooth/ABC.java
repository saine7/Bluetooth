package com.gayedesign.alagiesaine.learnbasics;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ABC extends ListFragment {

    final String[] abcFragment = {"Capital letters","Small letters","ABC Video","Letters & meanings"};
    public ABC() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> abc = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,abcFragment);
        setListAdapter(abc);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        //String item = l.getItemAtPosition(position).toString();
        //Toast.makeText(getActivity(),"You clicked " + item, Toast.LENGTH_SHORT).show();
        if(l.getItemAtPosition(position) == "Capital letters"){
            Intent capitalLetters = new Intent(getActivity(),CapitalLetters.class);
            startActivity(capitalLetters);
        }else if (l.getItemAtPosition(position) == "Small letters"){
            Intent smallLetters = new Intent(getActivity(),SmallLetters.class);
            startActivity(smallLetters);
        }else if (l.getItemAtPosition(position) == "ABC Video"){
            Intent abcVideo = new Intent(getActivity(),AbcVideo.class);
            startActivity(abcVideo);
        }else if (l.getItemAtPosition(position) == "Letters & meanings"){
            Intent a_for_apple= new Intent(getActivity(),A_For_Apple.class);
            startActivity(a_for_apple);
        }
    }
}
