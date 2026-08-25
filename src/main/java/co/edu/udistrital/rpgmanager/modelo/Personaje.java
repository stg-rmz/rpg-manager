package co.edu.udistrital.rpgmanager.modelo;

public class Personaje {
    private String nombre;
    private String tipo;
    private int nivel;
    private int vida;

    public Personaje(String nombre, String tipo, int nivel, int vida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vida = vida;
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public int getNivel() {
        return nivel;
    }
    public int getVida() {
        return vida;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setNivel (int nivel) {
        this.nivel = nivel;
    }
    public void setVida (int vida) {
        this.vida = vida;
    }
}