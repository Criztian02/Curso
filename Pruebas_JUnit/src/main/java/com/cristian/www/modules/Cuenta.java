package com.cristian.www.modules;

import java.math.BigDecimal;
import java.util.Objects;

public class Cuenta {

    private String nombre;
    private BigDecimal saldo;

    public Cuenta(String nombre, BigDecimal saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }


@Override
public boolean equals(Object o) {
    if (!(o instanceof Cuenta cuenta)) return false;
    return Objects.equals(getNombre(), cuenta.getNombre()) && Objects.equals(getSaldo(), cuenta.getSaldo());
}

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getSaldo());
    }
}