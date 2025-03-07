package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PassageiroTest {
    private Passageiro passageiro;
    private Corrida corridaMock;

    @BeforeEach
    void setUp() {
        passageiro = new Passageiro("101112131", "Fernando");
        corridaMock = mock(Corrida.class);
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
        passageiro.avalia(corridaMock, 3);
        assertEquals(3, corridaMock.getNotaMotorista());
    }

    @Test
    void avaliaBaixo() {
        passageiro.avalia(corridaMock, 0);
        assertEquals(1, corridaMock.getNotaMotorista());

    }

    @Test
    void avaliaAlto() {
        passageiro.avalia(corridaMock, 6);
        assertEquals(5, corridaMock.getNotaMotorista());

    }
}
