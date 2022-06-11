package com.example.recyclerviewaddresses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> strings;
    private int[] count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        strings = new ArrayList<>();
        count = new int[14];
        createData(count, strings);
        recyclerView = findViewById(R.id.recyclerview);
        AddressAdapter addressAdapter = new AddressAdapter(count, strings);
        recyclerView.setAdapter(addressAdapter);
    }

    private void createData(int[] ints, ArrayList<String> strings) {
        int n = 1;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = n++;
        }
        strings.add("Sovetskaya, 160");
        strings.add("Baha, 8");
        strings.add("Toktogula, 138");
        strings.add("Kievskaya, 10");
        strings.add("Chui, 17");
        strings.add("Moskovskaya, 211");
        strings.add("Almatinskaya, 4");
        strings.add("Ahunbaeva, 98");
        strings.add("Gagarina, 9");
        strings.add("Bokonbaeva, 66");
        strings.add("Toktonalieva, 17");
        strings.add("Maldybaeva, 77");
        strings.add("Tynalieva, 84");
        strings.add("Gorkaya, 12");
    }
}