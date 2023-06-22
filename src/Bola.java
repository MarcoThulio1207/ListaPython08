import java.util.Scanner;
public class Bola {
    String cor,material;
    double circunferencia;

    Scanner scanner = new Scanner(System.in);
    String trocadeCor;
    void mostraCor(){
     System.out.println("A cor atual é:" +cor);
    }

    void trocaCor(){
        System.out.println("Digite uma nova cor:");
        trocadeCor = scanner.next();
    }

}
