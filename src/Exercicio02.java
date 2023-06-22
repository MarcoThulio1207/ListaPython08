public class Exercicio02 {
    public static void main(String[] args) {
      Quadrado novoQuadraro = new Quadrado(10);

      System.out.println("Tamanho do lado " +novoQuadraro.retornarValorlado());

      novoQuadraro.mudarValordoLado(20);

      System.out.println("Um novo valor para o lado: " +novoQuadraro.retornarValorlado());

      double area = novoQuadraro.calcularArea();
      System.out.println("Nova àrea:" +area);

    }
}