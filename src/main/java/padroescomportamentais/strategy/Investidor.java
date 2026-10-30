package padroescomportamentais.strategy;

public class Investidor {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void aplicarPoupanca(double capital, int meses) {
        SimuladorInvestimento simulador = new SimuladorInvestimento(capital, meses);
        this.saldo = simulador.simular(new InvestimentoPoupanca());
    }

    public void aplicarCDB(double capital, int meses) {
        SimuladorInvestimento simulador = new SimuladorInvestimento(capital, meses);
        this.saldo = simulador.simular(new InvestimentoCDB());
    }

    public void aplicarTesouroSelic(double capital, int meses) {
        SimuladorInvestimento simulador = new SimuladorInvestimento(capital, meses);
        this.saldo = simulador.simular(new InvestimentoTesouroSelic());
    }

    public void aplicarLCI(double capital, int meses) {
        SimuladorInvestimento simulador = new SimuladorInvestimento(capital, meses);
        this.saldo = simulador.simular(new InvestimentoLCI());
    }

}
