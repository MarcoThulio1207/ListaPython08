import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Novotama  n1=  new Novotama("Loxas", 3, 9, 2);

        System.out.println("Nome do Tamagotchi: " + n1.retornarNome());
        System.out.println("Fome do Tamagotchi: " + n1.retornarFome());
        System.out.println("Saúde do Tamagotchi: " + n1.retornarSaude());
        System.out.println("Idade do Tamagotchi: " + n1.retornarIdade());
        System.out.println("Humor do Tamagotchi: " + n1.retornarHumor());

        n1.alterarNome("NovoTama");
        n1.alimentar(4);
        n1.brincar(3);
        n1.alterarIdade(3);

        System.out.println("Dados atualizados do Tamagotchi:");
        System.out.println("Nome do Tamagotchi: " + n1.retornarNome());
        System.out.println("Fome do Tamagotchi: " + n1.retornarFome());
        System.out.println("Saúde do Tamagotchi: " + n1.retornarSaude());
        System.out.println("Idade do Tamagotchi: " + n1.retornarIdade());
        System.out.println("Humor do Tamagotchi: " + n1.retornarHumor());

    }
}