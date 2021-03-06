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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card,container,false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.ht1), getString(R.string.ht1_add), R.drawable.he));
        words.add(new Word(getString(R.string.ht2), getString(R.string.ht2_add), R.drawable.emp));
        words.add(new Word(getString(R.string.ht3), getString(R.string.ht3_add), R.drawable.gin));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.bg);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return  rootView;
    }

}
