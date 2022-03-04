package javaPractice.arrayList.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAll {

    public static void main(String[] args) {

        List<String> myNewList = new ArrayList<>(Arrays.asList(myArray1()));
        List<String> myNewList2 = new ArrayList<>(Arrays.asList(myArray12()));

        // Se unen las listas de esta forma
        myNewList.addAll(myNewList2);

        // Se imprime la nueva lista y la entrega en coleccion:
        System.out.println(myNewList);

        // Se imprime la nueva lista y la entrega en coleccion y se puede obtener un valor especifico:
        System.out.println("El valor especifico es: " + myNewList.get(3));

        // Para recorret todos los elementos de la lista de hace con el foreach
        System.out.println("**************");
        System.out.println("Todos los elementos de la lista ");
        for (String lista : myNewList)
            System.out.println(lista);
    }

    static String[] myArray1() {
        String[] thisIsThis = {"Manzana", "Pera", "Piña", "Melon", "Durazno"};
        return thisIsThis;
    }

    static String[] myArray12() {
        String[] thisIsThis2 = {"Uva", "fresa", "Maraculla", "Lulo", "tomate de arbol"};
        return thisIsThis2;
    }
}
