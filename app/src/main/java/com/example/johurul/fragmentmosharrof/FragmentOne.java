package com.example.johurul.fragmentmosharrof;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by JOHURUL on 2/27/2018.
 */

public class FragmentOne extends Fragment{

    View v;
    Button b;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_one_layout, container,false);

        b = (Button) v.findViewById(R.id.my_site_button);

       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getActivity(),"clicked on button",Toast.LENGTH_SHORT).show();
           }
       });
        return  v;
    }
}
