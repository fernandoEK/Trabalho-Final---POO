package estufa;

import java.util.ArrayList;
import java.util.List;
import cultura.Cultura;
import sensor.Sensor;

public class Estufa {

    private int id;
    private String localizacao;
    private double area;
    private StatusEstufa status;
    private List<Cultura> culturas;
    private List<Sensor> sensores;

    public Estufa(int id, String localizacao, double area, StatusEstufa status) {
        this.id = id;
        this.localizacao = localizacao;
        this.area = area;
        this.status = status;
        this.culturas = new ArrayList<>();
        this.sensores = new ArrayList<>();
    }

    public void cadastrarCultura(Cultura cultura) {
        culturas.add(cultura);
    }

    public void removerCultura(Cultura cultura) {
        culturas.remove(cultura);
    }

    public void cadastrarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public double calcularMediasAmbientais() {
        if (sensores.isEmpty()) return 0;
        double soma = 0;
        for (Sensor s : sensores) {
            soma += s.lerDado();
        }
        return soma / sensores.size();
    }
}
