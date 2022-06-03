package com.example.error_correction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText install = findViewById(R.id.install);
        TextView output = findViewById(R.id.show_output);
        EditText amount = findViewById(R.id.amount);
        EditText percent = findViewById(R.id.percent);



        install.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                float am = 0;
                float per = 0;
                int ins = 1;
                try {
                    ins = Integer.parseInt(install.getText().toString());

                    per = Float.parseFloat(percent.getText().toString());

                    am = Float.parseFloat(amount.getText().toString());
                }
                catch (Exception e){
                    output.setText(e.toString());
                }
                per = (float) (per+100)/100;
                float cal = (am * per) / ins;
                String finalValue = Float.toString(cal);
                output.setText(finalValue);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        amount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                float am = 0;
                float per = 0;
                int ins = 1;
                try {
                    ins = Integer.parseInt(install.getText().toString());
                } catch (Exception e){
                    output.setText(e.toString());
                }
                try{
                    per = Float.parseFloat(percent.getText().toString());
                }
                catch (Exception e){
                    output.setText(e.toString());
                }
                try{
                    am = Float.parseFloat(amount.getText().toString());
                }
                catch (Exception e){
                    output.setText(e.toString());
                }
                per = (float) (per+100)/100;
                float cal = (am * per) / ins;
                String finalValue = Float.toString(cal);
                output.setText(finalValue);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        percent.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                float am = 0;
                float per = 0;
                int ins = 1;
                try {
                    ins = Integer.parseInt(install.getText().toString());
                } catch (Exception e){
                    output.setText(e.toString());
                }
                try{
                    per = Float.parseFloat(percent.getText().toString());
                }
                catch (Exception e){
                    output.setText(e.toString());
                }
                try{
                    am = Float.parseFloat(amount.getText().toString());
                }
                catch (Exception e){
                    output.setText(e.toString());
                }
                per = (float) (per+100)/100;
                float cal = (am * per) / ins;
                String finalValue = Float.toString(cal);
                output.setText(finalValue);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        findViewById(R.id.submit_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Show_details.class);
                try {
                    String am = (amount.getText().toString());
                    String in = (install.getText().toString());
                    String per = (percent.getText().toString());
                    i.putExtra("amount", am);
                    i.putExtra("install", in);
                    i.putExtra("percent", per);
                    String cal = output.getText().toString();
                    i.putExtra("per_install", cal);
                }catch (Exception e){

                }
                startActivity(i);
            }
        });
    }
}