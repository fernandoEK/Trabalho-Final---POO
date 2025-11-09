public class Irrigador implements Controlavel {
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
