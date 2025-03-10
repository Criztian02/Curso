package com.cristian.www.colecciones;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        // TreeSet es una implementación de la interfaz Set que almacena elementos en un árbol rojo-negro (Red-Black Tree).
        // Mantiene los elementos ordenados de manera natural o según un Comparator personalizado.
        // No permite duplicados ni elementos nulos. Las operaciones como add(), remove() y contains() tienen un rendimiento O(log n).

        // TreeSet ordena los elementos de menor a mayor
        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        System.out.println(ts);

        Set<Integer> ts2 = new TreeSet<>();
        ts2.add(1);
        ts2.add(4);
        ts2.add(6);
        ts2.add(2);
        ts2.add(11);
        System.out.println(ts2);

        // TreeSet ordena los elementos de menor a mayor con programación funcional (lampda)
        Set<String> tsReverse = new TreeSet<>((a, b) -> b.compareTo(a));
        tsReverse.add("uno");
        tsReverse.add("dos");
        tsReverse.add("tres");
        tsReverse.add("cuatro");
        tsReverse.add("cinco");
        System.out.println(tsReverse);

        // TreeSet ordena los elementos de menor a mayor con Comparator.reverseOrder()
        Set<String> tsReverse2 = new TreeSet<>(Comparator.reverseOrder());
        tsReverse2.add("uno");
        tsReverse2.add("dos");
        tsReverse2.add("tres");
        tsReverse2.add("cuatro");
        tsReverse2.add("cinco");
        System.out.println(tsReverse2);
    }
}
