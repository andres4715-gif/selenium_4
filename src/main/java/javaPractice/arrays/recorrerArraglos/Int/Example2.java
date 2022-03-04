package javaPractice.arrays.recorrerArraglos.Int;

public class Example2 {
    public static void main(String[] args) {

        int[] myArray2 = new int[3];
        myArray2[0] = 1;
        myArray2[1] = 2;
        myArray2[2] = 3;

        for (int checking : myArray2) {
            int pivote = checking;
            System.out.println(pivote);
        }
    }
}
