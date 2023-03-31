package com.myapplication;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openApp(View view) {
        Intent i = new Intent(getApplicationContext(), Details.class);
        startActivity(i);
    }

    public void aboutUs(View view) {
        Intent i = new Intent(getApplicationContext(), AboutUs.class);
        startActivity(i);
    }

    public void privacyPolicy(View view) {
        Intent i = new Intent(getApplicationContext(), PrivacyPolicy.class);
        startActivity(i);
    }
}