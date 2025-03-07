package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class MotoristaTest {
    private Motorista motorista;
    private Corrida corrida;
    private Passageiro passageiro;

    @BeforeEach
    void setUp() {
        motorista = new Motorista("987654321", "Carlos");
        passageiro = new Passageiro("123456789", "João");

        // cria uma instancia real de corrida com passageiro
        corrida = new Corrida(passageiro);
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
        motorista.avalia(corrida, 3);
        assertEquals(3, corrida.getNotaPassageiro());
    }

    @Test
    void avaliaBaixo() {
        motorista.avalia(corrida, 0);
        assertEquals(1, corrida.getNotaPassageiro());
    }

    @Test
    void avaliaAlto() {
        motorista.avalia(corrida, 6);
        assertEquals(5, corrida.getNotaPassageiro());
    }
}
