package javaPractice.arrays.metodosDeArray;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] numbers = {12, 45, 69, 65, 67, 8};
        Arrays.sort(numbers);
        imprimir(numbers);
    }

    static void imprimir(int array[]) {
        for (int pivote : array) {
            System.out.println(pivote);
        }
    }
}


