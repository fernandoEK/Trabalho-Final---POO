package sensor;

public class SensorUmidade extends Sensor {
    private double valorAtual;

    public SensorUmidade(int id, double valorInicial) {
        super(id, "Umidade");
        this.valorAtual = valorInicial;
    }

    public double lerDado() {
        return valorAtual;
    }

    public void atualizarValor(double novoValor) {
        this.valorAtual = novoValor;
    }
}