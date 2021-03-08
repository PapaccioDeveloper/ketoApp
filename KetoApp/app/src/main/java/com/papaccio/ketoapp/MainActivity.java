package com.papaccio.ketoapp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    //el import nuevo de la libreria es el de la linea 4
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //meter flecha de retroceso
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //metodo para escuchar los click de la toolbar
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //para regresar
                finish();
            }
        });


    }

    public void entrar(View view) {
        //con el inten le decimos que queremos pasar a pantalla listado
        Intent intent = new Intent(getApplicationContext(), listado.class);
        //iniciamos con start
        startActivity(intent);
    }

    //Crear menu
    @Override
    public boolean onCreateOptionsMenu(Menu mimenu) {

        getMenuInflater().inflate(R.menu.menuapp, mimenu);
        return true;
    }

    //escuha los eventos producidos en el menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem opcionmenu) {
        //recojemos el id del menu pulsado
        int id = opcionmenu.getItemId();
        if (id == R.id.ayuda) {
        }
        if (id == R.id.listado) {
        }
        if (id == R.id.salir) {
            salirApp(null);
        }


        return super.onOptionsItemSelected(opcionmenu);
    }

    //salir de la app
    public void salirApp(View view) {

        finish();
    }


}