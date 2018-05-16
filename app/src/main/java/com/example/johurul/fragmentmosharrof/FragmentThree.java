package com.example.johurul.fragmentmosharrof;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by JOHURUL on 2/27/2018.
 */

public class FragmentThree extends Fragment {

    View v3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v3 = inflater.inflate(R.layout.fragment_three_layout, container,false);
        return  v3;
    }
}
