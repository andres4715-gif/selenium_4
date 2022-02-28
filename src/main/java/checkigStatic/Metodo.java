package checkigStatic;

public class Metodo {

    static int total;

    // Cuando el metodo es static
     static int suma(int num1 , int num2) {
         total = num1 + num2;
         return total;
     }

     // Cuando el metodo no es static y es necesario crearle un objeto a la clase.
    int resta(int num1, int num2) {
         int totalResta = num1 - num2;
         return totalResta;
    }
}
