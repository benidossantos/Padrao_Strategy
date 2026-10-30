package padroescomportamentais.strategy;

public class InvestimentoPoupanca implements Investimento {

    private static final double TAXA_MENSAL = 0.005;

    public double calcular(double capital, int meses) {
        return capital + capital * TAXA_MENSAL * meses;
    }
}
