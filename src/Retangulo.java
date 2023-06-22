class Retangulo {
    private Ponto vertice;
    private int largura;
    private int altura;

    public Retangulo(Ponto vertice, int largura, int altura) {
        this.vertice = vertice;
        this.largura = largura;
        this.altura = altura;
    }
    public Ponto encontrarCentro() {
        int centroX = this.vertice.getX() + this.largura / 2;
        int centroY = this.vertice.getY() + this.altura / 2;
        return new Ponto(centroX, centroY);
    }

    public void alterarValores(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
}
