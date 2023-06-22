import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Fazenda {
    private List<Bichinho> bichinhos;

    public Fazenda() {
        bichinhos = new ArrayList<>();
    }

    public void adicionarBichinho(Bichinho bichinho) {
        bichinhos.add(bichinho);
    }

    public void alimentarTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.alimentar();
        }
        System.out.println("Todos os bichinhos foram alimentados.");
    }

    public void brincarTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.brincar();
        }
        System.out.println("Todos os bichinhos brincaram.");
    }

    public void ouvirTodos() {
        for (Bichinho bichinho : bichinhos) {
            System.out.println("Nome: " + bichinho.retornarNome());
            System.out.println("Fome: " + bichinho.retornarFome());
            System.out.println("Saúde: " + bichinho.retornarSaude());
            System.out.println("Idade: " + bichinho.retornarIdade());
            System.out.println("Humor: " + bichinho.retornarHumor());
            System.out.println("-------------------------");
        }
    }
}

