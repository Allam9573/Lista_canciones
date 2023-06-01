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
public class Main {

    public static void main(String[] args) {
        ArrayList<Cancion> listaCanciones = new ArrayList<>();
        Cancion c1 = new Cancion(0, "Dont Cry", 0, "Guns and Roses");
        listaCanciones.add(c1);
        System.out.println(listaCanciones.get(0).getNombre() +" - "+listaCanciones.get(0).getArtista());
    }
}
