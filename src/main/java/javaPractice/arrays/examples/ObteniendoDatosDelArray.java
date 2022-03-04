package javaPractice.arrays.examples;

public class ObteniendoDatosDelArray {

    public static void main(String[] args) {

        int [] miArreglo = new int[6];
        miArreglo[0] = 1;
        System.out.println("En el arreglo 1: " + miArreglo[0]);

        int [] myArreglo2 = new int[9];
        myArreglo2[1] = 3;
        System.out.println("En el arreglo 2: " + myArreglo2[1]);

        int [] myArraglo3 = {1,2,3,4,5,6,7};
        System.out.println("En el arreglo 3 la cantidad es: " + myArraglo3.length);
        System.out.println("El valor 2 debe ser 3: " + myArraglo3[2]);
        // Para acceder al valor
        int dato = myArraglo3[0];
        System.out.println("El niño tiene " + dato + " años");

        // opteniendo los datos del vector:
        for(int myVector : myArraglo3) {
            System.out.println(myVector);
        }
    }
}
