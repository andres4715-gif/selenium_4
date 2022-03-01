package javaPractice.POO.clasesAbtractas.example3;

public abstract class Vehiculo {

    protected String tipoVehiculo;
    protected int cantidadLlantas;
    protected boolean alas;
    protected String marca;
    protected String modelo;
    protected int anio;
    protected String color;
    protected int capacidadCarga;
    protected Long propiedad;
    protected boolean combustible;
    private boolean frenosAbs;

    public boolean getFrenosAbs() {
        return frenosAbs;
    }

    // Constructor
    public Vehiculo(String tipoVehiculo, int cantidadLlantas, boolean alas, String marca, String modelo, int anio, String color, int capacidadCarga, boolean combustible, boolean frenosAbs) {
        this.tipoVehiculo = tipoVehiculo;
        this.cantidadLlantas = cantidadLlantas;
        this.alas = alas;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.capacidadCarga = capacidadCarga;
        this.combustible = combustible;
        this.frenosAbs = frenosAbs;
    }

    public abstract boolean moverse();

    public abstract boolean pitar();

    public abstract boolean frenarSeguro();

    public abstract int cantidadLlantas(int llantas);

    public boolean volar() {
        if (this.alas) {
            return true;
        } else {
            return false;
        }
    }
}
