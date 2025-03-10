package com.cristian.www.modules;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Cristian", new BigDecimal("1000.12345"));
        assertEquals("Cristian", cuenta.getNombre());
    }
}