package javaPractice.POO.clasesAbtractas.example3;

public class Automovil extends Vehiculo {

    // Constructor
    public Automovil(String tipoVehiculo, int cantidadLlantas, boolean alas, String marca, String modelo, int anio, String color, int capacidadCarga, boolean combustible, boolean frenosAbs) {
        super(tipoVehiculo, cantidadLlantas, alas, marca, modelo, anio, color, capacidadCarga, combustible, frenosAbs);
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
        if (this.anio > 1930) {
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

    public void puertas(int cantidadPuertas) {
        System.out.println("La cantidad de puertas son: " + cantidadPuertas );
    }
}
