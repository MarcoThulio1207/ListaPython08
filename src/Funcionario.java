public class Funcionario {
    String nome;
    double saralio;
    double salarioNovo;

    public Funcionario(String nome, double saralio, double salarioNovo){
        this.nome = nome;
        this.saralio = saralio;
       this.salarioNovo = saralio * 0.10;


    }

    public String getnome() {
        return this.nome;
    }

    public double getSaralio(){
        return this.saralio;
    }

    public void aumentarSalario(double porcentualDeAumento) {
        double aumento = this.saralio * (porcentualDeAumento / 100);
        this.saralio += aumento;
    }


}

