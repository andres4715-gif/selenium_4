package javaPractice.arrayList.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsEmpty {

    public static void main(String[] args) {

        List<String> newData = new ArrayList<>(Arrays.asList(myArray1()));
        boolean checkEmpty = newData.isEmpty();
        System.out.println("La lista esta vacia: " + checkEmpty);
        newData.clear();
        System.out.println("La lista esta vacia: " + newData.isEmpty());
    }

    static String[] myArray1() {
        String[] thisIsThis = {"Manzana", "Pera", "Piña", "Melon", "Durazno"};
        return thisIsThis;
    }
}
