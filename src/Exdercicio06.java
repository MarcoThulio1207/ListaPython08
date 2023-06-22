import java.util.Scanner;
public class Exdercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Tv tv = new Tv();
        int opcao;

        System.out.println("Wellcome a sua TV");

        while (true){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Mudar de Canal");
            System.out.println("2 - Aumentar o volume");
            System.out.println("3 - Diminuir o volume");
            System.out.println("0 - Desligar a sua TV");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1 :
                    System.out.println("informe o canal:");
                    int novoCanal = scanner.nextInt();
                    tv.mudarCanal(novoCanal);
                    break;
                case 2:
                    tv.aumentoVolume();
                    break;
                case 3:
                    tv.diminuirVolume();
                    break;
                case 0:
                    System.out.println("Desligando ...");
                    scanner.close();
                    System.exit(0);

            }

        }

    }
}