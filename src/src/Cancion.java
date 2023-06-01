/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author lukanka
 */
public class Cancion {

    private static int codCancion = 0;
    private String nombre;
    private int anio;
    private String artista;

    public Cancion(String nombre, int anio, String artista) {
        this.codCancion = codCancion + 1;
        this.nombre = nombre;
        this.anio = anio;
        this.artista = artista;
    }

    public int getCodCancion() {
        return codCancion;
    }

    public void setCodCancion(int codCancion) {
        this.codCancion = codCancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

}
