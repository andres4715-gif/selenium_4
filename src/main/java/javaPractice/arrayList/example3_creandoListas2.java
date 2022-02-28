package javaPractice.arrayList;

import java.util.ArrayList;

public class example3_creandoListas2 {
    public static void main(String[] args) {

        ArrayList<String> ejemploList = new ArrayList<String>();
        ejemploList.add("Juan");
        ejemploList.add("Pedro");
        ejemploList.add("José");
        ejemploList.add("Maria");
        ejemploList.add("Sofia");

        // Para obtener la cantidad de los elementos de la lista
        System.out.println(" === La cantidad de elementos de la lista es: " + ejemploList.size());
    }
}
