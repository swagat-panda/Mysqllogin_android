package com.example.mysqllogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void signin(View v)
    {
        Intent in=new Intent(getApplication(),login.class);
        startActivity(in);
    }
    public void signup(View v)
    {
        Intent in=new Intent(getApplication(),registor.class);
        startActivity(in);
    }
}
