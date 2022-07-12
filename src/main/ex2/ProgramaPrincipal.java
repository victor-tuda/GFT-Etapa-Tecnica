package main.ex2;

import main.ex2.conta.ContaCorrente;
import main.ex2.conta.ContaPoupanca;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Victor");
        ContaPoupanca c2 = new ContaPoupanca("Tester");

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c1.adicionarSaldo(10);
        c2.adicionarSaldo(10);

        c1.rendimento();
        c2.rendimento();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
