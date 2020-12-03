package com.example.birthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {
     static String Extra_Name="name_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);
        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString(Extra_Name);
        TextView t1=(TextView)findViewById(R.id.birthdayGreeting);
        t1.setText("Happy Birthday\n"+name+"!");
    }
}