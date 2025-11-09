package sensor;

public class SensorTemperatura extends Sensor {
    private double valorAtual;

    public SensorTemperatura(int id, double valorInicial) {
        super(id, "Temperatura");
        this.valorAtual = valorInicial;
    }

    public double lerDado() {
        return valorAtual;
    }

    public void atualizarValor(double novoValor) {
        this.valorAtual = novoValor;
    }
}
