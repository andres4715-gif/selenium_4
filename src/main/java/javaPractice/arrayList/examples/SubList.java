package javaPractice.arrayList.examples;


import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        // Vamos a crear una sub list partiendo de una lista
        List<String> nombres = new ArrayList<String>();
        nombres.add("Carlos");
        nombres.add("Andres");
        nombres.add("Liliana");
        nombres.add("Katerine");
        nombres.add("Maria");
        nombres.add("Karla");

        System.out.println(nombres);
        List hola = nombres.subList(0, 3);
        System.out.println(hola);
    }
}
