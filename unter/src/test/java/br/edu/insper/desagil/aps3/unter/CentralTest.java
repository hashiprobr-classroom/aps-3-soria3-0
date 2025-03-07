import static org.junit.jupiter.api.Assertions.assertEquals;

class CentralTest {
    @Test
    void nenhumaAvaliacaoPassageiro() {
        Central central = new Central();
        assertEquals(0, central.mediaPassageiro("123456789"));
    }

    @Test
    void nenhumaAvaliacaoMotorista() {
        Central central = new Central();
        assertEquals(0, central.mediaMotorista("987654321"));
    }

    @Test
    void avaliacoesPassageiro() {
        Central central = new Central();
        Passageiro p1 = new Passageiro("123456789", "Joao");
        Passageiro p2 = new Passageiro("987654321", "Carlos");
        Corrida c1 = new Corrida(p1);
        Corrida c2 = new Corrida(p1);
        Corrida c3 = new Corrida(p1);
        Corrida c4 = new Corrida(p2);

        c1.setNotaPassageiro(0);
        c2.setNotaPassageiro(4);
        c3.setNotaPassageiro(5);
        c4.setNotaPassageiro(3);

        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);

        assertEquals(4.5, central.mediaPassageiro("123456789"));
    }

    @Test
    void avaliacoesMotorista() {
        Central central = new Central();
        Motorista m1 = new Motorista("123456789", "Joao");
        Motorista m2 = new Motorista("987654321", "Carlos");
        Corrida c1 = new Corrida(new Passageiro("111111111", "Alice"));
        Corrida c2 = new Corrida(new Passageiro("222222222", "Bob"));
        Corrida c3 = new Corrida(new Passageiro("333333333", "Charlie"));
        Corrida c4 = new Corrida(new Passageiro("444444444", "David"));
        Corrida c5 = new Corrida(new Passageiro("555555555", "Eva"));

        c1.setMotorista(m1);
        c2.setMotorista(m1);
        c3.setMotorista(m1);
        c4.setMotorista(m2);

        c1.setNotaMotorista(0);
        c2.setNotaMotorista(2);
        c3.setNotaMotorista(3);
        c4.setNotaMotorista(1);
        c5.setNotaMotorista(1);

        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);
        central.adiciona(c5);

        assertEquals(2.5, central.mediaMotorista("123456789"));
    }
}
