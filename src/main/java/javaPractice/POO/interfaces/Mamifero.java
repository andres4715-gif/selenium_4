package javaPractice.POO.interfaces;

public class Mamifero implements Animal {
    @Override
    public void nombreEspecie(String nombre) {
        System.out.println("El nombre de la especie es: " + nombre);
    }

    @Override
    public String continente(String pais) {
        if (pais == "Colombia") {
            return "Sur America";
        } else
            return "Cualquier lugar del mundo";
    }
}
