package javaPractice.POO.clasesAbtractas.example1;

public abstract class Transporte {
    // Esta clase debe tener por lo menos un metodo abstracto
    // Este no tiene cuerpo y finaliza con (;).
    // El tratamiento es normal al de una clase común (puede tener constructores, metodos, variables etc...).

    private String marca;

    // Constructor
    public Transporte() {
    }

    // La clase puede tener metodos abstractos y solo es necesario declararlos
    // No necesariamente deben tener cuerpo.
    public abstract void frenar();

    public String arrancar() {
        return "El Vehiculo arranca";
    }

    public void setMarca(String s) {
        marca = s;
    }

    public String getMarca() {
        return marca;
    }
}
