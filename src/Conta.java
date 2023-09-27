import java.util.Scanner;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private String titular;

    Conta(String titular){
        this.titular = titular;
    }

    public double saca(double valor){
        this.saldo = valor - saldo;
        return saldo;
    }

    public void transfere(double valor, Conta destino) {
        if (valor > saldo) {
            System.out.println("Valor inserido maior que saldo, transferência não realizada!");
        } else {
            saldo -= valor;
            destino.deposita(valor);
            System.out.println("Transferência para " + destino.getTitular() + " realizada com sucesso!");
        }
    }

    public double deposita(double valor){
        this.saldo = valor + saldo;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
