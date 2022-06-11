package com.example.recyclerviewaddresses;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AddressAdapter extends RecyclerView.Adapter<AddressViewHolder> {
    private int[] data1;
    private ArrayList<String> data2;


    public AddressAdapter(int[] data1, ArrayList<String> data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    @NonNull
    @Override
    public AddressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AddressViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_address, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AddressViewHolder holder, int position) {
        holder.bind(String.valueOf(data1[position]), data2.get(position));
    }

    @Override
    public int getItemCount() {
        return data2.size();
    }
}
