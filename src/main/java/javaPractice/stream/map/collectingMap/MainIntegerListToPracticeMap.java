package javaPractice.stream.map.collectingMap;

import java.util.List;
import java.util.stream.Collectors;

public class MainIntegerListToPracticeMap {

    public static void main(String[] args) {
    List<Integer> integerArrayCollection = IntegerListToPracticeMap.IntListNewExample();
        List<Integer> newArrayListResutls = integerArrayCollection
                .stream()
                .filter(x -> x < 20)
                .map(x -> x * 3)
                .sorted() // Para organizarlos
                .distinct() // Para eliminar los repetidos
                .collect(Collectors.toList());
        System.out.println(newArrayListResutls);
    }
}
