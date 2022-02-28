package javaPractice.arrayList;

import java.util.ArrayList;

public class CreandoListas1 {
    public static void main(String[] args) {

        ArrayList<String> canciones = new ArrayList<>();
        canciones.add("Ashes to ashes");
        canciones.add("Beds are burning");
        canciones.add("It's only rock 'n' Roll (But I like it)");

        // Para obtener un elemento de la lista
        System.out.println("=== Recorrindo la lista y obteniendo un elemento de esta:  ===");
        System.out.println(canciones.get(1));

        // Para obtener los elementos de la lista se hace de esta forma
        // Metodo 1
        System.out.println("=== Recorrindo Metodo 1 ===");
        for(String songList : canciones) {
            System.out.println(songList);
        }

        // forEach del ArrayList y le pasa una función que será llamada por cada elemento.
        // Metodo 2
        System.out.println("=== Recorrindo Metodo 2 ===");
        canciones.forEach((cancion) -> {
            System.out.println(cancion);
        });
    }
}
