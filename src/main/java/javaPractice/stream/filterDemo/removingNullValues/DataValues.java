package javaPractice.stream.filterDemo.removingNullValues;

import java.util.Arrays;
import java.util.List;

public class DataValues {

    public static List<String> myStringDataList() {
        List<String> saludos_and_despedidas = Arrays.asList("hola", "hi", "Hello", null, "Chiao", null, "chao");
        return saludos_and_despedidas;
    }
}
