package javaPractice.stream.map.FilterMapWithResult;

import javaPractice.stream.map.collectingMap.StringListToPracticeMap;

import java.util.List;
import java.util.stream.Collectors;

public class DoingFilterAndGettingCollection {

    public static void main(String[] args) {
        List<String> newNamesList;

        List<String> gettingNames = StringListToPracticeMap.stringList();

        newNamesList = gettingNames
                .stream()
                .filter(x -> x.length() > 3)
                .map(x -> x.toUpperCase())
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(newNamesList);
    }
}
