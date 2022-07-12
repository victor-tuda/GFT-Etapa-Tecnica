package main.ex2.conta;

public abstract class Conta {
    private static int SEQUENCIAL = 1;

    protected int numero;
    protected String titular; // Poderia ser um objeto de uma possível classe de cliente "private Cliente titular"
    protected double saldo;

    public abstract void rendimento();

    public Conta(String titular) {
        setTitular(titular);
        setSaldo(0);
        setNumero(SEQUENCIAL++);
    }

    public void adicionarSaldo(double valor){
        setSaldo(getSaldo() + valor);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
