package dispositivo;

public class Ventilador implements Controlavel {
    private boolean ligado;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public boolean verificarStatus() {
        return ligado;
    }
}
