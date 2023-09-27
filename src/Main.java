public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta("Lucas");
        conta1.setSaldo(100);
        System.out.println("Saldo conta 1: R$" + conta1.getSaldo());
        conta1.deposita(100);
        System.out.println("Saldo conta 1: R$" + conta1.getSaldo());

        Conta conta2 = new Conta("Luiz");
        conta2.setSaldo(50);
        System.out.println("Saldo conta 2: R$" + conta2.getSaldo());

        conta1.transfere(100, conta2);
    }
}