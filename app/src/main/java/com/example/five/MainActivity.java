package com.example.five;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText usn,name;
    AutoCompleteTextView city;
    TextView textView;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] cities =new String[]{
                "BANGALORE",
                "MANGALORE",
                "HASSAN",
                "UDUPI",
                "TUMKUR"};
        usn = findViewById(R.id.usn);
        name = findViewById(R.id.name);
        submit = findViewById(R.id.submit);
        city = findViewById(R.id.city);
        textView = findViewById(R.id.textView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,cities);
        city.setAdapter(arrayAdapter);
//        city.setThreshold(1);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(usn.getText().toString()+"\n"+name.getText().toString()+"\n"+city.getText().toString());
            }
        });
    }
}