package com.javadesafiopoo.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducciones;

    private  int totalDeMegustas;
    private int clasificacion;

    public void meGusta(){
        this.totalDeMegustas ++ ;
    }

    public void reproduce(){
        this.totalDeReproducciones ++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMegustas() {
        return totalDeMegustas;
    }

    public void setTotalDeMegustas(int totalDeMegustas) {
        this.totalDeMegustas = totalDeMegustas;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
