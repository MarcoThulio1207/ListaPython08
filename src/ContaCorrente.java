import java.util.Scanner;
public class ContaCorrente {
    private int numeroConta;
    private String nome;
    private double saldo;

public ContaCorrente (int numeroConta, String nome, double saldo){
    this.numeroConta = numeroConta;
    this.nome = nome;
    this.saldo = saldo;
    }

      Scanner scanner = new Scanner (System.in);
      public void alterarnome (String digitarNome){
       this.nome =  digitarNome;
       System.out.println("Digite seu nome:");
       String nome = scanner.nextLine();
      }

    public void deposito (int valor){
          this.numeroConta = valor;
        System.out.println("Digite o numero da conta para depósito:");
          int numero = scanner.nextInt();
        System.out.println("Insira o valor para deposito (somente valores inteiros):");
        this.numeroConta = scanner.nextInt();
    }

    public void saque (double sacar){
          this.saldo = sacar;
        System.out.println("Insira o valor para saque:");
        this.saldo = scanner.nextDouble();

        }


        public boolean realizarSaque (double saquer) {
            if (this.saldo >= this.saldo) {
                this.saldo -= this.saldo;
                return true;
            } else {
                return false;
            }
        }
    }




