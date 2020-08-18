package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = findViewById(R.id.button1);

        LayoutInflater li = getLayoutInflater();

        final View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));





        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();

                final EditText txt1 = findViewById(R.id.editTextNumber);
                final EditText txt2 = findViewById(R.id.editTextNumber2);
                final String val1 = txt1.getText().toString();
                final String val2 = txt2.getText().toString();

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                intent.putExtra("Number1",val1);
                intent.putExtra("Number2",val2);

                startActivity(intent);



            }
        });
    }
}