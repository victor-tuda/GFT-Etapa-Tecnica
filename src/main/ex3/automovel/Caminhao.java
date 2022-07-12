package main.ex3.automovel;

public class Caminhao extends automovel{

    public Caminhao() {
        setCombustivel("Diesel");
    }
    @Override
    public String toString() {
        return "Caminhão{" +
                "combustivel='" + combustivel + '\'' +
                '}';
    }
}
