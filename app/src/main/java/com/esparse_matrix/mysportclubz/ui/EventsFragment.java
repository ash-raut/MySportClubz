package com.esparse_matrix.mysportclubz.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esparse_matrix.mysportclubz.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_events, container, false);
        return root;
    }

}
