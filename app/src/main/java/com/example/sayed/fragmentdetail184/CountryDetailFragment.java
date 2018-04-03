package com.example.sayed.fragmentdetail184;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CountryDetailFragment extends Fragment {
    private TextView countryName;

    public CountryDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_country_detail, container, false);
        countryName = v.findViewById(R.id.countryNameId);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        countryName.setText(getArguments().getString("country"));
       // Toast.makeText(getContext(), ""+getArguments().get("country"), Toast.LENGTH_SHORT).show();

    }
}
