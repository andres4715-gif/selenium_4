package javaPractice.arrayList.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add {

    public static void main(String[] args) {

        String[] newFruitList = {"Uva", "fresa", "Maraculla", "Lulo", "tomate de arbol"};

        List<String> myNewList = new ArrayList<>(Arrays.asList(myArray1()));

        for (String newData : newFruitList) {
            myNewList.add(newData);
        }

        System.out.println("La nueva lista es: " + myNewList);
    }

    static String[] myArray1() {
        String[] thisIsThis = {"Manzana", "Pera", "Piña", "Melon", "Durazno"};
        return thisIsThis;
    }
}
