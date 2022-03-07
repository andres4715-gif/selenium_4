package javaPractice.stream.completeExample1;

import java.util.Arrays;
import java.util.List;

public class StreamsApp {

    String[] listaData = {"Mito", "Code", "Jaime", "MitoCode"};
    String[] numerosData = {"1", "2", "3", "4"};

    List<String> lista = Arrays.asList(listaData);
    List<String> numeros = Arrays.asList(numerosData);


    void filtrar() {
        lista.stream()
                .filter(x -> x.startsWith("M"))
                .forEach(System.out::println);
    }

    void ordenar() {
        lista.stream()
                .sorted()
                .forEach(System.out::println);
    }

    void transformar() {
        lista.stream()
                .map(x -> x.toUpperCase())
                .forEach(System.out::println);
    }

    void transformaNumeros() {
        numeros.stream()
                .map(x -> Integer.parseInt(x) + 1)
                .forEach(System.out::println);
    }

    void limitar() {
        lista.stream()
                .limit(2)
                .forEach(System.out::println);
    }

    void contar() {
        long x = lista.stream()
                .count();
        System.out.println(x);
    }
}
