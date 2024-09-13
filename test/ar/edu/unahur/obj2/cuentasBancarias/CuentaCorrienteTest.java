package ar.edu.unahur.obj2.cuentasBancarias;

import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaCorrienteTest {

    private CuentaCorriente cuenta = new CuentaCorriente();

    @Test
    public void saldoEnCuentaCorriente() {
        Double valorEsperado = 0.0;
        assertNotNull(cuenta.getSaldo());
        assertNotNull(cuenta);
        assertEquals(valorEsperado, cuenta.getSaldo());
    }

    @Test
    public void depositoEnCuentaCorriente() {
        Double deposito = 100.0;
        cuenta.setSaldo(deposito);
        Double valorEsperado = 100.0;
        assertEquals(valorEsperado, cuenta.getSaldo());
    }

    @Test
    public void retiroEnCuentaCorriente() {
        cuenta.setSaldo(1000.0);
        Double valorEsperado = 900.0;
        Double retiro = 100.0;
        cuenta.extraerDinero(retiro);
        assertEquals(valorEsperado, cuenta.getSaldo());
    }

    @Test
    public void establecerGiroEnCuentaCorriente() {
        Integer giro = 150;
        cuenta.setGiroDescubierto(giro);
        Integer valorEsperado = 150;
        assertEquals(valorEsperado, cuenta.getGiroDescubierto());
    }

    @Test
    public void retiroConGiroEnCuentaCorriente() {
        cuenta.setSaldo(100.0);
        Integer giro = 150;
        cuenta.setGiroDescubierto(giro);
        Double retiro = 200.0;
        cuenta.extraerDinero(retiro);
        Double valorEsperado = -105.0;
        assertEquals(valorEsperado, cuenta.getSaldo());
    }

}
