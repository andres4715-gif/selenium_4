package javaPractice.POO.CheckingAbstraccion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainSmartWatch {

    public static void main(String[] args) {

        SmartWatchHombre obj1 = new SmartWatchHombre("blanco", 6, 8, "amoled", false, "bonita", "touch", "gorilaGlass");
        System.out.println("La pantalla se enciende?: " + obj1.encenderDisplay(true));
        System.out.println("la manilla es del material: " + obj1.escogerManilla());

        List<Model> myList = new ArrayList<>();
        myList.add(new Model("Samsung", "Galaxy", true, 200, 10));
        myList.add(new Model("Huawei", "HRT12", false, 300, 10));
        myList.add(new Model("Poco", "Poco56P", true, 400, 10));
        myList.add(new Model("HTC", "HCH78H", false, 500, 10));

        int totalElements = myList.size();
        System.out.println("El total de elementos en la lista es: " + totalElements);

        for (Model checkIvaValue : myList) {
            System.out.println("El valor final de los reloges es: " + checkIvaValue.calcularIva());
        }

        MainSmartWatch.relogesMasCaros(myList, 300.0);
    }

    // TODO aptener los valores de la lista ya que solo esta retornando la cantidad de datos de la lista:
    private static void relogesMasCaros(List<Model> ownList, double totalValue) {
        List<String> mio = ownList
                .stream()
                .filter(x -> x.getPrecio() > 300)
                .map(x -> x.getMarca())
                .sorted()
                .collect(Collectors.toList());
        MainSmartWatch.printList(mio);
    }

    public static void printList(List<?> list) {
        list.forEach(System.out::println);
    }
}
