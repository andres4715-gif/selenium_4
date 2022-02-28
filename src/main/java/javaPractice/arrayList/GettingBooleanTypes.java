package javaPractice.arrayList;

import java.util.ArrayList;

public class GettingBooleanTypes {

    public static void main(String[] args) {

        ArrayList<String> canciones = new ArrayList<>();
        canciones.add("Ashes to ashes");
        canciones.add("Beds are burning");
        canciones.add("It's only rock 'n' Roll (But I like it)");

        for (String cancionesList : canciones) {
            System.out.println(cancionesList);
        }

        canciones.clear();

        // Vamos a validar si retorna un true ya que la lista esta vacia:
        boolean checkList = canciones.isEmpty();
        System.out.println("La lista esta vacia: " + checkList);

        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // imprimamos la lista de numeros:
        for(int dataNumber : numeros) {
            System.out.println(dataNumber);
        }

        // Vamos a validar si la lista contiene un numero especifico:
        boolean checkContainsCorrectNumber = numeros.contains(1);
        boolean checkContainsFailNumber = numeros.contains(10);

        System.out.println("La lista contiene el numero 1: " + checkContainsCorrectNumber);
        System.out.println("La lista contiene el numero 10: " + checkContainsFailNumber);

    }
}

