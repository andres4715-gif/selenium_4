package javaPractice.ejercicios.stream.completeExample1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// TODO -> I am checking this page: https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/

public class ArrayToList {

    static String[] data = {"a1", "a2", "b1", "c2", "c1"};

    public static void main(String[] args) {
        hola();
    }

    static void hola() {
        List<String> myList = Arrays.asList(data);

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
