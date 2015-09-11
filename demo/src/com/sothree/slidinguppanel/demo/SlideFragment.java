package com.sothree.slidinguppanel.demo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

/**
 * Created by alading on 9/11/15.
 */
public class SlideFragment extends Fragment {

    private static final String TAG = "DemoFragment";

    private SlidingUpPanelLayout mLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_slide, container, false);


        return rootView;
    }


}
