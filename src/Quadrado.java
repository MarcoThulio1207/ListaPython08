public class Quadrado {
    private double tamanhodoLado;

    public Quadrado (double tamanhodoLado){
        this.tamanhodoLado = tamanhodoLado;
    }

    void mudarValordoLado (double ladoNovo){
       this.tamanhodoLado = ladoNovo;
    }

    double retornarValorlado (){
        return this.tamanhodoLado;
    }

    double calcularArea(){
        return this.tamanhodoLado * this.tamanhodoLado;
    }


}
