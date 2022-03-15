package javaPractice.POO.CheckingAbstraccion;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Model {

    public Model(String marca, String modelo, boolean disponibilidad, double precio, double importacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.importacion = importacion;
    }

    private String marca;
    private String modelo;
    private boolean disponibilidad;
    private double precio;
    private final double IVA = 19;
    private double importacion;

    public double calcularIva() {
        double checkIva = (IVA * this.getPrecio()) / 100;
        double checkImportAmount = (this.getImportacion() * this.getPrecio()) / 100;
        double costoTotal = (checkIva + this.getPrecio() + checkImportAmount);
        return costoTotal;
    }


}
