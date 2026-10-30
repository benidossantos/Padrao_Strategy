package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestidorTest {

    @Test
    void deveAplicarNaPoupanca() {
        Investidor investidor = new Investidor();
        investidor.aplicarPoupanca(1000.0, 12);
        assertEquals(1060.0, investidor.getSaldo(), 0.001);
    }

    @Test
    void deveAplicarNoCDB() {
        Investidor investidor = new Investidor();
        investidor.aplicarCDB(1000.0, 12);
        assertEquals(1102.0, investidor.getSaldo(), 0.001);
    }

    @Test
    void deveAplicarNoTesouroSelic() {
        Investidor investidor = new Investidor();
        investidor.aplicarTesouroSelic(1000.0, 12);
        assertEquals(1107.1, investidor.getSaldo(), 0.001);
    }

    @Test
    void deveAplicarNaLCI() {
        Investidor investidor = new Investidor();
        investidor.aplicarLCI(1000.0, 12);
        assertEquals(1108.0, investidor.getSaldo(), 0.001);
    }

    @Test
    void naoDeveAplicarNaLCIAntesDaCarencia() {
        try {
            Investidor investidor = new Investidor();
            investidor.aplicarLCI(1000.0, 2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Prazo inferior à carência da LCI", e.getMessage());
        }
    }

}
