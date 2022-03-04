package javaPractice.arrays.examples;


// FUENTE: http://buenasintencions.blogspot.com/2011/12/archivo-invertirarreglo.html
public class ObterneArrayDeManeraInversa {
    public static void main(String[] args) {
        int numeros[] = {10, 20, 30, 40, 50};

        //Bloque 1: Impresion de nuestro arreglo.
        System.out.println("Indice Valor");
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.println(contador + " " + numeros[contador]);
        }

        //Bloque 2: Impresión invertida del arreglo.
        System.out.println();
        System.out.println("Indice Valor");
        for (int contador = numeros.length - 1; contador >= 0; contador--) {
            System.out.println(contador + " " + numeros[contador]);
        }
    }
}

