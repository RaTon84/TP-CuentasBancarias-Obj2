package ar.edu.unahur.obj2.cuentasBancarias;

public abstract class CuentaBancaria {

    private Double saldo = 0.0;

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public abstract void extraerDinero(Double retiro);
}
