package com.papaccio.ketoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class listado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
    }


    public void volver(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);


    }

}