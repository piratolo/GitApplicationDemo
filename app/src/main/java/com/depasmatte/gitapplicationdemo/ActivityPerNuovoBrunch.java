package com.depasmatte.gitapplicationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityPerNuovoBrunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per_nuovo_brunch);

        startActivity(new Intent(this, Main3Activity.class));
    }
}
