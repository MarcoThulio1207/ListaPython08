import java.util.Scanner;
public class Macaco {
    String nome;
    int bucho;
    String alimento;
    Scanner scanner = new Scanner (System.in);
    String ler1,ler2,ler3;
    public  Macaco (String nome, int bucho,String alimento){
        this.nome = nome;
        this.alimento = alimento;
        this.bucho = bucho;
    }

    public void comer() {
        System.out.println("Qual alimento deseja comer? escolha 3");
        ler1 = scanner.nextLine();
        ler2 = scanner.nextLine();
        ler3 = scanner.nextLine();
    }

    public void verBucho (){
       String verAlimento;
        System.out.println("Seu macaco está comendo " +ler1);
        System.out.println("Seu macaco está comendo " +ler2);
        System.out.println("Seu macaco está comendo " +ler3);
    }

    public void digerir () {
     String satisfeito;
     String comFome;

    }

    public void buxo (int novoBucho){
       this.bucho = novoBucho;
    }

    public int getBucho (){
     return this.bucho;
    }

    public String getStatus(){
        int status = scanner.nextInt();
        if (status == 1){
          System.out.println("Faminto");
      }
      else if (status == 2){
          System.out.println("Ainda com fome");
      }
      else if (status == 3){
          System.out.println("Satisfeito");
      }
      else if (status == 4) {
          System.out.println("Comeria outro macaco");
      }

        return null;
    }




}
