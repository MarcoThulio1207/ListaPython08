import java.util.Scanner;
public class Exercicio12 {
        public static void main(String[] args) {
            Investimento poupanca = new Investimento(1000.00, 10.0);

            System.out.println("Saldo inicial: R$" + poupanca.getSaldo());

            for (int i = 1; i <= 5; i++) {
                poupanca.adicioneJuros();
                System.out.println("Saldo após adição de juros " + i + ": R$" + poupanca.getSaldo());
            }
        }
        }
