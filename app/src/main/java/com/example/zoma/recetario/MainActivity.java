package com.example.zoma.recetario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView ingredientes;
    private EditText ingredientesEditText;
    private ArrayList<String> ingredientesArrayList = new ArrayList<>();
    private ArrayAdapter <String> ingredientesAdapter;
    public static final String ingredientes_key = "ingredientes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingredientes = findViewById(R.id.ingredientes);
        ingredientesEditText = findViewById(R.id.ingredienteEditText);
        ingredientesAdapter = new ArrayAdapter <String> (this,android.R.layout.simple_list_item_1);
        ingredientes.setAdapter(ingredientesAdapter);

        if(savedInstanceState != null){
            ingredientesArrayList.addAll(savedInstanceState.getStringArrayList(ingredientes_key));
            ingredientesAdapter.addAll(ingredientesArrayList);
            ingredientesAdapter.notifyDataSetChanged();
        }
    }
    public void agregar(View view){
        String ingrediente = ingredientesEditText.getText().toString().toLowerCase();
        if(!ingrediente.isEmpty() && ingredientesAdapter.getCount()<3){
           ingredientesArrayList.add(ingrediente);
            ingredientesAdapter.add(ingrediente);
            ingredientesAdapter.notifyDataSetChanged();
            ingredientesEditText.setText("");
        }
    }
    public void limpiar(View view){
        if(ingredientesAdapter.getCount()>0){
            ingredientesArrayList.clear();
            ingredientesAdapter.clear();
            ingredientesAdapter.notifyDataSetChanged();
        }
    }public void buscar(View view){
        if(ingredientesAdapter.getCount()>0){
            Intent intent = new Intent(this, BusquedaActivity.class);
            intent.putExtra(ingredientes_key, ingredientesArrayList);
            startActivity(intent);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(!ingredientesArrayList.isEmpty()){
            outState.putStringArrayList(ingredientes_key,ingredientesArrayList);
        }
    }
}


