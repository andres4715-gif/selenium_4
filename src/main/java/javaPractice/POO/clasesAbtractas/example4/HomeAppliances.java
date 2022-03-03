package javaPractice.POO.clasesAbtractas.example4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class HomeAppliances {

    private int energyStatus;
    private boolean status;

    public HomeAppliances(int energyStatus, boolean status) {
        this.energyStatus = energyStatus;
        this.status = status;
    }

    abstract boolean conected();

    abstract boolean working();

    abstract String action();
}
