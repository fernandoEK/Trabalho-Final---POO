package sensor;

public abstract class Sensor {
    private int id;
    private String tipo;

    public Sensor(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double lerDado();
}
