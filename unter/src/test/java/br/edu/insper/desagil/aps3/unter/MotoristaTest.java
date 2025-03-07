import static org.junit.jupiter.api.Assertions.assertEquals;

class MotoristaTest {
    @Test
    void constroi() {
        Motorista m = new Motorista("987654321", "Carlos");
        assertEquals("987654321", m.getCpf());
        assertEquals("Carlos", m.getNome());
    }

    @Test
    void mudaNome() {
        Motorista m = new Motorista("987654321", "Carlos");
        m.setNome("Pedro");
        assertEquals("Pedro", m.getNome());
    }

    @Test
    void avalia() {
        Motorista m = new Motorista("987654321", "Carlos");
        Corrida c = new Corrida(new Passageiro("123456789", "Joao"));
        m.avalia(c, 3);
        assertEquals(3, c.getNotaPassageiro());
    }

    @Test
    void avaliaBaixo() {
        Motorista m = new Motorista("987654321", "Carlos");
        Corrida c = new Corrida(new Passageiro("123456789", "Joao"));
        m.avalia(c, 0);
        assertEquals(1, c.getNotaPassageiro());
    }

    @Test
    void avaliaAlto() {
        Motorista m = new Motorista("987654321", "Carlos");
        Corrida c = new Corrida(new Passageiro("123456789", "Joao"));
        m.avalia(c, 6);
        assertEquals(5, c.getNotaPassageiro());
    }
}