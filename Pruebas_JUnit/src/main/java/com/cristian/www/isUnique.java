package com.cristian.www;

import java.util.HashSet;
import java.util.Set;

public class isUnique {

    // El número máximo de caracteres únicos en el conjunto de caracteres ASCII
    private static final int NUMERO_DE_CARACTERES = 256;

    /**
     * Verifica si la cadena dada tiene todos los caracteres únicos.
     *
     * @param s la cadena a verificar
     * @return true si la cadena tiene todos los caracteres únicos, false en caso contrario
     */
    public static boolean esUnico(String s) {
        // Si la longitud de la cadena excede el número de caracteres únicos, no puede ser única
        if (s.length() > NUMERO_DE_CARACTERES) {
            return false;
        }
        // Usar un conjunto para rastrear los caracteres que se han visto
        Set<Character> conjunto = new HashSet<>();
        // Iterar sobre cada carácter en la cadena
        for (Character c : s.toCharArray()) {
            // Si el carácter ya está en el conjunto, la cadena no es única
            if (conjunto.contains(c)) {
                return false;
            }
            // Agregar el carácter al conjunto
            conjunto.add(c);
        }
        // Si no se encontraron duplicados, la cadena es única
        return true;
    }

}