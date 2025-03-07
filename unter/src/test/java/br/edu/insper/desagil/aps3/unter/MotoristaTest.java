package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MotoristaTest {
    private Motorista motorista;
    private Corrida corridaMock;

    @BeforeEach
    void setUp() {
        motorista = new Motorista("987654321", "Carlos");
        corridaMock = mock(Corrida.class);
    }

    @Test
    void constroi() {
        assertEquals("987654321", motorista.getCpf());
        assertEquals("Carlos", motorista.getNome());
    }

    @Test
    void mudaNome() {
        motorista.setNome("Pedro");
        assertEquals("Pedro", motorista.getNome());
    }

    @Test
    void avalia() {
        motorista.avalia(corridaMock, 3);
        assertEquals(3, corridaMock.getNotaPassageiro());
    }

    @Test
    void avaliaBaixo() {
        motorista.avalia(corridaMock, 0);
        assertEquals(1, corridaMock.getNotaPassageiro());
    }

    @Test
    void avaliaAlto() {
        motorista.avalia(corridaMock, 6);
        assertEquals(5, corridaMock.getNotaPassageiro());
    }
}
