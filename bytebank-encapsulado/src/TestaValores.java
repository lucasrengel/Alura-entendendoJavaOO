public class TestaValores {

    public static void main(String[] args) {
        Conta conta1 = new Conta(150, 52);

        System.out.println("Agencia da conta 1: " + conta1.getAgencia());

        Conta conta2 = new Conta(11, 342);

        System.out.println("Total de contas criadas:  " + Conta.getTotal());
    }
}
