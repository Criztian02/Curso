package com.cristian.www;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class isUniqueTest {

    @Test
    void palabraUnica() {
        assertTrue(isUnique.esUnico("Real"));
        assertFalse(isUnique.esUnico("Cristian"));
    }

}