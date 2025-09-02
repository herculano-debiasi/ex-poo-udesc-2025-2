package exercicio1oo.classes;

class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        c.numeroConta = "42-x";
        c.titular = "Herculano De Biasi";
        c.saldo = 200;

        System.out.println("Conta Bancária");
        System.out.println("Número da conta.: " + c.numeroConta);
        System.out.println("Titular da conta: " + c.titular);
        System.out.println("Saldo na conta..: " + c.saldo);
    }
}
