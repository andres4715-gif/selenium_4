package javaPractice.stream.filterDemo.trabajandoConObjetos;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        int checkResultAmount;
        List<Usuarios> namesList = StepDefinition.checkig();
        checkResultAmount = namesList.size();
        System.out.println("La lista tiene: " + checkResultAmount + " elementos");


        for (Usuarios holasss : namesList) {
            System.out.println(holasss.getNombre());
        }
    }
}
