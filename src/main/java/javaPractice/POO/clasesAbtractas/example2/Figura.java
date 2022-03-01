package javaPractice.POO.clasesAbtractas.example2;

public abstract class Figura {

    protected double x;
    protected double y;

    // Constructor de la clase Figura
    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Metodo abstracto no se implementa
    public abstract double area();
}
