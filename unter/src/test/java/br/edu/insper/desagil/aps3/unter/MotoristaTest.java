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
        verify(corridaMock).setNotaPassageiro(3);
    }

    @Test
    void avaliaBaixo() {
        motorista.avalia(corridaMock, 0);
        verify(corridaMock).setNotaPassageiro(1);
    }

    @Test
    void avaliaAlto() {
        motorista.avalia(corridaMock, 6);
        verify(corridaMock).setNotaPassageiro(5);
    }
}
