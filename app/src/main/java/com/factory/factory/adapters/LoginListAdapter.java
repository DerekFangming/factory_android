package com.factory.factory.adapters;

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
        return 1;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 1:
                View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_login_logo, parent, false);
                return new ViewHolder(view1);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        View cell = holder.itemView;
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
