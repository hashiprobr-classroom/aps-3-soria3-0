package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CentralTest {
    private Central central;

    @BeforeEach
    void setUp() {
        central = new Central();
    }

    @Test
    void nenhumaAvaliacaoPassageiro() {
        assertEquals(0, central.mediaPassageiro("123456789"));
    }

    @Test
    void nenhumaAvaliacaoMotorista() {
        assertEquals(0, central.mediaMotorista("987654321"));
    }

    @Test
    void avaliacoesPassageiro() {
        Passageiro passageiro = new Passageiro("123456789", "Lucas");

        Corrida c1 = new Corrida(passageiro);
        Corrida c2 = new Corrida(passageiro);
        Corrida c3 = new Corrida(passageiro);

        c1.avaliaPassageiro(1);
        c2.avaliaPassageiro(4);
        c3.avaliaPassageiro(5);

        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);

        assertEquals(3.33, central.mediaPassageiro("123456789"), 0.01);
    }

    @Test
    void avaliacoesMotorista() {
        Motorista motorista = new Motorista("999999999", "Rodrigo");

        Corrida c1 = new Corrida(new Passageiro("987654321", "Ana"));
        Corrida c2 = new Corrida(new Passageiro("123456789", "Beatriz"));

        c1.avaliaMotorista(3);
        c2.avaliaMotorista(2);

        central.adiciona(c1);
        central.adiciona(c2);

        assertEquals(2.5, central.mediaMotorista("999999999"),0.01);}
}
