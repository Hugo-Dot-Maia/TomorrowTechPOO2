package Calculadora;

public abstract class Operacao {
    double fatorUm, fatorDois;

    public Operacao(double fatorUm, double fatorDois) {
        this.fatorUm = fatorUm;
        this.fatorDois = fatorDois;
    }
}
