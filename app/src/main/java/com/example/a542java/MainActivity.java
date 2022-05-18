package com.example.a542java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        recyclerView = findViewById(R.id.main_recyclerview_id);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        getAdapter(data());
    }

    public void getAdapter(ArrayList<VedioImage> list) {
        Adapters adapters = new Adapters(list, this);
        recyclerView.setAdapter(adapters);
    }

    public ArrayList<VedioImage> data() {
        ArrayList<VedioImage> list = new ArrayList<>();

        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "Add to Story"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "Alisher"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "Alisher"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "Great"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "Alisher"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "MAKE"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "Alisher"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "COOL MAN"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "Alisher"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "Alisher"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "aBBOS"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "Alisher"));
        list.add(new VedioImage(R.drawable.rasm, R.drawable.rasm10, "DRIVER"));

        return list;
    }
}