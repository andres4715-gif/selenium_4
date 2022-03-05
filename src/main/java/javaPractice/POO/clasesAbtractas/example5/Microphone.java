package javaPractice.POO.clasesAbtractas.example5;

public class Microphone extends SoundDevices implements SoundDevicesDataInformation {

    String tradeMark;
    int model;

    boolean cable;
    String ligth = "led";


    public Microphone(String color, String material, int weight, boolean battery, boolean display, int cost, String connexion, String functionallity, String tradeMark, int model) {
        super(color, material, weight, battery, display, cost, connexion, functionallity);
        this.model = model;
        this.tradeMark = tradeMark;
    }

    @Override
    public boolean turnOn(int batteryLevel) {
        if (this.isBattery() == true && batteryLevel >= 65) {
            return true;
        } else if (cable == true) {
            return true;
        }
        return false;
    }

    @Override
    public boolean turnOnLight() {
        if (this.isDisplay() == true && ligth == "led") {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean buttonPress() {
        if (this.getFunctionallity() != "Manual") {
            return false;
        } else {
            return true;
        }
    }

    public String actionDevice(String action) {
        return action;
    }

    @Override
    public String owner(String owner) {
        return owner;
    }

    @Override
    public String serial(String serial) {
        return serial;
    }
}
