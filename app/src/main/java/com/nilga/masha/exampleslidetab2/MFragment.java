package com.nilga.masha.exampleslidetab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nilga.masha.exampleslidetab2.R;
import com.nilga.masha.exampleslidetab2.model.Request;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edwin on 15/02/2015.
 */
public class MFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ArrayList<Request> requests = new ArrayList<Request>();
    private static final String TAG = "myLogs";

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_short,container,false);
        ListView listView = (ListView)view.findViewById(R.id.listView);

        for (int i = 0; i<10; i++) {
            requests.add(new Request( i, "login" + i, 1));
            Log.d(TAG, "заявка " + i);
        }

        MListAdapter adapter = new MListAdapter(getActivity(), requests);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent(getActivity(), FullActivity.class);
        startActivity(intent);

    }
}
