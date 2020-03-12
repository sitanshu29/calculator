package com.example.ecea_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button add, subtract, divide, multiply;
    EditText a, b;

    double num1, num2;
    double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);
        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        a = (EditText)findViewById(R.id.inputx);
        b = (EditText)findViewById(R.id.inputy);




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.getText().toString().isEmpty())
                {
                    a.setError("Input is required!");
                    a.requestFocus();
                    return;
                }
                if (b.getText().toString().isEmpty())
                {
                    b.setError("Input is required!");
                    b.requestFocus();
                    return;
                }

                num1 = Double.parseDouble(a.getText().toString());
                num2 = Double.parseDouble(b.getText().toString());


                res = num1+num2;
                result.setText("Output is: "+ res);
                Toast.makeText(MainActivity.this, "Operation Successfull", Toast.LENGTH_SHORT).show();
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a.getText().toString().isEmpty())
                {
                    a.setError("Input is required!");
                    a.requestFocus();
                    return;
                }
                if (b.getText().toString().isEmpty())
                {
                    b.setError("Input is required!");
                    b.requestFocus();
                    return;
                }

                num1 = Double.parseDouble(a.getText().toString());
                num2 = Double.parseDouble(b.getText().toString());
                res = num1-num2;
                result.setText("Output is: "+ res);
                Toast.makeText(MainActivity.this, "Operation Successfull", Toast.LENGTH_SHORT).show();
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a.getText().toString().isEmpty())
                {
                    a.setError("Input is required!");
                    a.requestFocus();
                    return;
                }
                if (b.getText().toString().isEmpty())
                {
                    b.setError("Input is required!");
                    b.requestFocus();
                    return;
                }

                num1 = Double.parseDouble(a.getText().toString());
                num2 = Double.parseDouble(b.getText().toString());
                res = num1*num2;
                result.setText("Output is: "+ res);
                Toast.makeText(MainActivity.this, "Operation Successfull", Toast.LENGTH_SHORT).show();
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a.getText().toString().isEmpty())
                {
                    a.setError("Input is required!");
                    a.requestFocus();
                    return;
                }
                if (b.getText().toString().isEmpty())
                {
                    b.setError("Input is required!");
                    b.requestFocus();
                    return;
                }

                num1 = Double.parseDouble(a.getText().toString());
                num2 = Double.parseDouble(b.getText().toString());
                res = num1/num2;
                result.setText("Output is: "+ res);
                Toast.makeText(MainActivity.this, "Operation Successfull", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
