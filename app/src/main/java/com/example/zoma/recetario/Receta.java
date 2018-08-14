package com.example.zoma.recetario;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    private byte[] art;
    private String title;
    private ArrayList<String> ingredients, preparación;
    private int preparationTime, portions;

    public byte[] getArt() {
        return art;
    }

    public void setArt(byte[] art) {
        this.art = art;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getPreparación() {
        return preparación;
    }

    public void setPreparación(ArrayList<String> preparación) {
        this.preparación = preparación;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public int getPortions() {
        return portions;
    }

    public void setPortions(int portions) {
        this.portions = portions;
    }
}
