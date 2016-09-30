package com.example.aaron.holausuario;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos una referencia a los controles de la interfaz
        txtNombre = (EditText)findViewById(R.id.txtNombre);
        btnAceptar = (Button)findViewById(R.id.btnAceptar);

        //Implementamos el evento click del botón
        btnAceptar.setOnClickListener(new View.OnClickListener(){
              @Override
                    public void onClick(View v){
                //Creamos el Intent
                Intent intent = new Intent(MainActivity.this, SaludoActivity.class);
                //Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("NOMBRE",txtNombre.getText().toString());
                //añadimos la informacion al intent
                intent.putExtras(b);
                //iniciamos la nueva actividad
                startActivity(intent);
            }

           });
        }
}
