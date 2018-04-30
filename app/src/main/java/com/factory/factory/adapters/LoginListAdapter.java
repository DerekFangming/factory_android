package com.factory.factory.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.factory.factory.R;

public class LoginListAdapter extends RecyclerView.Adapter<ViewHolder>  {

    public LoginListAdapter() {

    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 1;
        } else if (position < 3) {
            return 2;
        } else if (position == 3) {
            return 3;
        } else {
            return 4;
        }
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case 1:
                View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_login_logo, parent, false);
                return new ViewHolder(view1);
            case 2:
                View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_login_textview, parent, false);
                return new ViewHolder(view2);
            case 3:
                View view3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_login_button, parent, false);
                return new ViewHolder(view3);
            case 4:
                View view4 = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_login_options, parent, false);
                return new ViewHolder(view4);
            default:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_empty, parent, false);
                return new ViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        //View cell = holder.itemView;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
