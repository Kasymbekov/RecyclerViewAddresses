package com.example.recyclerviewaddresses;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    private TextView textView2;

    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.counter);
        textView2 = itemView.findViewById(R.id.textView);
    }

    public void bind(String tv, String tv2) {
        textView.setText(tv);
        textView2.setText(tv2);
    }
}
