package com.techinee.exercise4_2s6206021621066;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnCountUp , btnCountDown , btnReset;
    private TextView EditText;
    final String message = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCountUp = (Button) findViewById(R.id.btnCountUp);
        btnCountDown = (Button) findViewById(R.id.btnCountDown);
        btnReset = (Button) findViewById(R.id.btnReset);
        EditText = (TextView) findViewById(R.id.EditText);

        btnCountUp.setOnClickListener(this);
        btnCountDown.setOnClickListener(this);
        btnReset.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int numCountUp = Integer.parseInt(EditText.getText().toString());
        if(view.getId() == R.id.btnCountUp){
            numCountUp++;
            if (numCountUp % 5 == 0){
                Toast.makeText(this, "หาร 5 ลงตัว" ,Toast.LENGTH_SHORT).show();
            }
            EditText.setText(Integer.toString(numCountUp));
        }
        else if (view.getId() == R.id.btnCountDown){
            numCountUp--;
            if (numCountUp % 5 == 0){
                Toast.makeText(this, "หาร 5 ลงตัว" ,Toast.LENGTH_SHORT).show();
            }
            EditText.setText(Integer.toString(numCountUp));
        }else if(view.getId() == R.id.btnReset){
            EditText.setText(message);
        }


    }

}