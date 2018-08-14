package com.example.zoma.recetario;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecetaViewModel extends BaseObservable {
    private Receta receta;
    public RecetaViewModel(Receta recetas){
        this.receta = recetas;
    }
    @Bindable
    public String getTitle(){
        return receta.getTitle();
    }
    @Bindable
    public String getPreparationTime(){
         return receta.getPreparationTime() + " min";
    }
    @Bindable
    public String getPortions(){
        return "Porciones: " + receta.getPortions();
    }
    @Bindable
    public byte[] getArt(){
        return receta.getArt();
    }
    @BindingAdapter({"app:art"})
    public static void loadImage(ImageView view, byte[] art){
        Glide.with(view.getContext()).load(art).into(view);
    }
    public void openRecipeView(View view){
        Intent intent = new Intent(view.getContext(), RecetaActivity.class);

        intent.putExtra(RecetaActivity.art_key, getArt());
        intent.putExtra(RecetaActivity.title_key, getTitle());
        intent.putExtra(RecetaActivity.preparationTime_key, getPreparationTime());
        intent.putExtra(RecetaActivity.portion_key, getPortions());
        intent.putExtra(RecetaActivity.ingredients_key, receta.getIngredients());
        intent.putExtra(RecetaActivity.preparation_key, receta.getPreparación());

        view.getContext().startActivity(intent);

    }
}
