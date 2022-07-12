package main.ex3;

import main.ex3.automovel.Caminhao;
import main.ex3.automovel.Esportivo;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Esportivo e1 = new Esportivo();
        Caminhao c1 = new Caminhao();

        System.out.println(c1.toString());
        System.out.println(e1.toString());
    }
}
