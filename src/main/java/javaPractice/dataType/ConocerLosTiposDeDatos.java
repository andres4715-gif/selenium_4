package javaPractice.dataType;

public class ConocerLosTiposDeDatos {

    public static void main(String[] args) {
        // String
        String nombre = "Andres";
        System.out.println("La variable nombre es un: " + nombre.getClass().getSimpleName());

        // Array
        String[] myArray = new String[100];
        System.out.println("La variable myArray es un: " + myArray.getClass().getSimpleName());

        // int
        // Este método sólo puede ser llamado por los objetos; por lo tanto, para comprobar el tipo de tipos
        // de datos primitivos, necesitamos echar primero la primitiva a Objeto.
        int numero = 5;
        System.out.println("la variable numero es un: " + ((Object)numero).getClass().getSimpleName());
    }
}
