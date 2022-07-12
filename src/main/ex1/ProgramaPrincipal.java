package main.ex1;

import main.ex1.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void mostrarPesoPorFaixasEtarias(ArrayList<Pessoa> pessoas){
        ArrayList<Pessoa> criancas = new ArrayList<Pessoa>(); // De 1 a 10 anos
        ArrayList<Pessoa> jovens = new ArrayList<Pessoa>(); // De 11 a 20 anos
        ArrayList<Pessoa> jovensAdultos = new ArrayList<Pessoa>(); // De 21 a 30 anos
        ArrayList<Pessoa> adultos = new ArrayList<Pessoa>(); // De 31 + anos

        for (Pessoa p : pessoas){
            int idade = p.getIdade();
            double peso = p.getPeso();

            if(1 <= idade && idade <= 10)
                criancas.add(p);
            else if(11 <= idade && idade <= 20)
                jovens.add(p);
            else if(21 <= idade && idade <= 30)
                jovensAdultos.add(p);
            else if(31 <= idade)
                adultos.add(p);
            else
                System.out.println("IDADE INVÁLIDA, NÃO ENTROU EM NENHUMA CATEGORIA");
        }

        System.out.println("===== CRIANÇAS =====");
        for (Pessoa p: criancas)
            System.out.println(p.toString());
        System.out.printf("CONTAGEM: %d\n", criancas.size());

        System.out.println("===== JOVENS =====");
        for (Pessoa p: jovens)
            System.out.println(p.toString());
        System.out.printf("CONTAGEM: %d\n", jovens.size());

        System.out.println("===== JOVENS ADULTOS =====");
        for (Pessoa p: jovensAdultos)
            System.out.println(p.toString());
        System.out.printf("CONTAGEM: %d\n", jovensAdultos.size());

        System.out.println("===== ADULTOS =====");
        for (Pessoa p: adultos)
            System.out.println(p.toString());
        System.out.printf("CONTAGEM: %d\n", adultos.size());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        for (int i = 0; i < 10; i++){ // Cadastro das pessoas;
            Pessoa p = new Pessoa();
            System.out.printf("=== PESSOA [%d] ===\n", i + 1);
            System.out.print("IDADE: ");
            int idade = sc.nextInt();
            System.out.print("PESO: ");
            double peso = sc.nextDouble();

            p.setIdade(idade);
            p.setPeso(peso);

            pessoas.add(p);
        }

        mostrarPesoPorFaixasEtarias(pessoas); // Mostrando os pesos por faixa etária
    }
}
