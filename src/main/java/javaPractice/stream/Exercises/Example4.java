package javaPractice.stream.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

    public static void main(String[] args) {

        int value = 10;
        int[] myArray = {2, 12, 34, 56, 1, 76, 87, 29, 676, 76, 7,};

        ArrayList<Integer> nyList = (ArrayList<Integer>) Arrays.stream(myArray).boxed().collect(Collectors.toList());

        List<Integer> less = nyList
                .stream()
                .filter(s -> s < value)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Numbers less than " + value + ": " + less);

        List<Integer> greater = nyList
                .stream()
                .filter(s -> s > value)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Numbers greater than " + value + ": " + greater) ;
    }
}
