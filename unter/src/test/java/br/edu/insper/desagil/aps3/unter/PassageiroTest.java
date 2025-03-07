import static org.junit.jupiter.api.Assertions.assertEquals;

class PassageiroTest {
    @Test
    void constroi() {
        Passageiro p = new Passageiro("101112131", "Fernando");
        assertEquals("101112131", p.getCpf());
        assertEquals("Fernando", p.getNome());
    }

    @Test
    void mudaNome() {
        Passageiro p = new Passageiro("101112131", "Fernando");
        p.setNome("Carlos");
        assertEquals("Carlos", p.getNome());
    }

    @Test
    void avalia() {
        Passageiro p = new Passageiro("101112131", "Fernando");
        Corrida c = new Corrida(p);
        p.avalia(c, 3);
        assertEquals(3, c.getNotaMotorista());
    }

    @Test
    void avaliaBaixo() {
        Passageiro p = new Passageiro("101112131", "Fernando");
        Corrida c = new Corrida(p);
        p.avalia(c, 0);
        assertEquals(1, c.getNotaMotorista());
    }

    @Test
    void avaliaAlto() {
        Passageiro p = new Passageiro("101112131", "Fernando");
        Corrida c = new Corrida(p);
        p.avalia(c, 6);
        assertEquals(5, c.getNotaMotorista());
    }
}
