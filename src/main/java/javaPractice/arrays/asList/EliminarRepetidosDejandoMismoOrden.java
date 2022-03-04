package javaPractice.arrays.asList;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EliminarRepetidosDejandoMismoOrden {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList(checking());
        Set<String> hs = new LinkedHashSet();
        hs.addAll(myList);
        System.out.println(hs);
    }

    static String[] checking() {
        String[] strs = {"orange", "apple", "apple", "banana", "grape", "apple", "lemon"};
        return strs;
    }
}
