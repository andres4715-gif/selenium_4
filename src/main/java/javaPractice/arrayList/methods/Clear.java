package javaPractice.arrayList.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Clear {

    public static void main(String[] args) {

        List<String> newArrayList = new ArrayList<>(Arrays.asList(myArray1()));
        int dataSet = clear(newArrayList);
        System.out.println("La cantidad de elementos de la lista es: " + dataSet);
    }

    static String[] myArray1() {
        String[] thisIsThis = {"Manzana", "Pera", "Piña", "Melon", "Durazno"};
        return thisIsThis;
    }

    static int clear(List data) {
        data.clear();
        return data.size();
    }
}
