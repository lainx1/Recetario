package com.example.zoma.recetario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RecetaActivity extends AppCompatActivity {
    public static final String art_key = "art", title_key = "title", preparationTime_key = "preparationTime", portion_key = "portion", ingredients_key = "ingredients", preparation_key = "preparation";

    private ImageView artImageView;
    private TextView titleTextView, preparationTimeTextView, portionsTextView;
    private ListView ingredientsListView, preparationListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta);

        Toolbar toolbar = findViewById(R.id.toolbar);

        artImageView = findViewById(R.id.artImageView);
        titleTextView = findViewById(R.id.titleTextView);
        preparationTimeTextView = findViewById(R.id.preparationTimeTextView);
        portionsTextView = findViewById(R.id.portionsTextView);
        ingredientsListView = findViewById(R.id.ingredientsListView);
        preparationListView = findViewById(R.id.preparationListView);

        Intent intent = getIntent();
        if (intent != null){
            toolbar.setTitle(intent.getStringExtra(title_key));

            Glide.with(this).load(intent.getByteArrayExtra(art_key)).into(artImageView);
            titleTextView.setText(intent.getStringExtra(title_key));
            preparationTimeTextView.setText(intent.getStringExtra(preparationTime_key));
            portionsTextView.setText(intent.getStringExtra(portion_key));

            ArrayAdapter<String> ingredientsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, intent.getStringArrayListExtra(ingredients_key));
            ingredientsListView.setAdapter(ingredientsAdapter);

            ArrayAdapter<String> preparationAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, intent.getStringArrayListExtra(preparation_key));
            preparationListView.setAdapter(preparationAdapter);

            setListViewHeightBasedOnChildren(ingredientsListView);
            setListViewHeightBasedOnChildren(preparationListView);
        }

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
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
