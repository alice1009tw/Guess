package com.fju.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guess(View view){
        EditText edNumber = (EditText) findViewById(R.id.ed_number);
        int number = Integer.parseInt(edNumber.getText().toString());
        int random;
        random = (int)(Math.random()*10)+1;
        if(number < random) {
            Toast.makeText(this, "大一點", Toast.LENGTH_LONG).show();
        }else if(number > random){
            Toast.makeText(this, "小一點", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "答對了", Toast.LENGTH_LONG).show();

        }
    }
}
