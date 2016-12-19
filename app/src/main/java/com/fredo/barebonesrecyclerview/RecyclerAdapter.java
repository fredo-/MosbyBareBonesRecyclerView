package com.fredo.barebonesrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by alfredovelasco on 12/10/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CustomHolder> {
    private int[] data;

    public RecyclerAdapter(int[] data) {
        this.data = data;
    }

    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutInflater = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new CustomHolder(layoutInflater);
    }

    @Override
    public void onBindViewHolder(CustomHolder holder, int position) {
        holder.bindData(position);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class CustomHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView textDisplay;

        public CustomHolder(View itemView) {
            super(itemView);

            textDisplay = (TextView) itemView.findViewById(R.id.text_display);
            itemView.setOnClickListener(this);
        }

        public void bindData(int position){
            textDisplay.setText(Integer.toString(data[position]));
        }

        @Override
        public void onClick(View view) {

        }
    }
}
