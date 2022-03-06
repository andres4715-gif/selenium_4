package javaPractice.arrayList.examples;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class ListFromAnotherList {

    public static void main(String[] args) {

        List<Integer> myList = numeros();
        List<Integer> lestTen = new ArrayList(myList);
        List less = lestTen
                .stream()
                .filter(s -> s < 10)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(myList);
        System.out.println(less);
    }

    static List<Integer> numeros() {
        List<Integer> num = new ArrayList<>();
        num.add(9);
        num.add(3);
        num.add(5);
        num.add(12);
        num.add(15);
        num.add(67);
        num.add(76);

        return num;
    }
}
