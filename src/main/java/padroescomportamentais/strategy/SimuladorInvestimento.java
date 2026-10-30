package padroescomportamentais.strategy;

public class SimuladorInvestimento {

    private double capital;
    private int meses;

    public SimuladorInvestimento(double capital, int meses) {
        this.capital = capital;
        this.meses = meses;
    }

    public double simular(Investimento investimento) {
        return investimento.calcular(capital, meses);
    }
}
