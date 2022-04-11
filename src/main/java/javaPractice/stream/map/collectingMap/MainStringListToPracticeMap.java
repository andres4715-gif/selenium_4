package javaPractice.stream.map.collectingMap;

import java.util.List;
import java.util.stream.Collectors;

public class MainStringListToPracticeMap {

    public static void main(String[] args) {
        List<String> myNewList = StringListToPracticeMap.stringList();

        List<String> checkNewList = myNewList.stream()
                .map(x -> x.toUpperCase())
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(checkNewList);
    }
}
