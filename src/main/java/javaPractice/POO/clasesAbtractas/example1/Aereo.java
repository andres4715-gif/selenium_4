package javaPractice.POO.clasesAbtractas.example1;

public class Aereo extends Transporte{

    public Aereo() {
        super();
        setMarca("Avion");
    }

    public void frenar() {
        System.out.println("La aeronave esta aterrizando");
    }
}
