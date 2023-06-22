import java.util.Scanner;
public class BombaCombustivel {

        private String tipoCombustivel;
        private double valorLitro;
        private double quantidadeCombustivel;

        public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
            this.tipoCombustivel = tipoCombustivel;
            this.valorLitro = valorLitro;
            this.quantidadeCombustivel = quantidadeCombustivel;
        }

        public void abastecerPorValor(double valor) {
            double litrosAbastecidos = valor / this.valorLitro;
            if (litrosAbastecidos <= this.quantidadeCombustivel) {
                this.quantidadeCombustivel -= litrosAbastecidos;
                System.out.println("Abastecimento concluído. Litros abastecidos: " + litrosAbastecidos);
            } else {
                System.out.println("Quantidade de combustível insuficiente na bomba.");
            }
        }

        public void abastecerPorLitro(double litros) {
            double valorPago = litros * this.valorLitro;
            if (litros <= this.quantidadeCombustivel) {
                this.quantidadeCombustivel -= litros;
                System.out.println("Abastecimento concluído. Valor a ser pago: " + valorPago);
            } else {
                System.out.println("Quantidade de combustível insuficiente na bomba.");
            }
        }

        public void alterarValor(double novoValor) {
            this.valorLitro = novoValor;
        }

        public void alterarCombustivel(String novoCombustivel) {
            this.tipoCombustivel = novoCombustivel;
        }

        public void alterarQuantidadeCombustivel(double novaQuantidade) {
            this.quantidadeCombustivel = novaQuantidade;
        }
    }

