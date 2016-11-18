package com.example.ryuilhan.myapplication;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button B1;
    Button B2;
    Button B3;
    Button B4;
    Button B5;
    EditText ET1;
    EditText ET2;
    TextView TV1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1 = (Button) findViewById(R.id.button);
        ET1 = (EditText) findViewById(R.id.editText);
        ET2 = (EditText) findViewById(R.id.editText2);
        TV1 = (TextView) findViewById(R.id.textView3);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ET1.getText().toString().length()==0 || ET2.getText().toString().length()==0 || ET2.getText().toString().equals("0")) {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                }else {
                    double result = Double.parseDouble(ET1.getText().toString()) + Double.parseDouble(ET2.getText().toString());
                    TV1.setText("Result : " + Double.toString(result));
                }
            }
        });

        B2 = (Button)findViewById(R.id.button2);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ET1.getText().toString().length()==0 || ET2.getText().toString().length()==0 || ET2.getText().toString().equals("0")) {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                }else {
                    double result = Double.parseDouble(ET1.getText().toString()) - Double.parseDouble(ET2.getText().toString());
                    TV1.setText("Result : " + Double.toString(result));
                }
            }
        });

        B3 = (Button)findViewById(R.id.button3);
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ET1.getText().toString().length()==0 || ET2.getText().toString().length()==0 || ET2.getText().toString().equals("0")) {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                }else {
                    double result = Double.parseDouble(ET1.getText().toString()) * Double.parseDouble(ET2.getText().toString());
                    TV1.setText("Result : " + Double.toString(result));
                }
            }
        });

        B4 = (Button)findViewById(R.id.button4);
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ET1.getText().toString().length()==0 || ET2.getText().toString().length()==0 || ET2.getText().toString().equals("0")) {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                }else {
                    double result = Double.parseDouble(ET1.getText().toString()) / Double.parseDouble(ET2.getText().toString());
                    TV1.setText("Result : " + Double.toString(result));
                }
            }
        });

        B5 = (Button)findViewById(R.id.button5);
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ET1.getText().toString().length()==0 || ET2.getText().toString().length()==0 || ET2.getText().toString().equals("0")) {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                }else {
                    double result = Double.parseDouble(ET1.getText().toString()) % Double.parseDouble(ET2.getText().toString());
                    TV1.setText("Result : " + Double.toString(result));
                }
            }
        });
    }
}
