package com.nilga.masha.exampleslidetab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.nilga.masha.exampleslidetab2.model.Request;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Masha on 23.06.2015.
 */
public class MListAdapter extends BaseAdapter{

    private Context cont;
    private ArrayList<Request> requests = new ArrayList<Request>();
    private LayoutInflater layInflater;

    MListAdapter(Context context, ArrayList<Request> req){
        cont = context;
        requests = req;
        layInflater = (LayoutInflater)cont.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return requests.size();
    }

    @Override
    public Object getItem(int position) {
        return requests.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = layInflater.inflate(R.layout.format_list, parent, false);
        Request r = (Request)getItem(position);
        ((TextView) view.findViewById(R.id.login)).setText(r.getLogin());
        ((TextView) view.findViewById(R.id.address)).setText("" + r.getNumber());


        return view; }
}
