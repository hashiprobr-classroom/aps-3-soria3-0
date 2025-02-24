package br.edu.insper.desagil.aps3.refugios;

import java.util.List;

public class Unidade {
    private List<Recinto> recintos;

    public Unidade(List<Recinto> recintos) {
        this.recintos = recintos;
    }

    public List<Recinto> getRecintos() {
        return recintos;
    }

    public void setRecintos(List<Recinto> recintos) {
        this.recintos = recintos;
    }

    public double areaTotal() {
        double s = 0;
        for (Recinto recinto : recintos) {
            s += recinto.area();
        }
        return s;
    }
}
