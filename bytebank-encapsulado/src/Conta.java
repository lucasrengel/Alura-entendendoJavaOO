public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            System.out.println("Valor sacado com sucesso");
            this.saldo -= valor;
            return true;
        }
        System.out.println("Valor digitado maior que saldo.");
        return false;
    }

    public boolean transfere(double valor, Conta desitno) {
        if (this.saldo >= valor) {
            System.out.println("Valor transferido com sucesso ");
            this.saldo = this.saldo - valor;
            desitno.deposita(valor);
            return true;
        }
        System.out.println("Valor digitado maior que saldo.");
        return false;
    }

    public double getSaldo() {
        return saldo;
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
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("Numero invalido");
        }
    }
}
