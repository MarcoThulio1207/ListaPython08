import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o consumo de combustível do carro (km/l): ");
        double consumo = scanner.nextDouble();

        Carro carro = new Carro(consumo);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("MENU");
            System.out.println("1 - Andar com o carro");
            System.out.println("2 - Verificar nível de combustível");
            System.out.println("3 - Abastecer o carro");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a distância a percorrer (km): ");
                    double distancia = scanner.nextDouble();
                    carro.andar(distancia);
                    break;
                case 2:
                    System.out.println("Nível de combustível: " + carro.obterGasolina());
                    break;
                case 3:
                    System.out.print("Informe a quantidade de combustível a ser adicionada: ");
                    double quantidade = scanner.nextDouble();
                    carro.adicionarGasolina(quantidade);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        }

        scanner.close();
    }
}

