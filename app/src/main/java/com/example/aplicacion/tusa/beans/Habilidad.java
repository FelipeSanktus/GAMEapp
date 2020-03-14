package com.example.aplicacion.tusa.beans;

import com.example.aplicacion.tusa.beans.enumm.TipoElemento;

import java.util.ArrayList;

public class Habilidad {
    //datos generales
    private String nombre;  //Nombre de la habilidad
    private String descripcion; //Descripcion de la habilidad
    private boolean activa; //Si la habilidad es activa o pasiva
    private double costo;   //Costo de mana de la habilidad
    private double nivel;   //Nivel de la habilidad
    private ArrayList<TipoElemento> elementos; //tipo de elementos de la habilidad
    private ArrayList<Habilidad> requisitoHabilidades; //Habilidades que requiere para desbloquear
    private double requisitoNivel; //Nivel que debe tener el jugador para desbloquear

    public Habilidad(String nombre, String descripcion, boolean activa, double costo, double nivel,
                     ArrayList<TipoElemento> elementos, ArrayList<Habilidad> requisitoHabilidades,
                     double requisitoNivel){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activa = activa;
        this.costo = costo;
        this.nivel = nivel;
        this.elementos = elementos;
        this.requisitoHabilidades = requisitoHabilidades;
        this.requisitoNivel = requisitoNivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getNivel() {
        return nivel;
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    public ArrayList<TipoElemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<TipoElemento> elementos) {
        this.elementos = elementos;
    }

    public ArrayList<Habilidad> getRequisitoHabilidades() {
        return requisitoHabilidades;
    }

    public void setRequisitoHabilidades(ArrayList<Habilidad> requisitoHabilidades) {
        this.requisitoHabilidades = requisitoHabilidades;
    }

    public double getRequisitoNivel() {
        return requisitoNivel;
    }

    public void setRequisitoNivel(double requisitoNivel) {
        this.requisitoNivel = requisitoNivel;
    }
}
