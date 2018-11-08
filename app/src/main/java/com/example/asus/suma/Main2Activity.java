package com.example.asus.suma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        int suma = getIntent().getIntExtra("suma",0);
        String wynik = String.valueOf(suma);
        textView = (TextView)findViewById(R.id.wynik);
        textView.setText(wynik);


    }
}
