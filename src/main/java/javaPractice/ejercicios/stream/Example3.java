package javaPractice.ejercicios.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

    public static void main(String[] args) {

        String[] myArray = {"Andres", "Camilo", "Juan", "Alejandra"};

        List<String> nyList = new ArrayList<>(Arrays.asList(myArray));

        List data = nyList
                .stream()
                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println("The data is: " + data);

    }
}
