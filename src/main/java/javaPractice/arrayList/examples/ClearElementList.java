package javaPractice.arrayList.examples;

import java.util.ArrayList;

public class ClearElementList {

    public static void main(String[] args) {
        ArrayList<String> canciones = new ArrayList<>();
        canciones.add("Ashes to ashes");
        canciones.add("Beds are burning");
        canciones.add("It's only rock 'n' Roll (But I like it)");

        for (String cancionesList : canciones) {
            System.out.println(cancionesList);
        }

        canciones.clear();

        System.out.println("Ahora la cantidad de elementos en la lista debe ser 0: " + canciones.size());
    }
}

