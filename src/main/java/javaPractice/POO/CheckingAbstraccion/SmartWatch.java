package javaPractice.POO.CheckingAbstraccion;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class SmartWatch {

    private String color;
    private int tamanio;
    private int peso;
    private String display;
    private boolean botonesFisicos;
    private String tipoManilla;


    public SmartWatch(String color, int tamanio, int peso, String display, boolean botonesFisicos, String tipoManilla) {
        this.color = color;
        this.tamanio = tamanio;
        this.peso = peso;
        this.display = display;
        this.botonesFisicos = botonesFisicos;
        this.tipoManilla = tipoManilla;
    }


    public abstract boolean encenderDisplay(boolean tocarPantalla);

    public abstract boolean apagarDisplay();

    public abstract void mostrarMenu();

    public String escogerManilla() {
        return selectManilla();
    }

    private String selectManilla() {
        String relogCostoso = "cuero";
        String relogBarato = "pasta";
        if (this.getTamanio() > 5 && this.getPeso() > 5) {
            return relogCostoso;
        } else {
            return relogBarato;
        }
    }
}

