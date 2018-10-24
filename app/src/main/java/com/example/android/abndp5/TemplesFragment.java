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
        words.add(new Word("Lingaraja Temple", "Rath Rd, Lingaraj Nagar, Old Town, Bhubaneswar", R.drawable.lt));
        words.add(new Word("ISKCON Temple", " Nayapalli, Bhubaneswar", R.drawable.isc));
        words.add(new Word("Jagannath Temple", "Puri, Odisha", R.drawable.jj));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.bg);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return  rootView;
    }

}
