package javaPractice.POO.clasesAbtractas.example3;

public class Camion extends Vehiculo {

    // Constructor
    public Camion(String tipoVehiculo, int cantLlantas, boolean alas, String marca, String modelo, int anio, String color, int capacidadCarga, boolean combustible, boolean frenosAbs) {
        super(tipoVehiculo, cantLlantas, alas, marca, modelo, anio, color, capacidadCarga, combustible, frenosAbs);
    }

    @Override
    public boolean moverse() {
        if (this.combustible) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pitar() {
        if (this.anio > 1990) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean frenarSeguro() {
        if (this.frenosAbs != true) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int cantidadLlantas(int llantas) {
        return llantas;
    }

    public void cantidadTrompetas(int cantidadTrompetas) {
        System.out.println("La cantidad de trompetas es: " + cantidadTrompetas );
    }
}
