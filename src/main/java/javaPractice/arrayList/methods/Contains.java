package javaPractice.arrayList.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contains {

    public static void main(String[] args) {
        List<String> myNewList = new ArrayList<>(Arrays.asList(myArray1()));

        for (String data : myNewList) {
            boolean checkIfExist = data.contains(myNewList.get(0));
            System.out.println(checkIfExist);
        }
    }

    static String[] myArray1() {
        String[] thisIsThis = {"Manzana", "Pera", "Piña", "Melon", "Durazno"};
        return thisIsThis;
    }
}
