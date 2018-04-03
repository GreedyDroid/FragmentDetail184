package com.example.sayed.fragmentdetail184;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCountryList extends Fragment {

    private ListView countryLV;
    private MyItemClickListener myItemClickListener;

    public FragmentCountryList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_country_list, container, false);
        countryLV = v.findViewById(R.id.countryLVid) ;
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<CharSequence>adapter =  ArrayAdapter.createFromResource(getContext(), R.array.countries,android.R.layout.simple_list_item_1);
        countryLV.setAdapter(adapter);
        countryLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String countryName =  parent.getItemAtPosition(position).toString();
                myItemClickListener.getItem(countryName);
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myItemClickListener = (MyItemClickListener) context;
    }
}
