package ar.edu.unahur.obj2.cuentasBancarias;

import static org.junit.Assert.*;
import org.junit.Test;

public class CuentaSueldoTest {

    private CuentaSueldo cuenta = new CuentaSueldo();

    @Test
    public void saldoEnCuentaSueldo() {
        Double valorEsperado = 0.0;
        assertNotNull(cuenta.getSaldo());
        assertNotNull(cuenta);
        assertEquals(valorEsperado, cuenta.getSaldo());
    }

    @Test
    public void depositoEnCuentaSueldo() {
        Double deposito = 100.0;
        cuenta.setSaldo(deposito);
        Double valorEsperado = 100.0;
        assertEquals(valorEsperado, cuenta.getSaldo());
    }

    @Test
    public void retiroEnCuentaSueldo() {
        cuenta.setSaldo(1000.0);
        Double retiro = 100.0;
        cuenta.extraerDinero(retiro);
        Double valorEsperado = 900.0;
        assertEquals(valorEsperado, cuenta.getSaldo());
    }
}
