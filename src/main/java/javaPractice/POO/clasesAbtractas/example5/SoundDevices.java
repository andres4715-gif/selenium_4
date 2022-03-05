package javaPractice.POO.clasesAbtractas.example5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class SoundDevices {

    private String color;
    private String material;
    private int weight;
    private boolean battery;
    private boolean display;
    private int cost;
    private String connexion;
    private String functionallity;

    public SoundDevices(String color, String material, int weight, boolean battery, boolean display, int cost, String connexion,String functionallity) {
        this.color = color;
        this.material = material;
        this.weight = weight;
        this.battery = battery;
        this.display = display;
        this.cost = cost;
        this.connexion = connexion;
        this.functionallity = functionallity;
    }

    public abstract boolean turnOn(int batteryLevel);

    public abstract boolean turnOnLight();

    public abstract boolean buttonPress();
}

// en la interface
// dimenciones de empaque
// dueño


