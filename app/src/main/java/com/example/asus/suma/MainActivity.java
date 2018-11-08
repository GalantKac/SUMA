package com.example.asus.suma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.liczba1);
        editText2 = (EditText) findViewById(R.id.liczba2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String liczba1 = editText1.getText().toString();
                String liczba2 = editText2.getText().toString();

                int l1 = Integer.valueOf(liczba1);
                int l2 = Integer.valueOf(liczba2);
                int suma= l1+l2;
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("suma", suma);
                startActivity(intent);

            }
        });
    }
}