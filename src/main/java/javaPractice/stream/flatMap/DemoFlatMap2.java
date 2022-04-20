package javaPractice.stream.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFlatMap2 {

    public static void main(String[] args) {

        List<String> teamA = Arrays.asList("Andres", "Carmen", "Esteban");
        List<String> teamB = Arrays.asList("Juan", "Camilo", "laura");
        List<String> teamC = Arrays.asList("Iroman", "Thor", "Spiderman");

        List<List<String>> totalStringList = new ArrayList<>();
        totalStringList.add(teamA);
        totalStringList.add(teamB);
        totalStringList.add(teamC);

        List<String> finalResult = totalStringList
                .stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(finalResult);
    }
}
