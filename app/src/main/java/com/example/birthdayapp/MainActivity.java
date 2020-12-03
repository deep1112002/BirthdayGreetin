package com.example.birthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String s;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createBirthdayCard(View view) {
        /*
        Toast.makeText(this,"Name is "+ s,Toast.LENGTH_LONG).show();*/
        name=(EditText)findViewById(R.id.nameInput);
        s=name.getText().toString();
        Intent i1=new Intent(this,BirthdayGreetingActivity.class);
        i1.putExtra(BirthdayGreetingActivity.Extra_Name,s);
        startActivity(i1);
    }

}