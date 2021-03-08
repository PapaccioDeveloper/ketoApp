package com.papaccio.ketoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listado extends AppCompatActivity {

    //el import nuevo de la libreria es el de la linea 4
    private Toolbar toolbar;
    ListView listRecetas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

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

        listRecetas = (ListView) findViewById(R.id.listRecetas);

        //declaracion del adapter con el array creado en values
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.arrayRecetas, android.R.layout.simple_list_item_1);
        listRecetas.setAdapter(adaptador);

        //cuando se pulsa un item del listview
        listRecetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"Seleccionado:"+parent.getItemAtPosition(position),
                        Toast.LENGTH_LONG).show();

                Intent intent  = new Intent(getApplication(),detalle.class);

                //FORMA 1 PASAR A TRAVES DEL BUNDLE LOS DATOS
                //bundle para pasar datos de un activyti a otro
                Bundle data = new Bundle();

                //forma 2 no recomendable atraves del intent
                //preparo dato para pasar
                String datoPasar = "Seleccionado"+parent.getItemIdAtPosition(position);
                //paso un string en mi bundle con la key item
                intent.putExtra("dato",datoPasar);

               //inicia el intent
                startActivity(intent);

            }
        });

    }


}