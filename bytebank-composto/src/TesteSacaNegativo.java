public class TesteSacaNegativo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(50);

        System.out.println(conta.getSaldo());
    }
}
