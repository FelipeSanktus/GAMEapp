package com.example.aplicacion.tusa.beans;

import com.example.aplicacion.tusa.beans.enumm.TipoArma;
import com.example.aplicacion.tusa.beans.enumm.TipoObjeto;

import java.util.ArrayList;

public class Arma extends Objeto{
    //datos generales
    private TipoArma tipoArma;    //Tipo de arma: espada, daga, arco, baston, etc.

    //datos estadisticos con que beneficia al personaje al portar
    private double fuerza;       //Aumenta el dano fisico
    private double agilidad;    //Aumenta la velocidad de ataque
    private double intelecto;   //Aumenta el mana y dano magico
    private double aguante;     //Aumenta la salud
    private double espiritu;    //Aumenta la regeneracion de mana

    //datos estadisticos del arma
    private double penetracionArmadura;
    private double velocidadAtaque;
    private double poderAtaque;
    private double probabilidadCritico;
    private double probabilidadAtaque;

    private ArrayList<Elemento> ataqueElemental;


    public Arma(String nombre, String descripcion, TipoObjeto tipo, TipoArma tipoArma, double fuerza,
                double agilidad, double intelecto, double aguante, double espiritu,
                double penetracionArmadura, double velocidadAtaque, double poderAtaque,
                double probabilidadCritico, double probabilidadAtaque) {
        super(nombre, descripcion, tipo);
        this.tipoArma = tipoArma;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.intelecto = intelecto;
        this.aguante = aguante;
        this.espiritu = espiritu;
        this.penetracionArmadura = penetracionArmadura;
        this.velocidadAtaque = velocidadAtaque;
        this.poderAtaque = poderAtaque;
        this.probabilidadCritico = probabilidadCritico;
        this.probabilidadAtaque = probabilidadAtaque;
    }

    public TipoArma getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(TipoArma tipoArma) {
        this.tipoArma = tipoArma;
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

    public double getPenetracionArmadura() {
        return penetracionArmadura;
    }

    public void setPenetracionArmadura(double penetracionArmadura) {
        this.penetracionArmadura = penetracionArmadura;
    }

    public double getVelocidadAtaque() {
        return velocidadAtaque;
    }

    public void setVelocidadAtaque(double velocidadAtaque) {
        this.velocidadAtaque = velocidadAtaque;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public double getProbabilidadCritico() {
        return probabilidadCritico;
    }

    public void setProbabilidadCritico(double probabilidadCritico) {
        this.probabilidadCritico = probabilidadCritico;
    }

    public double getProbabilidadAtaque() {
        return probabilidadAtaque;
    }

    public void setProbabilidadAtaque(double probabilidadAtaque) {
        this.probabilidadAtaque = probabilidadAtaque;
    }

    public ArrayList<Elemento> getAtaqueElemental() {
        return ataqueElemental;
    }

    public void setAtaqueElemental(ArrayList<Elemento> ataqueElemental) {
        this.ataqueElemental = ataqueElemental;
    }
}
