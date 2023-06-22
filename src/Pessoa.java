import java.util.Scanner;
public class Pessoa {
    private String nome;
    private int idade;
    private double peso, altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
         this.nome = nome;
         this.idade = idade;
         this.peso = peso;
         this.altura = altura;
    }

     void envelhecer(){
         this.idade ++;
         if (this.idade <21){
             this.crescer(0.5);
             System.out.println("Você cresceu " +this.idade);
         } else {

         }
     }

     void engordar (double ganhapeso){
        this.peso += ganhapeso;
     }

     void emagrecer (double perdepeso){
       this.peso = perdepeso;
     }

     void crescer (double alturaGanha){
      this.altura += alturaGanha;
     }

     Scanner scanner = new Scanner (System.in);

    void people (){
        System.out.println("Digite seu nome:");
         String name =scanner.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Digite seu peso:");
        double pso = scanner.nextDouble();
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

    }




}
