package javaPractice.arrays.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgregandoDatosArray {
    public static void main(String[] args) {

        // Este array tiene una capacidad solo de tres elementos en el.
        String[] myArray1 = new String[3];

        myArray1[0] = "Andres";
        myArray1[1] = "Liliana";
        myArray1[2] = "Daniel";

        // Que pasa si queremos añadir un dato mas en ese array
        // Pasa que no es posible, en ese caso es necesario crear un arrayList

        // Pero tambien es posible convertir ese array a un arrayList de la sig forma:

        String[] myArray2 = new String[1];
        myArray2[0] = "1";
        // Convert to ArrayList
        List<String> testList = new ArrayList<>(Arrays.asList(myArray2));
        System.out.println("La cantidad de elementos que vienen del array son: " + testList.size());
        testList.add("2");
        System.out.println("La cantidad despues de agregar los datos es: " + testList.size());
    }
}
