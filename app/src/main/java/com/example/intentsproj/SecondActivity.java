package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView Num1,Num2,Answer;
    String n1,n2;
    Button Add,Substract,Multple,Deivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Num1 = findViewById(R.id.editTextNumber1);
        Num2=findViewById(R.id.editTextNumber2);
        Answer = findViewById(R.id.textViewAnswer);
        Add= findViewById(R.id.buttonadd);
        Substract = findViewById(R.id.buttonsubstract);
        Multple = findViewById(R.id.buttonmultiple);
        Deivide = findViewById(R.id.buttonDevide);
        Num1=findViewById(R.id.editTextNumber3);
        Num2=findViewById(R.id.editTextNumber4);
        n1=getIntent().getStringExtra("Extra1");
        n2=getIntent().getStringExtra("Extra2");
        Num1.setText(n1);
        Num2.setText(n2);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt( Num1.getText().toString());
                int number2 = Integer.parseInt( Num2.getText().toString());
                int result = number1 + number2;
                Answer.setText( getIntent().getStringExtra( "Extra1") + " + " + getIntent().getStringExtra( "Extra2") + " = " + String.valueOf(result));
            }
        });
        Substract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt( Num1.getText().toString() );
                int number2 = Integer.parseInt( Num2.getText().toString() );
                int result = number1 - number2;
                Answer.setText( getIntent().getStringExtra( "Extra1") + " - " + getIntent().getStringExtra( "Extra2") + " = " + String.valueOf(result));
            }
        });
        Multple.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt( Num1.getText().toString() );
                int number2 = Integer.parseInt( Num2.getText().toString() );
                int result = number1 * number2;
                Answer.setText( getIntent().getStringExtra( "Extra1") + " * " + getIntent().getStringExtra( "Extra2") + " = " + String.valueOf(result));
            }
        });
        Deivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt( Num1.getText().toString() );
                int number2 = Integer.parseInt( Num2.getText().toString() );
                int result = number1 / number2;
                Answer.setText( getIntent().getStringExtra( "Extra1") + " / " + getIntent().getStringExtra( "Extra2") + " = " + String.valueOf(result));
            }
        });
    }
}