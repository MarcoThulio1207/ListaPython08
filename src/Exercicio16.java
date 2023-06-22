import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Bichinho tama = new Bichinho("Tama", 3, 9, 2);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Tamagotchi!");
        System.out.println("O que você deseja fazer?");
        System.out.println("1. Alimentar o Tamagotchi");
        System.out.println("2. Brincar com o Tamagotchi");
        System.out.println("3. Alterar o nome do Tamagotchi");
        System.out.println("4. Ver informações secretas do Tamagotchi");
        System.out.println("5. Sair");

        int opcao = scanner.nextInt();

        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    System.out.println("Informe a quantidade de comida: ");
                    int quantidadeComida = scanner.nextInt();
                    tama.alimentar(quantidadeComida);
                    break;
                case 2:
                    System.out.println("Informe o tempo de brincadeira: ");
                    int tempoBrincadeira = scanner.nextInt();
                    tama.brincar(tempoBrincadeira);
                    break;
                case 3:
                    System.out.println("Informe o novo nome do Tamagotchi: ");
                    String novoNome = scanner.next();
                    tama.alterarNome(novoNome);
                    break;
                case 4:
                    System.out.println("Opção secreta selecionada!");
                    System.out.println(tama.str());
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("\nO que você deseja fazer?");
            System.out.println("1. Alimentar o Tamagotchi");
            System.out.println("2. Brincar com o Tamagotchi");
            System.out.println("3. Alterar o nome do Tamagotchi");
            System.out.println("4. Ver informações secretas do Tamagotchi");
            System.out.println("5. Sair");

            opcao = scanner.nextInt();
        }

        System.out.println("Até logo!");
    }
}
    }
}