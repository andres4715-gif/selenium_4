package javaPractice.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFlatMap {

    public static void main(String[] args) {

        // Adding data into the objects:
        List<Integer> myNewObject1 = Arrays.asList(1, 2);
        List<Integer> myNewObject2 = Arrays.asList(3, 4);
        List<Integer> myNewObject3 = Arrays.asList(5, 6);

        List<List<Integer>> mainTotalList =
                Arrays.asList(myNewObject1, myNewObject2, myNewObject3); // ya se tienen varios array como objetos.

        List<Integer> finalResult = mainTotalList
                .stream()
                .flatMap(x -> x.stream())
                .map(z -> z + 10) // aplica solo si es necesario hacer alguna modificación a los datos.
                .collect(Collectors.toList());
        System.out.println(finalResult);
    }
}
