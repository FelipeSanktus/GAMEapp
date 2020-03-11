package com.example.aplicacion.tusa.beans;

public class Menu {
    private String nombre;
    private int imagen;
    private String ruta;

    public Menu(String nombre, int imagen,String ruta) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
