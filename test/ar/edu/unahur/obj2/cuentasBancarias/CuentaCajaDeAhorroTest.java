package ar.edu.unahur.obj2.cuentasBancarias;

import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaCajaDeAhorroTest {

    private CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro();

    @Test
    public void saldoEnCuentaCajaDeAhorro() {
        Double valorEsperado = 0.0;
        assertNotNull(cuenta.getSaldo());
        assertNotNull(cuenta);
        assertEquals(valorEsperado, cuenta.getSaldo());
    }

    @Test
    public void depositoEnCuentaCajaDeAhorro() {
        Double deposito = 100.0;
        cuenta.setSaldo(deposito);
        Double valorEsperado = 100.0;
        assertEquals(valorEsperado, cuenta.getSaldo());
    }

    @Test
    public void retiroEnCuentaCajaDeAhorro() {
        cuenta.setSaldo(1000.0);
        Double retiro = 100.0;
        cuenta.extraerDinero(retiro);
        Double valorEsperado = 900.0;
        assertEquals(valorEsperado, cuenta.getSaldo());
    }

    @Test
    public void costoAdicionalPorExtraccionEnCuentaCajaDeAhorro() {
        Double retiro = 100.0;
        cuenta.setSaldo(1000.0);
        for (int i = 0; i < 6; i++) {
            cuenta.extraerDinero(retiro);
        }
        Double valorEsperado = 394.0;
        assertEquals(valorEsperado, cuenta.getSaldo());
    }
}
