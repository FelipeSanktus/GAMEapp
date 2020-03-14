package com.example.aplicacion.tusa.beans;

import com.example.aplicacion.tusa.beans.enumm.TipoElemento;

public class Elemento {
    private TipoElemento tipo;
    private double cantidad;

    public Elemento(TipoElemento tipo, double cantidad){
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
}
