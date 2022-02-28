package javaPractice.arrayList;

import java.util.ArrayList;

public class Example3_creandoListas2 {
    public static void main(String[] args) {

        ArrayList<String> ejemploList = new ArrayList<String>();
        ejemploList.add("Juan");
        ejemploList.add("Pedro");
        ejemploList.add("José");
        ejemploList.add("Maria");
        ejemploList.add("Sofia");

        // Para obtener la cantidad de los elementos de la lista
        System.out.println("=== La cantidad de elementos de la lista es === : " + ejemploList.size());

        // Para obtener un elemento de la lista
        System.out.println("=== Obtener el segundo elemento de la lista === " + ejemploList.get(1));

        // Para eliminar un elemento de la lista
        System.out.println("=== Eliminar un elemento de la lista === " + ejemploList.remove(0));

        // imprimir todos los elementos de la lista con un foreach
        for(String nombres : ejemploList) {
            System.out.println(nombres);
        }
    }
}
