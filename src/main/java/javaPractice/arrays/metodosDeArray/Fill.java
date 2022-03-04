package javaPractice.arrays.metodosDeArray;

import java.util.Arrays;

public class Fill {
    public static void main(String[] args) {

        // Metodo fill: Metodo para inicializar arreglos con un valor determinado
        int [] myArray = new int [4];
        Arrays.fill(myArray, 45);
        imprimirArreglo(myArray);
    }

    static void imprimirArreglo(int arreglo[]) {
        for(int print : arreglo) {
            System.out.println(print);
        }
    }
}
