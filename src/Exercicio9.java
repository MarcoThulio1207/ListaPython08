import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ponto ponto = new Ponto(0, 0);
        Retangulo retangulo = new Retangulo(ponto, 0, 0);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("MENU");
            System.out.println("1 - Criar retângulo");
            System.out.println("2 - Alterar valores do retângulo");
            System.out.println("3 - Encontrar centro do retângulo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe as coordenadas do vértice inferior esquerdo (x, y): ");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    ponto = new Ponto(x, y);

                    System.out.print("Informe a largura do retângulo: ");
                    int largura = scanner.nextInt();
                    System.out.print("Informe a altura do retângulo: ");
                    int altura = scanner.nextInt();

                    retangulo = new Retangulo(ponto, largura, altura);
                    break;
                case 2:
                    System.out.print("Informe a nova largura do retângulo: ");
                    largura = scanner.nextInt();
                    System.out.print("Informe a nova altura do retângulo: ");
                    altura = scanner.nextInt();
                    retangulo.alterarValores(largura, altura);
                    break;
                case 3:
                    Ponto centro = retangulo.encontrarCentro();
                    centro.imprimir();
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