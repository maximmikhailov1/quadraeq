package com.example.equation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void solve(View view){


        double a = Double.parseDouble(((EditText) findViewById(R.id.a)).getText().toString());
        double b = Double.parseDouble(((EditText) findViewById(R.id.b)).getText().toString());
        double c = Double.parseDouble(((EditText) findViewById(R.id.c)).getText().toString());
        TextView x1= findViewById(R.id.x1);
        TextView x2= findViewById(R.id.x2);
        if (Double.parseDouble(((EditText)findViewById(R.id.a)).getText().toString())==0) {
            String res1=String.valueOf((-c)/b);
            x1.setText(res1);
            x2.setText("");
            if(res1.equals("Infinity")||res1.equals("-Infinity")) {
                x1.setText("Нет корней");
                x2.setText("");
            }
        } else {
            double D= b*b-4*a*c;
            if (D==0){
                String res1= String.valueOf((-b)/(2*a));
                x1.setText(res1);
                x2.setText("");

            }else {
                String res1 = String.valueOf(((Math.sqrt(D) - b)) / (2 * a));
                String res2 = String.valueOf((((-(Math.sqrt(D)) - b))) / (2 * a));
                x1.setText(res1);
                x2.setText(res2);
                if(res1.equals("Infinity")||res1.equals("-Infinity")||res1.equals("NaN")) {
                    x1.setText("Нет корней");
                    x2.setText("");
                }
                }
            }
        }
    }

