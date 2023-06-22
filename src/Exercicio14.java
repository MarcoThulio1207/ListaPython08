import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Funcionario f1 = new Funcionario("Roberto",15000,15000);

        System.out.println("O nome do funcionário é: "+f1.getnome());
        System.out.println("O salario do funcionário é: R$"+f1.getSaralio());
        f1.aumentarSalario(10.0);
        System.out.println("O novo salario aumentado em 10% do funcionário é: R$"+f1.getSaralio());

    }
}