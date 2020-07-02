package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // onClick Sum Method
    public void sum(View view){
        // Searching for the text box from the view
        TextView textView_1 = findViewById(R.id.input_1);
        TextView textView_2 = findViewById(R.id.input_2);
        // Parsing the content fetched into Integer
        int num_a = Integer.parseInt(textView_1.getText().toString());
        int num_b = Integer.parseInt(textView_2.getText().toString());
        // Performing calculation and showing it using toast notification
        int sum_answer = num_a+num_b;
         Toast.makeText(this,"SUM = " + sum_answer, Toast.LENGTH_SHORT).show();
    }
    // onClick Subtract Method
    public void subtract(View view){
        // Searching for the text box from the view
        TextView textView_1 = findViewById(R.id.input_1);
        TextView textView_2 = findViewById(R.id.input_2);
        // Parsing the content fetched into Integer
        int num_a = Integer.parseInt(textView_1.getText().toString());
        int num_b = Integer.parseInt(textView_2.getText().toString());
        // Performing calculation and showing it using toast notification
        int sub_answer = num_a - num_b;
        Toast.makeText(this,"Difference = " + sub_answer, Toast.LENGTH_SHORT).show();
    }
    // onClick Multiply Method
    public void mul(View view){
        // Searching for the text box from the view
        TextView textView_1 = findViewById(R.id.input_1);
        TextView textView_2 = findViewById(R.id.input_2);
        // Parsing the content fetched into Integer
        int num_a = Integer.parseInt(textView_1.getText().toString());
        int num_b = Integer.parseInt(textView_2.getText().toString());
        // Performing calculation and showing it using toast notification
        int mul_answer = num_a*num_b;
        Toast.makeText(this,"Product = " + mul_answer, Toast.LENGTH_SHORT).show();
    }
    // onClick Divide Method
    public void div(View view){
        // Searching for the text box from the view
        TextView textView_1 = findViewById(R.id.input_1);
        TextView textView_2 = findViewById(R.id.input_2);
        // Parsing the content fetched into Integer
        int num_a = Integer.parseInt(textView_1.getText().toString());
        int num_b = Integer.parseInt(textView_2.getText().toString());
        // Performing calculation and showing it using toast notification
        if(num_b == 0) { // Took care of Divide By Zero Error
            Toast.makeText(this, " Divide By Zero Error" , Toast.LENGTH_SHORT).show();
        }else if (num_b>num_a){ // Took care of Improper Fractions
            Toast.makeText(this, " 2nd Number is bigger than 1st Number" , Toast.LENGTH_SHORT).show();
        }
        else{   // Simple Division
            int div_quo = num_a / num_b;
            int div_rem = num_a % num_b;
            Toast.makeText(this, "Quotient  = " + div_quo + " Remainder = " + div_rem, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}