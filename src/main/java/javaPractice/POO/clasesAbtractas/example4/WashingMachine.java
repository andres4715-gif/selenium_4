package javaPractice.POO.clasesAbtractas.example4;

public class WashingMachine extends HomeAppliances implements HomeAppliancesCommercialData {

    String tradeMark;
    int model;
    String action = "wash clothes";

    public WashingMachine (int energyStatus, boolean status, String tradeMark, int model) {
        super(energyStatus, status);
        this.tradeMark = tradeMark;
        this.model = model;
    }

    @Override
    boolean conected() {
        if (this.getEnergyStatus() < 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    boolean working() {
        if (this.isStatus()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    String action() {
        return action;
    }

    @Override
    public String serial(String serial) {
        return serial;
    }

    @Override
    public String code(String code) {
        return code;
    }

    boolean showTime(int show) {
        if(show == 0) {
            return false;
        } else {
            return true;
        }
    }
}
