package javaPractice.stream.completeExample1;

import java.util.Arrays;

public class FindFirst {
    public static void main(String[] args) {

        String[] data = {"a1", "a2", "a3"};

        Arrays.asList(data)
                .stream()
                .findFirst()
                .ifPresent(System.out::println);  // a1
    }
}
