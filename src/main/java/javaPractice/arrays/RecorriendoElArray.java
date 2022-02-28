// Ejemplo: Pedir 10 números por teclado y obtener la suma,
// el número menor, el número  mayor

package javaPractice.arrays;

import java.util.Scanner;

public class RecorriendoElArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int mayor = 0;
        int menor = 0;

        int[] miArreglo = new int[3];
        for (int i = 0; i < miArreglo.length; i++) {
            System.out.println("Ingrese el dato de la posición " + (i + 1) + ": ");
            miArreglo[i] = entrada.nextInt();
        }

        // realizar la suma, promedio y el mayor numero
        for (int i = 0; i < miArreglo.length; i++) {
            if (mayor < miArreglo[i]) {
                mayor = miArreglo[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);

        menor = mayor;
        // buscar el menor
        for (int i = 0; i < miArreglo.length; i++) {
            if (menor > miArreglo[i]) {
                menor = miArreglo[i];
            }
        }
        System.out.println("El numero menor es: " + menor);
    }
}
