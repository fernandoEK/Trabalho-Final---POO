package sensor;

public class SensorIrrigacao extends Sensor {
    private double valorAtual;

    public SensorIrrigacao(int id, double valorInicial) {
        super(id, "Irrigacao");
        this.valorAtual = valorInicial;
    }

    public double lerDado() {
        return valorAtual;
    }

    public void atualizarValor(double novoValor) {
        this.valorAtual = novoValor;
    }
}