package com.example.blackcoffer_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class Refine_Page extends AppCompatActivity {
    SeekBar seekBar;
    TextView value;
    Button b1,b2,b3,b4,b5,b6,b7,b8,savebtn;
    static boolean a = true;
    static boolean b= true;
    static boolean c = true;
    static boolean d= true;
    static boolean e = true;
    static boolean f= true;
    static boolean g = true;
    static boolean h= true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine_page);
        seekBar = findViewById(R.id.Seek);
        value = findViewById(R.id.seekbardata);
        b1= findViewById(R.id.btn1);
        b2= findViewById(R.id.btn2);
        b3= findViewById(R.id.btn3);
        b4= findViewById(R.id.btn4);
        b5= findViewById(R.id.btn5);
        b6= findViewById(R.id.btn6);
        b7= findViewById(R.id.btn7);
        b8= findViewById(R.id.btn8);

        Spinner dropdown = findViewById(R.id.spinner1);

        String[] items = new String[]{
                "Available|Hey Let Us Connect",
                "Away|Stay Discrete And Watch",
                "Busy|Do Not Disturb|Will Catch Up Later ",
                "SOS|Emergency!Need Assistance!Help"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        b1.setBackgroundColor(getResources().getColor(R.color.white));
        b2.setBackgroundColor(getResources().getColor(R.color.white));
        b3.setBackgroundColor(getResources().getColor(R.color.white));
        b4.setBackgroundColor(getResources().getColor(R.color.white));
        b5.setBackgroundColor(getResources().getColor(R.color.white));
        b6.setBackgroundColor(getResources().getColor(R.color.white));
        b7.setBackgroundColor(getResources().getColor(R.color.white));
        b8.setBackgroundColor(getResources().getColor(R.color.white));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = !a;

                if(a) {
                    b1.setBackgroundColor(getResources().getColor(R.color.white));
                    b1.setTextColor(getResources().getColor(R.color.black));
                }
                else{
                    b1.setBackgroundColor(getResources().getColor(R.color.black));
                    b1.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = !b;
                if(b) {
                    b2.setBackgroundColor(getResources().getColor(R.color.white));
                    b2.setTextColor(getResources().getColor(R.color.black));
                }
                else{
                    b2.setBackgroundColor(getResources().getColor(R.color.black));
                    b2.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = !c;

                if(c) {
                    b3.setBackgroundColor(getResources().getColor(R.color.white));
                    b3.setTextColor(getResources().getColor(R.color.black));
                }
                else{
                    b3.setBackgroundColor(getResources().getColor(R.color.black));
                    b3.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = !d;

                if(d) {
                    b4.setBackgroundColor(getResources().getColor(R.color.white));
                    b4.setTextColor(getResources().getColor(R.color.black));
                }
                else{
                    b4.setBackgroundColor(getResources().getColor(R.color.black));
                    b4.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e = !e;

                if(e) {
                    b5.setBackgroundColor(getResources().getColor(R.color.white));
                    b5.setTextColor(getResources().getColor(R.color.black));
                }
                else{
                    b5.setBackgroundColor(getResources().getColor(R.color.black));
                    b5.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = !f;

                if(f) {
                    b6.setBackgroundColor(getResources().getColor(R.color.white));
                    b6.setTextColor(getResources().getColor(R.color.black));
                }
                else{
                    b6.setBackgroundColor(getResources().getColor(R.color.black));
                    b6.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g= !g;

                if(g) {
                    b7.setBackgroundColor(getResources().getColor(R.color.white));
                    b7.setTextColor(getResources().getColor(R.color.black));
                }
                else{
                    b7.setBackgroundColor(getResources().getColor(R.color.black));
                    b7.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h = !h;

                if(h) {
                    b8.setBackgroundColor(getResources().getColor(R.color.white));
                    b8.setTextColor(getResources().getColor(R.color.black));
                }
                else{
                    b8.setBackgroundColor(getResources().getColor(R.color.black));
                    b8.setTextColor(getResources().getColor(R.color.white));
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                value.setText(progress+" KM");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        savebtn=findViewById(R.id.Savebtn);
        Intent inext;
        inext = new Intent(Refine_Page.this,MainActivity.class);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(inext);
            }
        });
    }
    
}