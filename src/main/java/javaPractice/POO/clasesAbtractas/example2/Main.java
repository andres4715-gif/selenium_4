package javaPractice.POO.clasesAbtractas.example2;

public class Main {

    public static void main(String[] args) {
        // Se crea un objeto de la clase Circulo
        Circulo newCirculo = new Circulo(5,4, 7);
        System.out.println("EL Area del circulo es: " + newCirculo.area());

        // Se crea un objeto de la clase Cuadrado
        Cuadrado newCuadrado = new Cuadrado(25,9,8.3);
        System.out.println("El area del cuadrado es: " + newCuadrado.area());
    }
}
