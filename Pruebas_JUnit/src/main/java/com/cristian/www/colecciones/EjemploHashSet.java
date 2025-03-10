package com.cristian.www.colecciones;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSet {
    public static void main(String[] args) {
        /*
        * La tabla hash permite un acceso muy rápido a los elementos
        *
        * No permite duplicados: Si intentas agregar un elemento que ya existe, simplemente lo ignora.
        * No garantiza un orden específico: Los elementos se almacenan según su código hash, no en el orden en que se agregan.
        * */
        Set<String> conjunto = new HashSet<>();
        conjunto.add("uno");
        conjunto.add("dos");
        conjunto.add("tres");
        conjunto.add("cuatro");
        conjunto.add("cinco");
        conjunto.add("uno");
        System.out.println(conjunto);
    }
}
