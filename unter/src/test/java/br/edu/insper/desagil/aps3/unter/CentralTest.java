import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
        Corrida c1 = mock(Corrida.class);
        Corrida c2 = mock(Corrida.class);
        Corrida c3 = mock(Corrida.class);
        Corrida c4 = mock(Corrida.class);

        when(c1.getPassageiroCpf()).thenReturn("123456789");
        when(c2.getPassageiroCpf()).thenReturn("123456789");
        when(c3.getPassageiroCpf()).thenReturn("123456789");
        when(c4.getPassageiroCpf()).thenReturn("987654321");

        when(c1.getNotaPassageiro()).thenReturn(1);
        when(c2.getNotaPassageiro()).thenReturn(4);
        when(c3.getNotaPassageiro()).thenReturn(5);
        when(c4.getNotaPassageiro()).thenReturn(3);

        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);

        assertEquals(3.33, central.mediaPassageiro("123456789"), 0.01);
    }

    @Test
    void avaliacoesMotorista() {
        Corrida c1 = mock(Corrida.class);
        Corrida c2 = mock(Corrida.class);
        Corrida c3 = mock(Corrida.class);
        Corrida c4 = mock(Corrida.class);
        Corrida c5 = mock(Corrida.class);

        when(c1.getMotoristaCpf()).thenReturn("123456789");
        when(c2.getMotoristaCpf()).thenReturn("123456789");
        when(c3.getMotoristaCpf()).thenReturn("123456789");
        when(c4.getMotoristaCpf()).thenReturn("987654321");
        when(c5.getMotoristaCpf()).thenReturn("987654321");

        when(c1.getNotaMotorista()).thenReturn(0);
        when(c2.getNotaMotorista()).thenReturn(2);
        when(c3.getNotaMotorista()).thenReturn(3);
        when(c4.getNotaMotorista()).thenReturn(1);
        when(c5.getNotaMotorista()).thenReturn(1);

        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);
        central.adiciona(c5);

        assertEquals(1.67, central.mediaMotorista("987654321"), 0.01);
    }
}
