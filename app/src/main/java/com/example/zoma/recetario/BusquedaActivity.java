package com.example.zoma.recetario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BusquedaActivity extends AppCompatActivity {
    private RecyclerView recipe_list;
    private RecetaAdapter recetaAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> ingredientsForSearch;
    private List<Receta> recipesResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //get the ingredients
        Intent intent = getIntent();
        if (intent != null){
            //search for the ingredients list
            ingredientsForSearch = intent.getExtras().getStringArrayList(MainActivity.ingredientes_key);
            recipesResult = BaseRecetas.search(this, ingredientsForSearch);
        }

        recipe_list = findViewById(R.id.recipe_list);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recipe_list.setHasFixedSize(true);

        //use a linea layout manager
        layoutManager = new LinearLayoutManager(this);
        recipe_list.setLayoutManager(layoutManager);

        recetaAdapter = new RecetaAdapter(recipesResult);
        recipe_list.setAdapter(recetaAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
