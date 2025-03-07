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
        verify(corridaMock).setNotaMotorista(3);
    }

    @Test
    void avaliaBaixo() {
        passageiro.avalia(corridaMock, 0);
        verify(corridaMock).setNotaMotorista(1);
    }

    @Test
    void avaliaAlto() {
        passageiro.avalia(corridaMock, 6);
        verify(corridaMock).setNotaMotorista(5);
    }
}
