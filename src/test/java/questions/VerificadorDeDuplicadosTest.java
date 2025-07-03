package questions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VerificadorDeDuplicadosTest {

    // Instancie sua classe aqui quando criá-la
    private final VerificadorDeDuplicados verificador = new VerificadorDeDuplicados();

    @Test
    @DisplayName("Deve retornar true para sequência com duplicados no meio")
    void deveRetornarTrueParaSequenciaComDuplicados() {
        String[] sequencia = { "a", "b", "c", "a" };
        assertTrue(verificador.contemDuplicados(sequencia));
    }

    @Test
    @DisplayName("Deve retornar false para sequência sem duplicados")
    void deveRetornarFalseParaSequenciaSemDuplicados() {
        String[] sequencia = { "x", "y", "z", "w" };
        assertFalse(verificador.contemDuplicados(sequencia));
    }

    @Test
    @DisplayName("Deve retornar false para sequência vazia")
    void deveRetornarFalseParaSequenciaVazia() {
        String[] sequencia = {};
        assertFalse(verificador.contemDuplicados(sequencia));
    }

    @Test
    @DisplayName("Deve retornar false para sequência com um único elemento")
    void deveRetornarFalseParaSequenciaComUmElemento() {
        String[] sequencia = { "unico" };
        assertFalse(verificador.contemDuplicados(sequencia));
    }

    @Test
    @DisplayName("Deve retornar true para sequência com todos os elementos iguais")
    void deveRetornarTrueParaTodosElementosIguais() {
        String[] sequencia = { "5", "5", "5", "5" };
        assertTrue(verificador.contemDuplicados(sequencia));
    }

    @Test
    @DisplayName("Deve retornar false para uma entrada nula (null)")
    void deveRetornarFalseParaSequenciaNula() {
        assertFalse(verificador.contemDuplicados(null));
    }

    @Test
    @DisplayName("Deve detectar duplicado quando os elementos são números em formato string")
    void deveDetectarDuplicadosComNumeros() {
        String[] sequencia = { "10", "20", "30", "10" };
        assertTrue(verificador.contemDuplicados(sequencia));
    }

    @Test
    @DisplayName("Deve detectar duplicados no início e no fim da sequência")
    void deveDetectarDuplicadosNasExtremidades() {
        String[] sequencia = { "start", "middle", "end", "start" };
        assertTrue(verificador.contemDuplicados(sequencia));
    }
}