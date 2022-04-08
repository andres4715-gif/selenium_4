package javaPractice.stream.filterDemo.trabajandoConObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StepDefinition {

    public static List<Usuarios> checkig() {

        List<Usuarios> youngPeople;

        List<Usuarios> user = new ArrayList<>();
        user.add(new Usuarios("Andres", "Rios", 45, "M"));
        user.add(new Usuarios("Oscar", "Quintero", 40, "M"));
        user.add(new Usuarios("Viviana", "Hernandez", 3, "F"));
        user.add(new Usuarios("Carmen", "Urrea", 12, "F"));

        youngPeople = user
                .stream()
                .filter(x -> x.getEdad() <= 30)
                .collect(Collectors.toList());

        return youngPeople;
    }
}