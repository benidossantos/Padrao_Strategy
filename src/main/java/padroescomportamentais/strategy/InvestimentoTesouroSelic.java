package padroescomportamentais.strategy;

public class InvestimentoTesouroSelic implements Investimento {

    private static final double TAXA_MENSAL = 0.0105;
    private static final double IMPOSTO_RENDA = 0.15;

    public double calcular(double capital, int meses) {
        double rendimentoBruto = capital * TAXA_MENSAL * meses;
        return capital + rendimentoBruto * (1 - IMPOSTO_RENDA);
    }
}
