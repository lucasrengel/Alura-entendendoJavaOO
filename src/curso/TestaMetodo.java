package curso;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoLucas = new Conta();

        contaDoLucas.saldo = 100;
        contaDoLucas.deposita(100);
        System.out.println("Saldo do lucas: " + contaDoLucas.saldo);

        contaDoLucas.saca(50);
        System.out.println("Saldo do lucas: " + contaDoLucas.saldo);

        Conta contaDoLuiz = new Conta();

        boolean transferiu = contaDoLucas.transfere(100, contaDoLuiz);

        if(transferiu){
            System.out.println("Transferencia feita");
        }else{
            System.out.println("Faltou dinheiro");
        }

        System.out.println("Saldo do lucas: " + contaDoLucas.saldo);
        System.out.println("Saldo do luiz: " + contaDoLuiz.saldo);
    }
}
