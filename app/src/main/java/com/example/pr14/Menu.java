package com.example.pr14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.ivtime) startActivity(new Intent(this, Planka.class));
        if(v.getId()== R.id.ivstatic) startActivity(new Intent(this, Statistic.class));

    }
}