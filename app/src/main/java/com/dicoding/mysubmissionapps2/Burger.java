package com.dicoding.mysubmissionapps2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Burger extends AppCompatActivity {

    private RecyclerView rvBurgers;
    private ArrayList<Food> list =  new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);

        rvBurgers = findViewById(R.id.recycleView);
        list.addAll(BurgerData.getListData());
        showRecyclerList();


    }


    private void showRecyclerList() {
        rvBurgers.setLayoutManager(new LinearLayoutManager(this));
        BurgerDataAdapter burgerDataAdapter = new BurgerDataAdapter(list);
        rvBurgers.setAdapter(burgerDataAdapter);
    }


}
