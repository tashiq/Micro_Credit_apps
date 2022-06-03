package com.example.error_correction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Show_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);
        String amount = getIntent().getExtras().getString("amount");
        String percentage = getIntent().getExtras().getString("percent");
        String install = getIntent().getExtras().getString("install");
        String calculated = getIntent().getExtras().getString("per_install");
        TextView am = findViewById(R.id.show_amount);
        TextView in = findViewById(R.id.show_install);
        TextView per = findViewById(R.id.show_percentage);
        TextView cal = findViewById(R.id.show_per);
        am.setText("Amount: " + amount);
        in.setText("Installment: " + install);
        per.setText("Percentage: " + percentage);
        cal.setText("Calculated Amount Per Installment: " + calculated);
    }
}