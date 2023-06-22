import java.util.Scanner;
public class Tamagushi {
    private String nome;
    int idade;
    int fome;
    int saude;

public Tamagushi (String nome, int idade, int fome, int saude){
    this.nome = nome;
    this.idade = idade;
    this.fome = fome;
    this.saude = saude;
}

public void trocarNome (String novoNome){
    this.nome = novoNome;
}
public void trocaFome (int novaFome){
    this.fome = novaFome;
}
public void trocaSaude (int novaSaude){
    this.saude = novaSaude;
}
public void trocaIdade (int novaIdade){
    this.idade = novaIdade;
}
public String getNome(){
return this.nome;
}
public int getIdade(){
return this.idade;
}
public int getFome (){
return this.fome;
}
public int getSaude (){
    return this.saude;
}

    public String getHumor() {
        if (this.fome <= 5 && this.saude >= 8) {
            return "Feliz";
        } else if (this.fome > 5 && this.saude >= 8) {
            return "Com fome";
        } else if (this.fome <= 5 && this.saude < 8) {
            return "Doente";
        } else {
            return "Triste";
        }
    }






}
