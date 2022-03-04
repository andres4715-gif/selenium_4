package javaPractice.manejoDeStrings;

import javax.xml.bind.SchemaOutputResolver;

public class Example3 {
    public static void main(String[] args) {


        String text = "Lo que digan ellos esta bien para todos, por lo menos eso dicen";

        // Saber la cantidad de caracteres que tiene un cadena de texto
        int lengthText = text.length();
        System.out.println("La cantidad de caracteres es: " + lengthText);

        // Convertir el texto en mayusculas
        String mayusculas = text.toUpperCase();
        System.out.println("El texto en mayusculas: " + mayusculas);

        // Convertir el texto en minusculas
        String minuculas = text.toLowerCase();
        System.out.println("El texto en minusculas: " + minuculas);

        // indexOf = Retorna el primer indice donde se encuentre al valor ingresado, esto retorna un entero:
        String letra = "m";
        int pocision = text.indexOf(letra);
        System.out.println("Retorna el primer elemento donde se encuentra la letra " + letra + ": " + pocision);

        // substring: Nos devuelve los caracteres que se encuentran en un rango de posiciones
        String busqueda = text.substring(7, 12);
        System.out.println("la palabra que se toma es: " + busqueda);

        // replace:
        // Nos permite reemplazar la cadena de caracteres (uno o varios) que definimos en el primer argumento por
        // la que definimos en el segundo argumento. Solo cambia la primera coincidencia.
        String nuevoTexto = text.replace("todos", "Juan");
        System.out.println("El nuevo texto es: " + nuevoTexto);
    }
}
