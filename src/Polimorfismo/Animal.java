package Polimorfismo;

public class Animal {
    public int idade;
    public String nome;
    public boolean vivo;

    public void exemploPublico(){
        System.out.println("Exemplo de código acessivel");
    }

    private void exemploPrivado(){
        System.out
                .println("Este método não está acessivel as classes que herdam essa classe");
    }

}
