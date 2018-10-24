package com.example.android.abndp5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragmnet extends Fragment {


    public AboutFragmnet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card,container,false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Bhubaneswar", "Bhubaneswar is an ancient city in India’s eastern state of Odisha, formerly Orissa. Many temples built from sandstone are dotted around Bindu Sagar Lake in the old city, including the 11th-century Hindu Lingaraja Temple. Outside Rajarani Temple are sculpted figures of the guardians of the 8 cardinal and ordinal directions. Jain antiques, weaponry and indigenous pattachitra paintings fill the Odisha State Museum.", R.drawable.bbsr));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.bg);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
