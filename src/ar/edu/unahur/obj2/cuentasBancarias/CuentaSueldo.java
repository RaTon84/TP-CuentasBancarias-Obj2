package ar.edu.unahur.obj2.cuentasBancarias;

public class CuentaSueldo extends CuentaBancaria{

    @Override
    public void extraerDinero(Double retiro) {
        if (getSaldo() >= retiro) {
            setSaldo(getSaldo()-retiro);
        }else {
            throw new RuntimeException("Saldo insuficiente");
        }
    }
}
