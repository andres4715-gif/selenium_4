package checkigStatic;

import static checkigStatic.Metodo.suma;

public class MainMetodo {

    public static void main(String[] args) {

        // Cuando el metodo es marcado como static.
        System.out.println("La suma de los numero es: " + suma(3,5));

        // Cuando tenemos un metodo que no es static
        // Se debe crear un objeto de la clase.
        Metodo obj1 = new Metodo();
        int valor = obj1.resta(5,2);
        System.out.println("El valor de la resta es: " + valor);
    }
}
