public class Tv {
private int numeroCanal;
private int volume;


public Tv(){
    this.numeroCanal = 1;
    this.volume = 50;
}

public void mudarCanal (int novoCanal) {
    if (novoCanal >= 1 && novoCanal <= 100) {
        this.numeroCanal = novoCanal;
        System.out.println("Você mudou para o canal: " + numeroCanal);
    } else {
        System.out.println("Canal inválido.");
    }
}

public void aumentoVolume(){
        if (this.volume < 100){
            this.volume++;
            System.out.println("Volume aumentado para "+this.volume);
        } else {
            System.out.println("Volume Máximo.");
        }
    }

public void diminuirVolume(){
        if (this.volume > 0){
            this.volume --;
            System.out.println("Volume diminuido para "+this.volume);
        } else {
            System.out.println("Mudo.");
        }
    }





}





