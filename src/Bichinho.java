import java.util.Scanner;
public class Bichinho {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Bichinho(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void alimentar(int quantidadeComida) {
        this.fome -= quantidadeComida;
        if (this.fome < 0) {
            this.fome = 0;
        }
    }

    public void brincar(int tempoBrincadeira) {
        this.saude += tempoBrincadeira;
        if (this.saude > 10) {
            this.saude = 10;
        }
    }

    public void alterarIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public String retornarNome() {
        return this.nome;
    }

    public int retornarFome() {
        return this.fome;
    }

    public int retornarSaude() {
        return this.saude;
    }

    public int retornarIdade() {
        return this.idade;
    }

    public String retornarHumor() {
        if (this.fome <= 5 && this.saude >= 8) {
            return "Feliz";
        } else if (this.fome > 5 && this.saude < 8) {
            return "Triste";
        } else {
            return "Neutro";
        }
    }

    public String str() {
        return "Nome: " + this.nome + "\nFome: " + this.fome + "\nSaúde: " + this.saude + "\nIdade: " + this.idade;
    }
}

