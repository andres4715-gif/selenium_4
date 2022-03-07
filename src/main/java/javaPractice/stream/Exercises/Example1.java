package javaPractice.stream.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {
        int count = 0;

        String einsten = "La imaginación es mas importante que el conocimiento pero con información";
        String[] splited = einsten.split(" ");

        // Collection to iterate
        List<String> words = Arrays.asList(splited);
        System.out.println("La colección que tengo ahora es: " + words);

        for (String w : words) {
            if (w.startsWith("i")) {
                count++;
            }
        }
        System.out.println("(METODO NORMAOL EN JAVA) Las cantidad que inicia con i son: " + count);

        // Haciendo lo mismo con Streams de java 8 streams
        long numbers = words
                .stream()
                .filter(s -> s.startsWith("i")).count();
        System.out.println("METODO STREAMS CON JAVA 8) La cantida que inicia con i son: " + numbers);

        // Despues de obtener el collector partiendo de un string es posible objeter los datos de esta forma:
        List data = words
                .stream()
                .filter(s -> s.startsWith("i"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println("The data is: " + data);
    }
}
