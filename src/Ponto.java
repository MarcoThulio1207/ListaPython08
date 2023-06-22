import java.util.Scanner;

class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimir() {
        System.out.println("Ponto: (" + this.x + ", " + this.y + ")");
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}