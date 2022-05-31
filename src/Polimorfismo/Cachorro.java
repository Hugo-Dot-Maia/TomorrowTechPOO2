package Polimorfismo;

public class Cachorro extends Animal implements IAnimal {
    @Override
    public void alimentar() {
        System.out.println("Alimentado");
    }

    @Override
    public void respirar() {
        System.out.println("Respirou");

    }

    public void brincar(){
        System.out.println("Brincando");
    }

    public void comunicar(){
        System.out.println("Comunicando");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", vivo=" + vivo +
                '}';
    }
}
