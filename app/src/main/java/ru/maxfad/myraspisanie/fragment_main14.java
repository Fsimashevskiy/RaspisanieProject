package ru.maxfad.myraspisanie;

/**
 * Created by maxfad on 01.12.2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_main14 extends ListFragment {
    String classID,tabID;
    ListAdapter adapter;
    public fragment_main14() {
        // Required empty public constructor
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Bundle bundle = getActivity().getIntent().getExtras();
        classID = bundle.getString("classID");

        Bundle bundle2 = getActivity().getIntent().getExtras();
        tabID = bundle2.getString("tabID");

        Toast.makeText(getActivity().getBaseContext(), classID+" / "+tabID, Toast.LENGTH_SHORT).show();


        switch (classID){

            case "Ю":
                adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.uroki11_ch));
                setListAdapter(adapter);
                break;
            case "СА":
                adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.uroki10_ch));
                setListAdapter(adapter);
                break;
            case "БИ":
                adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.uroki9_ch));
                setListAdapter(adapter);
                break;

            case "П":
                adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.uroki8_ch));
                setListAdapter(adapter);
                break;
            case "ИС":
                adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.uroki7_ch));
                setListAdapter(adapter);
                break;
            case "ПП":
                adapter = new ArrayAdapter<>(getActivity(),
                        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.uroki6_ch));
                setListAdapter(adapter);
                break;
        }



    }

}