package javaPractice.stream.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFlatMap3 {

    public static void main(String[] args) {

        List<Student> myStudentList = new ArrayList<>();
        myStudentList.add(new Student("Andres", 89, '9'));
        myStudentList.add(new Student("Liliana", 887, '7'));
        myStudentList.add(new Student("Katherine", 98765, '5'));

        List<Student> myStudentList2 = new ArrayList<>();
        myStudentList2.add(new Student("Camilo", 6543, 'A'));
        myStudentList2.add(new Student("Carmen", 7654, 'B'));
        myStudentList2.add(new Student("Stevan", 998, 'C'));

        List<List<Student>> studentList = Arrays.asList(myStudentList, myStudentList2);

        List<String> finalResultStudentList = studentList
                .stream()
                .flatMap(x -> x.stream())
                .map(z -> z.name)
                .collect(Collectors.toList());
        System.out.println(finalResultStudentList);
    }
}
