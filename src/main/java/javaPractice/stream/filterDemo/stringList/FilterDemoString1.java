package javaPractice.stream.filterDemo.stringList;

import java.util.List;
import java.util.stream.Collectors;

public class FilterDemoString1 {

    public static void main(String[] args) {
        List<String> myDataString = DatumString.theNameList();
        List<String> shortNames;

        shortNames = myDataString
                .stream()
                .filter(str -> str.length() >= 3 && str.length() <= 6)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(shortNames);
    }
}
