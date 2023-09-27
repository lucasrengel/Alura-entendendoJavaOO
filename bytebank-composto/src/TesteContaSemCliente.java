public class TesteContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo());

        contaDaMarcela.titular = new Cliente();

        contaDaMarcela.titular.nome = "Marecela";
        System.out.println(contaDaMarcela.titular.nome);
    }
}
