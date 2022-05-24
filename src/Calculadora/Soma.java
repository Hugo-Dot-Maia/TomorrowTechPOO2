package Calculadora;

public class Soma extends Operacao implements IOperacao {

    public Soma(double fatorUm, double fatorDois) {
        super(fatorUm, fatorDois);
    }

    @Override
    public double operacao() {
        return fatorUm + fatorDois;
    }
}
