import java.util.Scanner;
public class Carro {
    private double consumo;
    private double combustivel;

    public Carro(double consumo) {
        this.consumo = consumo;
        this.combustivel = 0;
    }

    public void andar(double distancia) {
        double consumoAtual = distancia / this.consumo;
        if (consumoAtual <= this.combustivel) {
            this.combustivel -= consumoAtual;
            System.out.println("O carro percorreu " + distancia + " km.");
        } else {
            System.out.println("Combustível insuficiente. Abasteça o carro.");
        }
    }

    public double obterGasolina() {
        return this.combustivel;
    }

    public void adicionarGasolina(double quantidade) {
        this.combustivel += quantidade;
        System.out.println("Abastecimento concluído. Nova quantidade de combustível: " + this.combustivel);
    }
}

