public class Investimento {
    private double saldo;
    private double taxaJuros;

    public Investimento(double saldoInicial, double taxaJuros) {
        this.saldo = saldoInicial;
        this.taxaJuros = taxaJuros;
    }

    public void adicioneJuros() {
        double juros = this.saldo * (this.taxaJuros / 100);
        this.saldo += juros;
    }

    public double getSaldo() {
        return this.saldo;
    }
}


