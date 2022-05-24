package Calculadora;

public class Subtracao extends Operacao implements IOperacao{

    public Subtracao(double fatorUm, double fatorDois) {
        super(fatorUm, fatorDois);
    }

    @Override
    public double operacao() {
        return fatorUm - fatorDois;
    }
}
