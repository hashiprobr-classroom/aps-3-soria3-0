package br.edu.insper.desagil.aps3.unter;

public class Corrida {

    private Passageiro passageiro;
    private Motorista motorista;
    private int notaPassageiro;
    private int notaMotorista;

    public Corrida(Passageiro passageiro) {
        this.passageiro = passageiro;
        this.motorista = null;
        this.notaPassageiro = 0;
        this.notaMotorista = 0;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public int getNotaPassageiro() {
        return notaPassageiro;
    }

    public int getNotaMotorista() {
        return notaMotorista;
    }

    private static int notaTruncada(int nota) {
        if (nota < 1) {
            return 1;
        } else if (nota > 5) {
            return 5;
        } else {
            return nota;
        }
    }

    public void avaliaPassageiro(int valor) {
        this.notaPassageiro = notaTruncada(valor);
    }

    public void avaliaMotorista(int valor) {
        this.notaMotorista = notaTruncada(valor);
    }
}
