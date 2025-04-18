package com.javadesafiopoo.modelos;

public class MisFavoritos {

   public void adicione(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + " Es uno de los mas escuchados");
        } else {
            System.out.println(audio.getTitulo() + " Hay mejores");
        }
    }

}
