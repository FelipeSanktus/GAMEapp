package com.example.aplicacion.tusa.beans;

import com.example.aplicacion.tusa.beans.enumm.TipoArmadura;
import com.example.aplicacion.tusa.beans.enumm.TipoElemento;
import com.example.aplicacion.tusa.beans.enumm.TipoObjeto;

import java.util.ArrayList;

public class Armadura extends Objeto {
    //datos generales
    private TipoArmadura tipoArmadura;    //Tipo de armadura: botas, guantes, pechera,

    //datos estadisticos con que beneficia al personaje al portar
    private double fuerza;       //Aumenta el dano fisico
    private double agilidad;    //Aumenta la velocidad de ataque
    private double intelecto;   //Aumenta el mana y dano magico
    private double aguante;     //Aumenta la salud
    private double espiritu;    //Aumenta la regeneracion de mana

    //datos estadisticos de la armadura
    private double armadura;        //Disminuye el dano fisico recibido
    private double armaduraMagica;  //Disminuye el daño magico recibido
    private double esquive;         //Aumenta la probabilidad de esquivar
    private double parada;          //Aumenta la probabilidad de parar el ataque

    private ArrayList<Elemento> armaduraElemental;

    public Armadura(String nombre, String descripcion, TipoObjeto tipoO, TipoArmadura tipoArmadura,
                    double fuerza, double agilidad, double intelecto, double aguante, double espiritu,
                    double armadura, double armaduraMagica, double esquive, double parada,
                    ArrayList<Elemento> armaduraElemental) {
        super(nombre, descripcion, tipoO);
        this.tipoArmadura = tipoArmadura;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.intelecto = intelecto;
        this.aguante = aguante;
        this.espiritu = espiritu;

        this.armadura = armadura;
        this.armaduraMagica = armaduraMagica;
        this.esquive = esquive;
        this.parada = parada;
        this.armaduraElemental = armaduraElemental;
    }

    public TipoArmadura getTipoArmadura() {
        return tipoArmadura;
    }

    public void setTipoArmadura(TipoArmadura tipo) {
        this.tipoArmadura = tipo;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(double agilidad) {
        this.agilidad = agilidad;
    }

    public double getIntelecto() {
        return intelecto;
    }

    public void setIntelecto(double intelecto) {
        this.intelecto = intelecto;
    }

    public double getAguante() {
        return aguante;
    }

    public void setAguante(double aguante) {
        this.aguante = aguante;
    }

    public double getEspiritu() {
        return espiritu;
    }

    public void setEspiritu(double espiritu) {
        this.espiritu = espiritu;
    }

    public double getArmadura() {
        return armadura;
    }

    public void setArmadura(double armadura) {
        this.armadura = armadura;
    }

    public double getArmaduraMagica() {
        return armaduraMagica;
    }

    public void setArmaduraMagica(double armaduraMagica) {
        this.armaduraMagica = armaduraMagica;
    }

    public double getEsquive() {
        return esquive;
    }

    public void setEsquive(double esquive) {
        this.esquive = esquive;
    }

    public double getParada() {
        return parada;
    }

    public void setParada(double parada) {
        this.parada = parada;
    }

    public ArrayList<Elemento> getArmaduraElemental() {
        return armaduraElemental;
    }

    public void setArmaduraElemental(ArrayList<Elemento> armaduraElemental) {
        this.armaduraElemental = armaduraElemental;
    }
}
