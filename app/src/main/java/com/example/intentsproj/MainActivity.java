package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button BTNok;
    EditText in1,in2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();
        //////////////////////////////////////////////////////////////
        in1 = findViewById(R.id.editTextNumber1);
        in2 = findViewById(R.id.editTextNumber2);
        BTNok= findViewById(R.id.buttonOK);
        BTNok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = in1.getText().toString();
                String number2 = in2.getText().toString();
                Intent i = new Intent( MainActivity.this , SecondActivity.class);
                i.putExtra( "Extra1" , number1 );
                i.putExtra( "Extra2" , number2);

                startActivity(i);
                Toast toast = Toast.makeText(getApplicationContext(), "You just clicked on ok button", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }
}