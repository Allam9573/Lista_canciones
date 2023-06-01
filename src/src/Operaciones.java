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
public class Operaciones {

    private ArrayList<Cancion> listaCanciones = new ArrayList<>();

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void agregarCancion(Cancion cancion) {
        listaCanciones.add(cancion);
    }

    public boolean buscarCancion(String nombre) {
        boolean existeCancion = false;
        for (int i = 0; i < listaCanciones.size(); i++) {
            if (listaCanciones.get(i).getNombre().equals(nombre)) {
                existeCancion = true;
            } else {
                existeCancion = false;
            }
        }
        return existeCancion;
    }

    public boolean eliminarCancion(String nombre) {
        boolean eliminada = false;
        for (int i = 0; i < listaCanciones.size(); i++) {
            if (listaCanciones.get(i).getNombre().equals(nombre)) {
                listaCanciones.remove(i);
                eliminada = true;
            } else {
                eliminada = false;
            }
        }
        return eliminada;
    }
}
