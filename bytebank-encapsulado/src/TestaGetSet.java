public class TestaGetSet {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 123);

        System.out.println(conta.getNumero());

        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        conta.setTitular(lucas);
        conta.getTitular().setProfissao("Programador");

        System.out.println(conta.getTitular().getNome());
    }
}
