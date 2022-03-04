package javaPractice.arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertirArrayEnLista_option2 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>(Arrays.asList(myData()));
        System.out.println("Imprimiendo la nueva lista completa: " + myList);
        String dataRemove = myList.remove(0);
        System.out.println("El dato a remomver es: " + dataRemove);
        System.out.println("La nueva lista sin el dato es: " + myList);
    }

    static String[] myData() {
        String [] data = {"Andres", "Camilo", "Stevan", "Juan", "Liliana", "Katerine"};
        return data;
    }
}
