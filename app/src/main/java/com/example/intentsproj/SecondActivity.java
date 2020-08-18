package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secon);

        final Button add = findViewById(R.id.addbtn);
        final Button sub = findViewById(R.id.subbtn);
        final Button mul = findViewById(R.id.multiplybtn);
        final Button div = findViewById(R.id.dividebtn);
        final TextView reultTxt = findViewById(R.id.textView4);

        final ArrayList<Button> arrBtn = new ArrayList<Button>();

        arrBtn.add(add);
        arrBtn.add(sub);
        arrBtn.add(mul);
        arrBtn.add(div);

        final EditText val1 = findViewById(R.id.editTextNumber3);
        final EditText val2 = findViewById(R.id.editTextNumber4);

        Intent intent = getIntent();

        String number1 = intent.getStringExtra("Number1");
        String number2 = intent.getStringExtra("Number2");

        val1.setText(number1);
        val2.setText(number2);
        Button y;
        for(int x = 0; x<arrBtn.size();x++){
            y = arrBtn.get(x);
            final Button finalY = y;
            y.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String resultvalue;
                    if(finalY == add){

                        resultvalue = String.valueOf(Integer.parseInt(val1.getText().toString()) +  Integer.parseInt(val2.getText().toString()));

                        reultTxt.setText(val1.getText().toString()+" + "+val2.getText().toString()+" = "+resultvalue);

                    }
                    else if(finalY == sub){

                        resultvalue = String.valueOf(Integer.parseInt(val1.getText().toString()) -  Integer.parseInt(val2.getText().toString()));

                        reultTxt.setText(val1.getText().toString()+" - "+val2.getText().toString()+" = "+resultvalue);
                    }
                    else if(finalY == mul){

                        resultvalue = String.valueOf(Integer.parseInt(val1.getText().toString()) *  Integer.parseInt(val2.getText().toString()));

                        reultTxt.setText(val1.getText().toString()+" * "+val2.getText().toString()+" = "+resultvalue);

                    }
                    else if(finalY == div){

                        resultvalue = String.valueOf(Integer.parseInt(val1.getText().toString()) /  Integer.parseInt(val2.getText().toString()));
                        reultTxt.setText(val1.getText().toString()+" / "+val2.getText().toString()+" = "+resultvalue);

                    }
                }
            });
        }



    }
}