package ar.edu.unahur.obj2.cuentasBancarias;

public class CuentaCajaDeAhorro extends CuentaBancaria {

    private Integer extracciones = 0;
    private Integer limiteDeExtracciones = 5;
    private Double costoAdicional = 6.0;

    @Override
    public void extraerDinero(Double retiro) {
        if (getSaldo() >= retiro && this.extracciones < this.limiteDeExtracciones) {
            setSaldo(getSaldo() - retiro);
            this.extracciones++;
        } else if (getSaldo() >= retiro + costoAdicional) {
            setSaldo(getSaldo() - retiro - costoAdicional);
            this.extracciones++;
        } else {
            throw new RuntimeException("Saldo insuficiente");
        }
    }
}
