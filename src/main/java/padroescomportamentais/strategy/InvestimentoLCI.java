package padroescomportamentais.strategy;

public class InvestimentoLCI implements Investimento {

    private static final double TAXA_MENSAL = 0.009;
    private static final int CARENCIA_MESES = 3;

    public double calcular(double capital, int meses) {
        if (meses < CARENCIA_MESES) {
            throw new IllegalArgumentException("Prazo inferior à carência da LCI");
        }
        else {
            return capital + capital * TAXA_MENSAL * meses;
        }
    }
}
