package com.example.registration;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton maleRadioButton = findViewById(R.id.radioMale);
        final RadioButton femaleRadioButton = findViewById(R.id.radioFemale);
        maleRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Male is Selected", Toast.LENGTH_SHORT).show();

                /*  if (isChecked) {
                    maleRadioButton.setTextColor(getApplicationContext().getResources().getColor(R.color.colorPrimary));
                }
                else {
                    maleRadioButton.setTextColor(getApplicationContext().getResources().getColor(R.color.balck));
                }*/

            }
        });
        femaleRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Female is Selected", Toast.LENGTH_SHORT).show();

                /*if (isChecked) {
                    femaleRadioButton.setTextColor(getApplicationContext().getResources().getColor(R.color.colorPrimary));
                }
                else {
                    maleRadioButton.setTextColor(getApplicationContext().getResources().getColor(R.color.balck));
                }*/

            }
        });
        button = findViewById(R.id.btnRegistration);
        button.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    button.setBackgroundColor(Color.RED);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    button.setBackgroundColor(Color.BLUE);
                }
                return false;
            }
        });


    }

}
