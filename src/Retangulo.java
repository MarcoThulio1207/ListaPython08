import java.util.Scanner;
public class Retangulo {

    private int ladoA,ladoB;
    public Retangulo(int ladoA, int ladoB){
    }

     void mudarValodoLado (int ladoNovo){
        this.ladoA = ladoNovo;
        this.ladoB = ladoNovo;
     }

     int  retornarValorladoA (){
         return this.ladoA;
     }

     int retornarValorladoB (){
        return this.ladoB;
     }

     int calcularArea (){
         return  this.ladoA * this.ladoB;
     }

     int calcularPerimetro (){
        return 2 * (this.ladoA + this.ladoB);
     }

     void preencher() {
         Scanner ler = new Scanner(System.in);

         System.out.println("Informe a pirmeira medida de um local (Somente valores inteiros)");
         this.ladoA = ler.nextInt();
         System.out.println("Informe a segunda medida de um local (Somente valores inteiros)");
         this.ladoB = ler.nextInt();
     }



     void objeto (){
         Scanner piso = new Scanner (System.in);
         System.out.println("Seu retângulo tem as seguintes medidas:");
         System.out.println("Lado A: "  +this.ladoA);
         System.out.println("Lado B: " +this.ladoB);
         System.out.println("Sua área é de: " +this.calcularArea());
         System.out.println("Seu perímetro é de: " +this.calcularPerimetro());
         System.out.println("Informe o tamanho do piso:");
         int piso1 = piso.nextInt();
         System.out.println("Informe o tamanho do rodapé:");
         int rodape = piso.nextInt();
         int quantidadepiso = this.calcularArea() / piso1;
         int quantidaderodape = this.calcularPerimetro() / rodape;
         System.out.println("Será necessários " +quantidadepiso + "m\u00B2 de piso.");
         System.out.println("Será necessários " +quantidaderodape+ "m\u00B2 de rodapés.");
     }


}
