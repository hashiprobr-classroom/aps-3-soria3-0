package br.edu.insper.desagil.aps3.refugios;

public class RecintoSimples extends Recinto {
    private double largura;
    private double profundidade;

    public RecintoSimples(String nome, double largura, double profundidade) {
        super(nome);
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    @Override
    public double area() {
        return largura * profundidade;
    }
}
