public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("00123456", 100, "Diego", 500);

        conta.deposito(500);
        conta.saque(300);
        conta.imprimirInformacoes();
    }
}
