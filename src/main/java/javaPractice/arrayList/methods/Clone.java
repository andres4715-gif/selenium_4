package javaPractice.arrayList.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Clonar una lista existente para tener otra igual: 

public class Clone {

    public static void main(String[] args) {

        List<String> newArrayList = new ArrayList<>(Arrays.asList(myArray1()));
        List<String> myNewList;
        myNewList = (ArrayList) ((ArrayList<String>) newArrayList).clone();
        System.out.println("La lista original es: " + newArrayList);
        System.out.println("La lista clonada es: " + myNewList);
    }

    static String[] myArray1() {
        String[] thisIsThis = {"Manzana", "Pera", "Piña", "Melon", "Durazno"};
        return thisIsThis;
    }
}
