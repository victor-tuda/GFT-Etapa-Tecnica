package main.ex2.conta;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void rendimento() {
        double rendimento = 0.03;
        double valorFinal = getSaldo() + (getSaldo() * rendimento);
        setSaldo(valorFinal);
    }
}
