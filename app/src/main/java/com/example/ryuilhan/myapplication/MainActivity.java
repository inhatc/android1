package com.example.ryuilhan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button B1 = (Button) findViewById(R.id.button);
    Button B2 = (Button) findViewById(R.id.button2);
    Button B3 = (Button) findViewById(R.id.button3);
    Button B4 = (Button) findViewById(R.id.button4);
    EditText ET1 = (EditText) findViewById(R.id.editText);
    EditText ET2 = (EditText) findViewById(R.id.editText2);
    TextView TV1 = (TextView) findViewById(R.id.textView3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strData1 = ET1.getText().toString();
                String strData2 = ET2.getText().toString();
                double result = Double.parseDouble(strData1)+Double.parseDouble(strData2);
                TV1.setText(Double.toString(result));
            }
        });
    }
}
