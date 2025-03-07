package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class PassageiroTest {
    private Passageiro passageiro;
    private Corrida corrida;

    @BeforeEach
    void setUp() {
        passageiro = new Passageiro("101112131", "Fernando");

        corrida = new Corrida(passageiro);
    }

    @Test
    void constroi() {
        assertEquals("101112131", passageiro.getCpf());
        assertEquals("Fernando", passageiro.getNome());
    }

    @Test
    void mudaNome() {
        passageiro.setNome("Carlos");
        assertEquals("Carlos", passageiro.getNome());
    }

    @Test
    void avalia() {
        passageiro.avalia(corrida, 3);
        assertEquals(3, corrida.getNotaMotorista());
    }

    @Test
    void avaliaBaixo() {
        passageiro.avalia(corrida, 0);
        assertEquals(1, corrida.getNotaMotorista());
    }

    @Test
    void avaliaAlto() {
        passageiro.avalia(corrida, 6);
        assertEquals(5, corrida.getNotaMotorista());
    }
}
