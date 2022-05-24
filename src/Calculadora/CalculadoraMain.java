package Calculadora;

import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double resultado = 0, fatorUm, fatorDois;

        int opcao;
        String loop;

        do {
            System.out.println("Calculadora");
            System.out.println("Esta calculadora executa 4 operações");
            System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
            System.out.print("Insira a operação deseja efetuar: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Informe o primeiro número que deseja somar: ");
                    fatorUm = scanner.nextDouble();
                    System.out.print("Informe o segundo número que deseja somar: ");
                    fatorDois = scanner.nextDouble();
                    Soma soma = new Soma(fatorUm, fatorDois);
                    resultado = soma.operacao();
                }
                case 2 -> {
                    System.out.print("Informe o minuendo: ");
                    fatorUm = scanner.nextDouble();
                    System.out.print("Informe o subtraendo: ");
                    fatorDois = scanner.nextDouble();
                    Subtracao subtracao = new Subtracao(fatorUm, fatorDois);
                    resultado = subtracao.operacao();
                }
                case 3 -> {
                    System.out.print("Informe o primeiro número: ");
                    fatorUm = scanner.nextDouble();
                    System.out.print("Informe o segundo número: ");
                    fatorDois = scanner.nextDouble();
                    Multiplicacao multiplicacao = new Multiplicacao(fatorUm, fatorDois);
                    resultado = multiplicacao.operacao();
                }
                case 4 -> {
                    System.out.print("Informe o dividendo: ");
                    fatorUm = scanner.nextDouble();
                    System.out.print("Informe o divisor: ");
                    fatorDois = scanner.nextDouble();
                    Divisao divisao = new Divisao(fatorUm, fatorDois);
                    resultado = divisao.operacao();
                }
            }


            System.out.println("Resultado da operação: " + resultado);
            System.out.println("Deseja executar outra operação? [S/N]: ");
            loop = scanner.next();

        }while (loop.equals("S"));

    }
}
