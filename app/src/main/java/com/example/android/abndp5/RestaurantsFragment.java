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
        words.add(new Word("Adda", "KIIT College Road, Patia, Bhubaneswar", R.drawable.adda));
        words.add(new Word("Moti Mahal ", "Nandankanan Rd, Patia, Bhubaneswar", R.drawable.mm));
        words.add(new Word("Barbeque Nation", "Chandrasekharpur, Bhubaneswar", R.drawable.bbqn));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.bg);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return  rootView;
    }

}
