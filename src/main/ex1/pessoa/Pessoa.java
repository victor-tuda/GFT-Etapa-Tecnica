package main.ex1.pessoa;

public class Pessoa {
    private int idade;
    private double peso;

    public Pessoa() {
        setIdade(0);
        setPeso(0);
    }

    public Pessoa(int idade, double peso) {
        setIdade(idade);
        setPeso(peso);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", peso=" + peso +
                '}';
    }
}
