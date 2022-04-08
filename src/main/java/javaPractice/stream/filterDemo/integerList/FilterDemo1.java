package javaPractice.stream.filterDemo.integerList;

import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        List<Integer> newIntegerList;
        List<Integer> myDataIntegerList = Datum.myInteger_arrayList();

        newIntegerList = myDataIntegerList
                .stream()
                .filter(x -> x % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(newIntegerList);
    }
}
