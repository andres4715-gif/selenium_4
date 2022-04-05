package javaPractice.stream.entendiendoStreams;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Esto esta en el proyecto
// selenium_4
// En la ruta: src/main/java/javaPractice/stream/entendiendoStreams

public class App {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Andres", LocalDate.of(2003, 1, 21));
        Person p2 = new Person(2, "Jorge", LocalDate.of(2000, 3, 23));
        Person p3 = new Person(3, "Estevan", LocalDate.of(1960, 2, 11));
        Person p4 = new Person(4, "Liliana", LocalDate.of(1979, 4, 3));
        Person p5 = new Person(5, "Camilo", LocalDate.of(1980, 5, 22));

        Product prod1 = new Product(1, "ceviche", 34.6);
        Product prod2 = new Product(2, "galleta", 34.6);
        Product prod3 = new Product(3, "chocolatina", 34.6);
        Product prod4 = new Product(4, "mandarina", 34.6);

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
        List<Product> products = Arrays.asList(prod1, prod2, prod3, prod4);

        // Para recorrer las listas con un foreach
        for (Person myDataPerson : persons) {
            System.out.println(myDataPerson);
        }

        for (Product myDataProduc : products) {
            System.out.println(myDataProduc);
        }

        // Para ejecutarlo con un foreach simplificado
        // Esto es lo que se le llama (Expresion Lambda).
        persons.forEach(person -> System.out.println(person));

        products.forEach(product -> System.out.println(product));

        // Pero se puede simplificar mas aún.
        // Java dice que si el paremetro de la izquierda es el mismo que la derecha
        // Se pude declarar de esta forma.

        persons.forEach(System.out::println);
        products.forEach(System.out::println);


        // 1 - Filter (param : function)

        List<Person> filteredList = persons
                .stream()
                .filter(p -> App.getAge(p.getBirthday()) >= 40)
                .collect(Collectors.toList());
        App.printList(filteredList);


        // 2 - Map (param : function)

        List<Integer> filteredList2 = persons
                .stream()
                .map(p -> App.getAge(p.getBirthday()))
                .collect(Collectors.toList());
        App.printList(filteredList2);

        // 3 - Sorted (param : comparator)
        // Permite ordenas a traves de una colección.

        List<String> filteredList3 = persons
                .stream()
                .map(p -> p.getName())
                .sorted()
                .collect(Collectors.toList());
        App.printList(filteredList3);


        // Ordenando el objeto completo con el comparator
        // sorted(param : comparator)

        // Comparator<persons>
        Comparator<Person> byNameAcs = (Person o1, Person o2) -> o1.getName().compareTo(o2.getName());
        Comparator<Person> byNameDesc = (Person o1, Person o2) -> o2.getName().compareTo(o1.getName());
        List<Person> filteredList4 = persons
                .stream()
                .sorted(byNameAcs)
                .collect(Collectors.toList());
        App.printList(filteredList4);


        // 4 - Match (param : predicate)

        boolean rpta1 = persons
                .stream()
                .anyMatch(x -> x.getName().startsWith("L"));
        System.out.println(rpta1);


        boolean rpta2 = persons
                .stream()
                .allMatch(x -> x.getName().startsWith("L"));
        System.out.println(rpta2);


        boolean rpta3 = persons
                .stream()
                .noneMatch(x -> x.getName().startsWith("X"));
        System.out.println(rpta3);

        List<Person> filteredList6 = persons.stream()
                .skip(2)
                .collect(Collectors.toList());
        App.printList(filteredList6);

        List<Person> filteredList5 = persons
                .stream()
                .limit(2)
                .collect(Collectors.toList());
        App.printList(filteredList5);
    }

    public static int getAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public static void printList(List<?> list) {
        list.forEach(System.out::println);
    }
}
