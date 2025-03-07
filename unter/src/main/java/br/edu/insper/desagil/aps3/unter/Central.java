package br.edu.insper.desagil.aps3.unter;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Central {

    private List<Corrida> corridas;

    public Central() {
        this.corridas = new ArrayList<>();
    }

    // separei a função para chamar a media nos outros métodos
    private double mediaArray(List<Integer> array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return (double) soma / array.size();
    }

    public double mediaPassageiro(String cpfPassageiro) {
        List<Integer> avaliacoes = new ArrayList<>();
        for (Corrida corrida : corridas) {

            String cpf = corrida.getPassageiro().getCpf();
            int nota = corrida.getNotaPassageiro();
            if (cpf.equals(cpfPassageiro) && nota != 0) {
                avaliacoes.add(nota);
            }
        }
        return mediaArray(avaliacoes);
    }

    public double mediaMotorista(String cpfMotorista) {
        List<Integer> avaliacoes = new ArrayList<>();
        for (Corrida corrida : corridas) {

            String cpf = corrida.getMotorista().getCpf();
            int nota = corrida.getNotaMotorista();
            if (cpf.equals(cpfMotorista) && nota != 0) {
                avaliacoes.add(nota);
            }
        }
        return mediaArray(avaliacoes);
   }

   public void adiciona(Corrida corrida) {
        corridas.add(corrida);
   }
}
