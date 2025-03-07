package br.edu.insper.desagil.aps3.unter;

public class Motorista extends Usuario {

    public Motorista(String cpf, String nome) {
        super(cpf, nome);
    }

    public void avalia(Corrida corrida, int nota) {
        corrida.avaliaPassageiro(nota);
    }
}
