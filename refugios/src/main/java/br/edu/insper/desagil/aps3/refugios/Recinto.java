package br.edu.insper.desagil.aps3.refugios;

public abstract class Recinto {
    private String nome;

    public Recinto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double area();
}
