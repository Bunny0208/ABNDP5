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
public class TemplesFragment extends Fragment {


    public TemplesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card,container,false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.temp1), getString(R.string.temp1_add), R.drawable.lt));
        words.add(new Word(getString(R.string.temp2), getString(R.string.temp2_add), R.drawable.isc));
        words.add(new Word(getString(R.string.temp3), getString(R.string.temp3_add), R.drawable.jj));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.bg);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return  rootView;
    }

}
