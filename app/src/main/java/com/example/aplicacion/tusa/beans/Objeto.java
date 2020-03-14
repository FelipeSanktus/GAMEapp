package com.example.aplicacion.tusa.beans;

import com.example.aplicacion.tusa.beans.enumm.TipoObjeto;

public class Objeto {
    private String nombre;  //Nombre del objeto
    private String descripcion; //Descripcion del objeto
    private TipoObjeto tipo;//Tipo de objeto: Arma, armadura, objeto de mision, utilizable, etc.

    public Objeto(String nombre, String descripcion, TipoObjeto tipo){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
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

    public TipoObjeto getTipo() {
        return tipo;
    }

    public void setTipo(TipoObjeto tipo) {
        this.tipo = tipo;
    }
}
