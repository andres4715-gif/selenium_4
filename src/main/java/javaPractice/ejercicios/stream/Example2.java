package javaPractice.ejercicios.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {

        String[] data = {"Andres", "Liliana", "Carlos", "Alejandro"};
        List<String> myOwnList = Arrays.asList(data);

        List List2 = myOwnList
                .stream()
                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(List2);
    }
}
