import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner escolha = new  Scanner (System.in);

        Macaco m1 = new Macaco("Monkey",2,"Banana");
        m1.comer();
        m1.verBucho();
        System.out.println("Escolha um numero para reprentar a fome do seu macaco:");
        System.out.println("1 - Faminto");
        System.out.println("2 - Ainda com fome");
        System.out.println("3 - Satisfeito");
        System.out.println("4 - Surpresa");
        m1.getStatus();


    }
}