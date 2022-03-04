package javaPractice.arrayList.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOF {

    public static void main(String[] args) {
        List<String> newList = new ArrayList<>(Arrays.asList(myArray1()));
        int data = newList.indexOf("Pera");
        System.out.println("El elemento buscado esta en; " + data);
    }

    static String[] myArray1() {
        String[] thisIsThis = {"Manzana", "Pera", "Piña", "Melon", "Durazno"};
        return thisIsThis;
    }
}
