package ar.edu.unahur.obj2.cuentasBancarias;

public class CuentaCorriente extends CuentaBancaria{

    private Integer giroDescubierto = 0;
    private Double adicional = 5.0;

    public void extraerDinero(Double retiro) {
        if (getSaldo() >= retiro) {
            setSaldo(getSaldo()-retiro);//this.saldo -= retiro;
        }else if (getSaldo() + this.giroDescubierto >= retiro) {
            setSaldo(getSaldo()-retiro);//this.saldo -= retiro;
            setSaldo(getSaldo()*(this.adicional/100+1)); //this.saldo *= this.adicional/100+1;
        }else{
            throw new RuntimeException("Saldo insuficiente");
        }
    }

    public void setGiroDescubierto(Integer giroDeCuenta) {
        this.giroDescubierto = giroDeCuenta;
    }

    public Integer getGiroDescubierto() {
        return this.giroDescubierto;
    }
}
