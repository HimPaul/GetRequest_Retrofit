package com.example.admin.retrofitget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by admin on 9/16/2019.
 */

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {

    private List<DataSet> list;
    private Context context;

    public DataAdapter(List<DataSet> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int i) {

        DataSet currentdata = list.get(i);
        holder.name.setText(currentdata.getName());
        holder.hobby.setText(currentdata.getHobby());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
