package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.view.View;
import java.lang.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View v) {
        EditText editBox = (EditText)findViewById(R.id.copyBox); //sets the EditText on screen to an object
        TextView pasteBox = (TextView)findViewById(R.id.pasteBox); //sets the TextView on screen to an object
        String enteredText = editBox.getText().toString(); //stores the current value of EditText into a variable
        pasteBox.setText(enteredText); //pastes the string entered into the EditText, into the TextView.

        
    }

}