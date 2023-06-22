import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     Funcionario f1 = new Funcionario("Roberto",15000);

     System.out.println("O nome do funcionário é: "+f1.getnome());
        System.out.println("O salario do funcionário é: R$"+f1.getSaralio());




    }
}