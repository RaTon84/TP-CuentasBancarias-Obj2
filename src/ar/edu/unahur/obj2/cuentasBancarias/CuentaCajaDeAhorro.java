package ar.edu.unahur.obj2.cuentasBancarias;

public class CuentaCajaDeAhorro extends CuentaBancaria {

    private Integer extracciones = 0;

    public void extraerDinero(Double retiro) {
        if (getSaldo() >= retiro && this.extracciones < 5) {
            setSaldo(getSaldo() - retiro);
            this.extracciones++;
        } else if (getSaldo() >= retiro + 6) {
            setSaldo(getSaldo() - retiro - 6);
            this.extracciones++;
        } else {
            throw new RuntimeException("Saldo insuficiente");
        }
    }
}
