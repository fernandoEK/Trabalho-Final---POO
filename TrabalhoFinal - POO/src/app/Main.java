package app;

import estufa.Estufa;
import estufa.StatusEstufa;
import estufa.Relatorio;
import cultura.Cultura;
import cultura.FaseCultura;
import sensor.SensorTemperatura;
import sensor.SensorUmidade;
import sensor.SensorLuminosidade;
import sensor.SensorIrrigacao;

public class Main {
    public static void main(String[] args) {

        Estufa estufa = new Estufa(1, "Setor Agrícola - Bloco 3", 120.5, StatusEstufa.ATIVA);

        estufa.cadastrarCultura(new Cultura(101, "Tomate", FaseCultura.CRESCIMENTO, 1.2, 300));
        estufa.cadastrarCultura(new Cultura(102, "Alface", FaseCultura.DESENVOLVIMENTO, 0.8, 120));

        estufa.cadastrarSensor(new SensorTemperatura(1, 27.5));
        estufa.cadastrarSensor(new SensorUmidade(2, 65.0));
        estufa.cadastrarSensor(new SensorLuminosidade(3, 550.0));
        estufa.cadastrarSensor(new SensorIrrigacao(4, 40.0));

        Relatorio relatorio = estufa.criarRelatorio();

        System.out.println(relatorio.gerarTexto());
    }
}
