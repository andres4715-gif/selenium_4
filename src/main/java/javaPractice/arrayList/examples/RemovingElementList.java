package javaPractice.arrayList.examples;

import java.util.ArrayList;

public class RemovingElementList {

    public static void main(String[] args) {
        ArrayList<String> canciones = new ArrayList<>();
        canciones.add("Ashes to ashes");
        canciones.add("Beds are burning");
        canciones.add("It's only rock 'n' Roll (But I like it)");

        // imprimiendo todos los elemetos de la lista;

        System.out.println("Lista original : ");
        System.out.println("******************");
        for (String data1 : canciones) {
            System.out.println(data1);
        }

        // Eliminando un elemento de la lista:
        canciones.remove(0);
        System.out.println();
        System.out.println("Despues que se elimino un elemento de la lista: ");
        System.out.println("******************");
        for (String data2 : canciones) {
            System.out.println(data2);
        }

        // Tambien se puede eliminar el elemento por su nombre:
        // Como la lista es de tres elementos y ya se eliminaron dos solo se va a imprimir un elemento de lista
        System.out.println();
        System.out.println("Eliminando elemento por su nommbre: ");
        System.out.println("******************");
        canciones.remove("Beds are burning");
        for (String data3 : canciones) {
            System.out.println(data3);
        }
    }
}
