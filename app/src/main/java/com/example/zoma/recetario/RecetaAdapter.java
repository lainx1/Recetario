package com.example.zoma.recetario;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.zoma.recetario.databinding.RecipeItemBinding;

import java.util.List;

public class RecetaAdapter extends Adapter<RecetaAdapter.RecetaViewHolder>{
    private List<Receta> recetas;
    public RecetaAdapter(List<Receta> recetas){
        this.recetas = recetas;
    }

    @NonNull
    @Override
    public RecetaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecipeItemBinding recipeItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()), R.layout.recipe_item, parent,  false
        );
        return new RecetaViewHolder(recipeItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecetaViewHolder holder, int position) {
        RecipeItemBinding recipeItemBinding = holder.getRecipeItemBinding();
        recipeItemBinding.setRVM(new RecetaViewModel(recetas.get(position)));
    }

    @Override
    public int getItemCount() {
        return recetas.size();
    }

    public static class RecetaViewHolder extends ViewHolder{
        private RecipeItemBinding recipeItemBinding;
        public RecetaViewHolder(RecipeItemBinding recipeItemBinding){
            super(recipeItemBinding.recipeCard);
            this.recipeItemBinding = recipeItemBinding;
        }
        public RecipeItemBinding getRecipeItemBinding(){
            return recipeItemBinding;
        }

    }
}
