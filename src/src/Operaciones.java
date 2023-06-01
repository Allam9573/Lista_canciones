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

    private ArrayList<Cancion> listaCanciones;

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(Cancion cancion) {
        listaCanciones.add(cancion);
    }

    public void buscarCancion(Cancion cancion) {
        for (int i = 0; i < listaCanciones.size(); i++) {
            if (listaCanciones.get(i).getNombre() == cancion.getNombre()) {
                System.out.println("Si existe la cancion");
            } else {
                System.out.println("No existe la cancion");
            }
        }
    }
}
