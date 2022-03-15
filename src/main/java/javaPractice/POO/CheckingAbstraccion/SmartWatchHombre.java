package javaPractice.POO.CheckingAbstraccion;

public class SmartWatchHombre extends SmartWatch {

    public String tipoDisplay;
    public String poteccionDisplay;

    public SmartWatchHombre(String color, int tamanio, int peso, String display, boolean botonesFisicos, String tipoManilla, String tipoDisplay, String poteccionDisplay) {
        super(color, tamanio, peso, display, botonesFisicos, tipoManilla);
        this.tipoDisplay = tipoDisplay;
        this.poteccionDisplay = poteccionDisplay;
    }

    @Override
    public boolean encenderDisplay(boolean tocarPantalla) {
        boolean checking = tocarPantallaTouch(tocarPantalla);
        if (checking) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean apagarDisplay() {
        return false;
    }

    @Override
    public void mostrarMenu() {

    }

    public boolean tocarPantallaTouch(boolean tocar) {
        if (tocar) {
            return true;
        } else {
            return false;
        }
    }
}
