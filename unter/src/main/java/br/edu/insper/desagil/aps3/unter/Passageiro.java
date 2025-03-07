package br.edu.insper.desagil.aps3.unter;

public class Passageiro extends Usuario{

    public Passageiro(String cpf, String nome) {
        super(cpf, nome);
    }

    public void avalia(Corrida corrida, int nota) {
        corrida.avaliaMotorista(nota);
    }
}