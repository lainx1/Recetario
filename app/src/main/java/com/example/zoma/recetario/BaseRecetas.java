package com.example.zoma.recetario;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BaseRecetas {
    public static List<Receta> getRecipes(Context context){
        List<Receta> recetas = new ArrayList<>();

        Receta receta;
        ArrayList<String> ingredientes;
        ArrayList<String> preparacion;

        //load recipe 1
        receta = new Receta();
        ingredientes = new ArrayList<>();
        preparacion = new ArrayList<>();

        receta.setTitle("Pechugas de pollo rellenas de manzana");
        receta.setArt(getArt(context, R.drawable.pechuga_pollo));
        receta.setPreparationTime(40);
        receta.setPortions(4);

        ingredientes.add("2 manzanas pequeñas, finamente picadas");
        ingredientes.add("2 cucharadas de queso amarillo rallado");
        ingredientes.add("1 cucharada de pan molido");
        ingredientes.add("2 pechugas de pollo, deshuesadas y sin piel");
        ingredientes.add("1 cucharada de mantequilla");
        ingredientes.add("60 ml de vino blanco seco");
        ingredientes.add("60 ml de agua");
        ingredientes.add("1 cucharada extra de agua");
        ingredientes.add("1½ cucharaditas de fécula de maíz");
        ingredientes.add("1 cucharada de perejil fresco picado");

        receta.setIngredients(ingredientes);

        preparacion.add("Mezcla la manzana, queso y pan molido. Reserva.");
        preparacion.add("Aplana las pechugas de pollo entre dos trozos de papel encerado, hasta tener 1 centímetro de espesor.");
        preparacion.add("Divide la mezcla de manzana entre las pechugas de pollo y enrolla. Asegura con un palillo.");
        preparacion.add("Derrite la mantequilla en un sartén grande a fuego medio y dora las pechugas por todos lados.");
        preparacion.add("Agrega el vino y el agua. Tapa y cocina a fuego bajo de 15 a 20 minutos, o hasta que las pechugas de pollo se hayan cocido.");
        preparacion.add("Coloca las pechugas cocidas en un platón. Mezcla la fécula de maíz con 1 cucharada de agua y mezcla con los jugos en el sartén. Cocina y revuelve hasta que se espese.");
        preparacion.add("Vierte la salsa las pechugas rellenas, espolvorea con perejil y sirve. ¡Buen provecho!");

        receta.setPreparación(preparacion);

        recetas.add(receta);

        //load recipe 2
        receta = new Receta();
        ingredientes = new ArrayList<>();
        preparacion = new ArrayList<>();

        receta.setTitle("Milanesa de pollo parmesana");
        receta.setArt(getArt(context, R.drawable.milanesa_pollo));
        receta.setPreparationTime(20);
        receta.setPortions(4);

        ingredientes.add("1/2 taza (60 gramos) de pan molido ");
        ingredientes.add("120 gramos de queso parmesano ");
        ingredientes.add("1/4 cucharadita de romero seco molido");
        ingredientes.add("Sal y pimienta, al gusto");
        ingredientes.add("4 milanesas de pechuga de pollo");
        ingredientes.add("2 huevos, batidos");
        ingredientes.add("Aceite vegetal para freír");

        receta.setIngredients(ingredientes);

        preparacion.add("Mezcla el pan molido con 100 gramos de queso parmesano y el romero.");
        preparacion.add("Salpimienta las milanesas de pechuga de pollo, pásalas por el huevo, luego por la mezcla de pan y queso.");
        preparacion.add("Calienta suficiente aceite en un sartén grande a fuego medio-alto. Fríe las milanesas empanizadas hasta que se hayan dorado uniformemente.");
        preparacion.add("Sirve las milanesas y espolvoréalas con el queso parmesano restante.");

        receta.setPreparación(preparacion);

        recetas.add(receta);

        //load recipe 3
        receta = new Receta();
        ingredientes = new ArrayList<>();
        preparacion = new ArrayList<>();

        receta.setTitle("Crepas de cajeta con nuez ");
        receta.setArt(getArt(context, R.drawable.crepas_cajeta_nuez));
        receta.setPreparationTime(40);
        receta.setPortions(6);

        ingredientes.add("1 1/2 tazas de leche");
        ingredientes.add("2 huevos");
        ingredientes.add("1 cucharadita de vainilla");
        ingredientes.add("3 cucharadas de azúcar");
        ingredientes.add("1 pizca de sal");
        ingredientes.add("1 taza de agua");
        ingredientes.add("2 tazas de harina");
        ingredientes.add("2 cucharadas de aceite");
        ingredientes.add("Relleno");
        ingredientes.add("250 gramos de crema ácida");
        ingredientes.add("2 cucharadas de azúcar");
        ingredientes.add("250 gramos de cajeta de leche condensada (ej. La Lechera®)");
        ingredientes.add("Nueces picadas para decorar");

        receta.setIngredients(ingredientes);

        preparacion.add("Licúa la leche con los huevos, vainilla, 3 cucharadas de azúcar y sal. Agrega el agua y sigue licuando mientras agregas gradualmente la harina. Cuando tengas una mezcla homogénea, incorpora el aceite.");
        preparacion.add("Calienta a fuego medio-alto un sartén antiadherente chico de aproximadamente 15 centímetros de diámetro (esto permitirá que tus crepas salgan un poco esponjosas). Vierte aproximadamente 3 cucharadas de la pasta dentro del sartén caliente y cocina hasta que las orillas se hayan dorado ligeramente. Voltea y cocina hasta que el segundo lado se haya cocido. Repite el procedimiento hasta terminar con la pasta.");
        preparacion.add("Para el relleno, mezcla la crema con 2 cucharadas de azúcar. Unta parte de esta mezcla en una crepa y coloca otro crepa encima. Unta la segunda crepa con cajeta. Repite el procedimiento de capas alternando la crema y la cajeta entre las crepas. Cubre la última crepa con dulce de leche y espolvorea la nuez picada encima.");

        receta.setPreparación(preparacion);

        recetas.add(receta);

        //load recipe 4
        receta = new Receta();
        ingredientes = new ArrayList<>();
        preparacion = new ArrayList<>();

        receta.setTitle("Arroz primavera");
        receta.setArt(getArt(context, R.drawable.arroz_primavera));
        receta.setPreparationTime(40);
        receta.setPortions(4);

        ingredientes.add("1 taza de arroz");
        ingredientes.add("1 cucharada de aceite");
        ingredientes.add("2 zanahorias, peladas y picadas");
        ingredientes.add("1 elote, desgranado");
        ingredientes.add("1 calabacita, picada");
        ingredientes.add("1 lata (200 gramos) de chícharos, escurridos");
        ingredientes.add("2 ½ tazas de agua");
        ingredientes.add("2 cucharadas de mantequilla");
        ingredientes.add("Consomé granulado de pollo, al gusto");
        ingredientes.add("1 taza de crema");
        ingredientes.add("½ panela chica, rebanada");

        receta.setIngredients(ingredientes);

        preparacion.add("Calienta el aceite en una cacerola a fuego medio y fríe el arroz junto con la zanahoria, granos de elote, calabacita y chícharos. Cocina hasta que los granos de arroz se vean transparentes.");
        preparacion.add("Agrega el agua y la mantequilla y sazona con consomé granulado. Deja que suelte el hervor, tapa y cocina a fuego suave hasta que el líquido se haya absorbido, aproximadamente 20 minutos.");
        preparacion.add("Sirve con crema y rebanadas de panela.");

        receta.setPreparación(preparacion);

        recetas.add(receta);

        //load recipe 5
        receta = new Receta();
        ingredientes = new ArrayList<>();
        preparacion = new ArrayList<>();

        receta.setTitle("Carlota de limónn");
        receta.setArt(getArt(context, R.drawable.carlota_limon));
        receta.setPreparationTime(140);
        receta.setPortions(16);

        ingredientes.add("2 latas (378 gramos cada una) de leche evaporada");
        ingredientes.add("2 latas (397 gramos cada una) de leche condensada");
        ingredientes.add("3/4 taza (190 mililitros) de jugo de limón recién exprimido");
        ingredientes.add("2 paquetes (170 gramos cada uno) de galletas Marías");

        receta.setIngredients(ingredientes);

        preparacion.add("Coloca la leche evaporada, leche condensada y jugo de limón en un tazón mediano. Bate con batidor de globo hasta tener una consistencia espesa y homogénea.");
        preparacion.add("Acomoda una capa de galletas Marías en el fondo de un refractario de vidrio rectangular grande. Cubre las galletas con una capa de leche con limón. Repite el procedimiento de capas hasta terminar con una capa gruesa de leche.");
        preparacion.add("Congela durante 6 horas o toda la noche. Saca del congelador justo al momento de servir.");

        receta.setPreparación(preparacion);

        recetas.add(receta);

        return recetas;
    }
    public static byte[] getArt(Context context, int idResource){
        Bitmap bitmapPick = BitmapFactory.decodeResource(context.getResources(), idResource);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();

        bitmapPick.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        return stream.toByteArray();
    }
    public static List<Receta> search(Context context, final ArrayList<String> ingredients){
        final List<Receta> recetas = getRecipes(context);

        CollectionUtils.filter(recetas, new Predicate<Receta>() {
            @Override
            public boolean evaluate(Receta current) {
                for (String ingredientToSearch : ingredients){
                    for (String ingredient : current.getIngredients()){
                        if (ingredient.contains(ingredientToSearch)){
                            return true;
                        }
                    }
                }
                return false;
            }
        });
        return recetas;
    }
}
