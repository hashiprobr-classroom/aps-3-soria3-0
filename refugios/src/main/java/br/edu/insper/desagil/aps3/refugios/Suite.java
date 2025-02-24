package br.edu.insper.desagil.aps3.refugios;

public class Suite extends Recinto {
    private RecintoSimples quarto;
    private Banheiro banheiro;

    public Suite(String nome, RecintoSimples quarto, Banheiro banheiro) {
        super(nome);
        this.quarto = quarto;
        this.banheiro = banheiro;
    }

    public RecintoSimples getQuarto() {
        return quarto;
    }

    public Banheiro getBanheiro() {
        return banheiro;
    }

    @Override
    public double area() {
        return quarto.area() + banheiro.area();
    }
}
