import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
     Tamagushi t1 = new Tamagushi ("Toguro",12,9,7);
        System.out.println("Nome: "+t1.getNome());
        System.out.println("Fome: "+t1.getFome());
        System.out.println("Saúde: "+t1.getSaude());
        System.out.println("Idade: "+t1.getIdade());
        System.out.println("Humor:"+t1.getHumor());

        t1.trocarNome("Toy");
        t1.trocaFome(3);
        t1.trocaIdade(5);
        t1.trocaSaude(2);

        System.out.println("Nome trocado para: "+t1.getNome());
        System.out.println("Fome trocado para: "+t1.getFome());
        System.out.println("Saúde trocado para: "+t1.getSaude());
        System.out.println("Idade trocado para: "+t1.getIdade());
        System.out.println("Humor trocado para: "+t1.getHumor());


    }
}