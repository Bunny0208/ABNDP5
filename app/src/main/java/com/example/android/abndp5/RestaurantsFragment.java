package com.example.android.abndp5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card,container,false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.res1), getString(R.string.res1_add), R.drawable.adda));
        words.add(new Word(getString(R.string.res2), getString(R.string.res2_add), R.drawable.mm));
        words.add(new Word(getString(R.string.res3), getString(R.string.res3_add), R.drawable.bbqn));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.bg);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return  rootView;
    }

}
