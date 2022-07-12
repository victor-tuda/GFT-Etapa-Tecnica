package main.ex3.automovel;

public class Esportivo extends automovel{
    public Esportivo() {
        setCombustivel("Gasolina");
    }

    @Override
    public String toString() {
        return "Esportivo{" +
                "combustivel='" + combustivel + '\'' +
                '}';
    }
}
