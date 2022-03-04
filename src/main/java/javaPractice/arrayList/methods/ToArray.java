package javaPractice.arrayList.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {

    public static void main(String[] args) {

        List<String> myData = new ArrayList<>(Arrays.asList(myArray1()));
        String[] myArray = new String[myData.size()];
        myArray = myData.toArray(myArray);

        for (String data : myArray) {
            System.out.println(data);
        }
    }

    static String[] myArray1() {
        String[] thisIsThis = {"Manzana", "Pera", "Piña", "Melon", "Durazno"};
        return thisIsThis;
    }
}
