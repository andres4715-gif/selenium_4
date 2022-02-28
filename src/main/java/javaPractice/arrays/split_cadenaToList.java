package javaPractice.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class split_cadenaToList {
    public static void main(String[] args) {
        String cadena = "string of words";
        String[] strArr = cadena.split(" ");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArr));
        System.out.println("La cadena original es: " + cadena);
        System.out.println("La nueva lista es: " + list);
        System.out.println("Obtener un caracter de la lista: " + list.get(0));

        System.out.println("=== Imprimiendo con el for normal: ===");
        for(int i = 0; i < list.size();i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=== Imprimiendo con el foreach: ===");
        for(String data: list) {
            System.out.println(data);
        }
    }
}
