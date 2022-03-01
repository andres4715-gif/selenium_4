package javaPractice.POO.clasesAbtractas.example2;

public class Circulo extends Figura {

    double radio;

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}
