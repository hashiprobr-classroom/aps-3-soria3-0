package br.edu.insper.desagil.aps3.refugios;

public class RecintoHidraulico extends RecintoSimples {
    private int numeroRegistros;

    public RecintoHidraulico(String nome, double largura, double profundidade, int numeroRegistros) {
        super(nome, largura, profundidade);
        this.numeroRegistros = numeroRegistros;
    }

    public int getNumeroRegistros() {
        return numeroRegistros;
    }

    public void setNumeroRegistros(int numeroRegistros) {
        this.numeroRegistros = numeroRegistros;
    }
}
