package com.javadesafiopoo.principal;

import com.javadesafiopoo.modelos.Cancion;
import com.javadesafiopoo.modelos.MisFavoritos;
import com.javadesafiopoo.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("For Ever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Pedro");
        miPodcast.setTitulo("Pedrito y vos");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 1000; i++) {
            miCancion.reproduce();
        }
        for (int i = 0; i < 150; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones de mi Canción: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gustas de mi Cancion: " + miCancion.getTotalDeMegustas());


        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);

    }
}
