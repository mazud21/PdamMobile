package com.pdammobile.pengaduan_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pdammobile.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pengaduan_Frag extends Fragment {


    public Pengaduan_Frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pengaduan_frag, container, false);
    }

}
