/*
 *Variáveis: Número da Conta, Saldo, Titular, Limite de saque
 *Métodos: Depósito, Saque, imprimir informações
 */

class ContaBancaria {
    private String numeroDaConta;
    private double saldo;
    private String titular;
    private double limiteDeSaque;

    public ContaBancaria(String numeroDaConta, double saldo, String titular, double limiteDeSaque) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
        this.limiteDeSaque = limiteDeSaque;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        if(valor <= saldo && valor <= limiteDeSaque) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saque não autorizado. Saldo insuficiente ou limite de saque excedido.");
        }
    }

    public void imprimirInformacoes() {
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite de saque: " + limiteDeSaque);
    }

}