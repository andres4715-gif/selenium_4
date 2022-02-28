package javaPractice.arrayList;

import java.util.ArrayList;

public class ConvertirStringEnArrayList {
    public static void main(String[] args) {

        String sample = "sample";
        ArrayList<Character> list = new ArrayList<Character>();

        System.out.println("La cantidad de elementos en el string es: " + sample.length());

        for (int i = 0; i < sample.length(); i++) {
            char currentCharacter = sample.charAt(i);
            list.add(currentCharacter); // adding the character to the list
        }
        // En este momento los datos del string ya son elementos de una lista
        System.out.println("Los datos de la lista son: " + list);
        System.out.println("La cantidad de elementos dentro de la lista son: " + list.size());
    }
}
