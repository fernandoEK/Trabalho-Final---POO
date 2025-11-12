package estufa;

import java.util.List;
import cultura.Cultura;
import sensor.Sensor;

public class Relatorio {

    private String localizacao;
    private double area;
    private StatusEstufa status;
    private List<Cultura> culturas;
    private List<Sensor> sensores;
    private double mediaAmbiental;

    public Relatorio(String localizacao, double area, StatusEstufa status, List<Cultura> culturas, List<Sensor> sensores, double mediaAmbiental) {
        this.localizacao = localizacao;
        this.area = area;
        this.status = status;
        this.culturas = culturas;
        this.sensores = sensores;
        this.mediaAmbiental = mediaAmbiental;
    }

    public String gerarTexto() {
        StringBuilder sb = new StringBuilder();
        sb.append("RELATORIO DA ESTUFA\n");
        sb.append("Status: ").append(status).append("\n");
        sb.append("Localizacao: ").append(localizacao).append("\n");
        sb.append("Area: ").append(area).append(" m²\n\n");

        sb.append("Culturas:\n");
        for (Cultura c : culturas) {
            sb.append(" - ").append(c.toString()).append("\n");
        }

        sb.append("\nSensores Instalados:\n");
        for (Sensor s : sensores) {
            sb.append(" - ").append(s.getTipo()).append(": ").append(s.lerDado()).append("\n");
        }

        sb.append("\nMedia Ambiental Geral: ").append(mediaAmbiental).append("\n");

        return sb.toString();
    }
}