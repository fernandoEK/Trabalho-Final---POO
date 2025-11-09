package sensor;

public class SensorLuminosidade extends Sensor {
    private double valorAtual;

    public SensorLuminosidade(int id, double valorInicial) {
        super(id, "Luminosidade");
        this.valorAtual = valorInicial;
    }

    public double lerDado() {
        return valorAtual;
    }

    public void atualizarValor(double novoValor) {
        this.valorAtual = novoValor;
    }
}