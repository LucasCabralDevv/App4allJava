package com.lucascabral.apptimestamp1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.lucascabral.apptimestamp1.R.*;
import static com.lucascabral.apptimestamp1.R.color.*;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private TextView titleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        Button buttonTimestamp = findViewById(id.mainTimestampButton);
        setupViews();

        buttonTimestamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long timestampLong = System.currentTimeMillis();

                String timestamp = String.valueOf(timestampLong);
                String timestampLastChar = timestamp.substring(timestamp.length() - 1);

                setBackgroundColor(timestampLastChar);
            }
        });
    }

    private void setupViews() {
        linearLayout = findViewById(id.mainLinearLayout);
        titleTextView = findViewById(id.mainTitleTextView);
    }

    private void setBackgroundColor(String lastChar) {
        switch (lastChar) {
            case "0":
                linearLayout.setBackgroundColor(getResources().getColor(White));
                titleTextView.setTextColor(getResources().getColor(Black));
                break;
            case "1":
                linearLayout.setBackgroundColor(getResources().getColor(Black));
                titleTextView.setTextColor(getResources().getColor(White));
                break;
            case "2":
                linearLayout.setBackgroundColor(getResources().getColor(Blue));
                break;
            case "3":
                linearLayout.setBackgroundColor(getResources().getColor(Green));
                break;
            case "4":
                linearLayout.setBackgroundColor(getResources().getColor(Pink));
                break;
            case "5":
                linearLayout.setBackgroundColor(getResources().getColor(Red));
                break;
            case "6":
                linearLayout.setBackgroundColor(getResources().getColor(Purple));
                break;
            case "7":
                linearLayout.setBackgroundColor(getResources().getColor(Yellow));
                break;
            case "8":
                linearLayout.setBackgroundColor(getResources().getColor(Grey));
                break;
            case "9":
                linearLayout.setBackgroundColor(getResources().getColor(Lilac));
                break;
        }
    }
}