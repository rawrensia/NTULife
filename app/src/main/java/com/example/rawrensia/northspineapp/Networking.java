package com.example.rawrensia.northspineapp;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

// In this case, the fragment displays simple text based on the page
public class Networking extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    public static Networking newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        Networking fragment = new Networking();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Inflate the fragment layout we defined above for this fragment
    // Set the associated text for the title

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_networking, container, false);
        //TextView club = (TextView) view.findViewById(R.id.club);
        GridView gridview2 = (GridView) view.findViewById(R.id.gridview2);
        gridview2.setAdapter(new ImageAdapterNetw(getActivity()));
        return view;
    }
}
