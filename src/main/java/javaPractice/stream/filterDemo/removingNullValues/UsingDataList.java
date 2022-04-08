package javaPractice.stream.filterDemo.removingNullValues;

import java.util.List;
import java.util.stream.Collectors;

public class UsingDataList {

    public static void main(String[] args) {
        List<String> checking_saludos_and_despedidas = DataValues.myStringDataList();
        List<String> removingNullsValues;

        removingNullsValues = checking_saludos_and_despedidas
                .stream()
                .filter(x -> x != null)
                .collect(Collectors.toList());
        System.out.println(removingNullsValues);
    }
}
