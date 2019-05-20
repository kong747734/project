package com.xfhl.wawa.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xfhl.wawa.model1.Model1Actvity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void tiao(View v) {
        Intent intent=new Intent(this, Model1Actvity.class);
        startActivity(intent);
    }
}
