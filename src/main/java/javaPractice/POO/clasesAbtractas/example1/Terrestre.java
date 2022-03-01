package javaPractice.POO.clasesAbtractas.example1;

public class Terrestre extends Transporte {

    public Terrestre() {
        super();
        setMarca("Chevorlet");
    }

    public void frenar() {
        System.out.println("El carro se esta deteniendo");
    }
}
