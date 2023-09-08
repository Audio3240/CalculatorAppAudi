package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int numInput;
    public void numSelected(View v){
        if(v.getId()==R.id.b0){
            numInput = 0;
            Log.i("Trairat", "0 Clicked");
        }
    }
}