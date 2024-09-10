package ar.edu.unahur.obj2.cuentasBancarias;

public class CuentaCorriente extends CuentaBancaria{

    private Integer giroDescubierto = 0;
    private Double adicional = 5.0;

    @Override
    public void extraerDinero(Double retiro) {
        if (getSaldo() >= retiro) {
            setSaldo(getSaldo()-retiro);
        }else if (getSaldo() + this.giroDescubierto >= retiro) {
            setSaldo(getSaldo()-retiro);                    //this.saldo -= retiro;
            setSaldo(getSaldo()*(this.adicional/100+1));    //this.saldo *= this.adicional/100+1;
            //Double aGirar = (retiro - getSaldo()) * (this.adicional/100+1);
            //setSaldo(-aGirar);
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
