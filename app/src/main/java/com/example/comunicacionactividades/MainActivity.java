package com.example.comunicacionactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
    }
    //onResume
    @Override
    protected void onResume() {
        super.onResume();
        TextView et2 = (TextView) findViewById(R.id.et2);
        String dato = getIntent().getStringExtra("dato");
        if(dato != null){
            et2.setText(dato);
        }

    }
    //metodo para el boton verificar
    public void Verificar(View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("dato",et1.getText().toString());
        startActivity(i);
    }
}