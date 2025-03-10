package com.cristian.www.modules;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


class CuentaTest {

    /**
     * Verifica que el saldo de la cuenta se establece correctamente
     * al crear una instancia de la clase Cuenta.
     */
    @Test
    void testSaldoCuenta() {
        Cuenta cuenta = new Cuenta("Cristian", new BigDecimal("1000.12345"));
        assertEquals(new BigDecimal("1000.12345"), cuenta.getSaldo());
    }

    /**
     * Verifica que el nombre de la cuenta se establece correctamente
     * al crear una instancia de la clase Cuenta.
     */
    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Cristian", new BigDecimal("1000.12345"));
        assertEquals("Cristian", cuenta.getNombre());
    }
}