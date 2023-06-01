/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lukanka
 */
public class Main {

    public static void main(String[] args) {
        int op = 0;
        String nombre;
        int anio;
        String artista;
        ArrayList<Cancion> lista = new ArrayList<>();
        Operaciones ope = new Operaciones();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Menu de opciones:\n1. Insertar cancion.\n2. Buscar cancion.\n3. Eliminar cancion.");
            int opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre de cancion: ");
                    nombre = scan.next();
                    System.out.print("Ingrese artista: ");
                    artista = scan.next();
                    System.out.print("Ingrese anio: ");
                    anio = scan.nextInt();
                    ope.agregarCancion(new Cancion(nombre, anio, artista));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la cancion a buscar: ");
                    nombre = scan.next();
                    if (ope.buscarCancion(nombre)) {
                        System.out.println("Existe la cancion");
                    } else {
                        System.out.println("No existe la cancion");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la cancion a eliminar: ");
                    nombre = scan.next();
                    if (ope.eliminarCancion(nombre)) {
                        System.out.println("Cancion eliminada correctamente");
                    } else {
                        System.out.println("La cancion no se encuentra registrada.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.print("Volver al menu?(Si(1) / No(cualquiera): ");
            op = scan.nextInt();
        } while (op == 1);
    }
}
