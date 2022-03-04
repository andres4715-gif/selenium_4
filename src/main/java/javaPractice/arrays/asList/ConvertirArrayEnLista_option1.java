package javaPractice.arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class ConvertirArrayEnLista_option1 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        for(String myOwnList : myData()) {
            myList.add(myOwnList);
        }
        System.out.println(myList);
        String hola = myList.remove(0);
        System.out.println("El dato removido es: " + hola);
        System.out.println("La nueva lista es: " + myList);
    }

    static String[] myData() {
        String [] data = {"Andres", "Camilo", "Stevan", "Juan", "Liliana", "Katerine"};
        return data;
    }
}
