package javaPractice.POO.clasesAbtractas.example1;

public class Main {

    public static void main(String[] args) {

        // Importante: las clases abtactas no se pueden instanciar.
        Terrestre obj = new Terrestre();
        System.out.println(obj.arrancar());
        obj.frenar();

        // Se puede crear un objeto de las n cantidad de clases que hereden de la clase abstracta ppal
        Aereo objAereo = new Aereo();
        System.out.println(objAereo.arrancar());
        objAereo.frenar();
    }
}
