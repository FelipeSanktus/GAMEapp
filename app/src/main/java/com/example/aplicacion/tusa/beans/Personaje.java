package com.example.aplicacion.tusa.beans;

public class Personaje {
    //datos generales
    private String nombre;  //Nombre del personaje
    private double nivel;   //Nivel del personaje
    private double vida;    //Salud total del personaje
    private double mana;    //Mana total del personaje

    //estadisticas primarias
    private double fuerza;         //Aumenta el dano fisico
    private double agilidad;    //Aumenta la velocidad de ataque
    private double intelecto;   //Aumenta el mana y dano magico
    private double aguante;     //Aumenta la salud
    private double espiritu;    //Aumenta la regeneracion de mana

    //datos defensivos
    private double armadura;        //Disminuye el dano fisico recibido
    private double armaduraMagica;  //Disminuye el daño magico recibido
    private double esquive;         //Aumenta la probabilidad de esquivar
    private double parada;          //Aumenta la probabilidad de parar el ataque

    //datos de resistencia
    private double resistenciaFuego;    //Disminuye el daño de fuego
    private double resistenciaAgua;     //Disminuye el daño de agua
    private double resistenciaTierra;   //Disminuye el daño de tierra
    private double resistenciaAire;     //Disminuye el daño de aire
    private double resistenciaOscuridad;//Disminuye el daño de oscuridad
    private double resistenciaLuz;      //Disminuye el daño de luz

    public Personaje(String nombre){
        this.nombre = nombre;
        this.nivel = 1.0;
        this.vida = 100.0;
        this.mana = 50.0;

        this.fuerza = 5.0;
        this.agilidad = 5.0;
        this.intelecto = 5.0;
        this.aguante = 0.0;
        this.espiritu = 0.0;

        this.armadura = 0.0;
        this.armaduraMagica = 0.0;
        this.esquive = 0.0;
        this.parada = 0.0;

        this.resistenciaFuego = 0.0;
        this.resistenciaAgua = 0.0;
        this.resistenciaTierra = 0.0;
        this.resistenciaAire = 0.0;
        this.resistenciaOscuridad = 0.0;
        this.resistenciaLuz = 0.0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNivel() {
        return nivel;
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
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

    public double getResistenciaFuego() {
        return resistenciaFuego;
    }

    public void setResistenciaFuego(double resistenciaFuego) {
        this.resistenciaFuego = resistenciaFuego;
    }

    public double getResistenciaAgua() {
        return resistenciaAgua;
    }

    public void setResistenciaAgua(double resistenciaAgua) {
        this.resistenciaAgua = resistenciaAgua;
    }

    public double getResistenciaTierra() {
        return resistenciaTierra;
    }

    public void setResistenciaTierra(double resistenciaTierra) {
        this.resistenciaTierra = resistenciaTierra;
    }

    public double getResistenciaAire() {
        return resistenciaAire;
    }

    public void setResistenciaAire(double resistenciaAire) {
        this.resistenciaAire = resistenciaAire;
    }

    public double getResistenciaOscuridad() {
        return resistenciaOscuridad;
    }

    public void setResistenciaOscuridad(double resistenciaOscuridad) {
        this.resistenciaOscuridad = resistenciaOscuridad;
    }

    public double getResistenciaLuz() {
        return resistenciaLuz;
    }

    public void setResistenciaLuz(double resistenciaLuz) {
        this.resistenciaLuz = resistenciaLuz;
    }
}
