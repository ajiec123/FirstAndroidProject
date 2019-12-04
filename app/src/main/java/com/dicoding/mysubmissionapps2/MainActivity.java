package com.dicoding.mysubmissionapps2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView btnMoveBurger = findViewById(R.id.btn_move_burger);
        btnMoveBurger.setOnClickListener(this);
    }


    public void onClick(View v) {
        if (v.getId() == R.id.btn_move_burger) {
            Intent moveIntent = new Intent(MainActivity.this, Burger.class);
            startActivity(moveIntent);
        }
    }

}
