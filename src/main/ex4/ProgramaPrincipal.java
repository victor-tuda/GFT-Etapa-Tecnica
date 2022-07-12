package main.ex4;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean podeDoarSangue;
        System.out.print("DIGITE A SUA IDADE: ");
        int idade = sc.nextInt();

        if(18 <= idade && idade <= 67){
            System.out.println("PODE DOAR SANGUE");
            podeDoarSangue = true;
        }

        else {
            System.out.println("NÃO PODE DOAR SANGUE");
            podeDoarSangue = false;
        }
    }
}
