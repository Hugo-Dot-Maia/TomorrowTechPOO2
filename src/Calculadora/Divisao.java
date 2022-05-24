package Calculadora;

public class Divisao extends Operacao implements IOperacao{

    public Divisao(double fatorUm, double fatorDois) {
        super(fatorUm, fatorDois);
    }

    @Override
    public double operacao() {
        return fatorUm/fatorDois;
    }
}
