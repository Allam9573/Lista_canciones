/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;

/**
 *
 * @author lukanka
 */
public class Productora {

    private int codProductora;
    private String nombre;
    private ArrayList<Cancion> listaCanciones;

    public Productora(int codProductora, String nombre) {
        this.codProductora = codProductora;
        this.nombre = nombre;
    }

    public int getCodProductora() {
        return codProductora;
    }

    public void setCodProductora(int codProductora) {
        this.codProductora = codProductora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
