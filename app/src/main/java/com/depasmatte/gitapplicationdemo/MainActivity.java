package com.depasmatte.gitapplicationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("tag", "x");

        startActivity(new Intent(this, NewBrunchTest.class));

        //dfasfsdafasdfasd cippa stocazzo2 olèsdf nnnnnnnnnnnnnnnn
        //£dsffgsgdfgf
        //dsafasdf

    }
}
