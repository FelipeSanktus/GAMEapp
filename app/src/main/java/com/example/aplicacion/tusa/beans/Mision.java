package com.example.aplicacion.tusa.beans;

import com.example.aplicacion.tusa.beans.enumm.Dificultad;
import com.example.aplicacion.tusa.beans.enumm.Tipo;

import java.util.ArrayList;

public class Mision {
    private String titulo;
    private String descripcion;
    private Dificultad dificultad;
    private Tipo tipo;
    private ArrayList<String> etapas;
    private int imagenMision;
    private int imagenRecompensa;


    public Mision(String titulo, String descripcion, Dificultad dificultad, Tipo tipo, ArrayList<String> etapas, int imagenMision, int imagenRecompensa) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
        this.tipo = tipo;
        this.etapas = etapas;
        this.imagenMision = imagenMision;
        this.imagenRecompensa = imagenRecompensa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getEtapas() {
        return etapas;
    }

    public void setEtapas(ArrayList<String> etapas) {
        this.etapas = etapas;
    }

    public int getImagenMision() {
        return imagenMision;
    }

    public void setImagenMision(int imagenMision) {
        this.imagenMision = imagenMision;
    }

    public int getImagenRecompensa() {
        return imagenRecompensa;
    }

    public void setImagenRecompensa(int imagenRecompensa) {
        this.imagenRecompensa = imagenRecompensa;
    }
}
