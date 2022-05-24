package Calculadora;

public class Multiplicacao extends Operacao implements IOperacao{

    public Multiplicacao(double fatorUm, double fatorDois) {
        super(fatorUm, fatorDois);
    }

    @Override
    public double operacao() {
        return fatorUm * fatorDois;
    }
}
