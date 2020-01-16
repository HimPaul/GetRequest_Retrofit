package com.example.admin.retrofitget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by admin on 9/16/2019.
 */

public class DataViewHolder extends RecyclerView.ViewHolder {
    TextView name,hobby;
    public DataViewHolder(View itemView) {
        super(itemView);
        name =itemView.findViewById(R.id.name);
        hobby =itemView.findViewById(R.id.hobby);
    }
}
