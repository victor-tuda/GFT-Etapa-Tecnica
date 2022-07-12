package main.ex2.conta;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public void rendimento() {
        double rendimento = 0.05;
        double valorFinal = getSaldo() + (getSaldo() * rendimento);
        setSaldo(valorFinal);
    }
}
