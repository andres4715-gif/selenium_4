package javaPractice.POO.clasesAbtractas.example3;

public class Main {
    /*
    Este ejercicio tiene polimorfismo aplicado.
    Se implementa el Polimorfismo ya que se crea el objeto a1 pero luego se llaman los constructores de cada clase

    Vehiculo a1 = new Automovil(<datos del constructor>);
    a1 = new Motocicleta(<datos del constructor>);
    a1 = new Camion(<datos del constructor>);

    */

    public static void main(String[] args) {
        Vehiculo a1 = new Automovil("Automovil", 4, false, "Mazda", "Mazda3", 2013, "Gris", 2000, true, false);
        System.out.println("----Automovil-----");
        ((Automovil) a1).puertas(4);
        System.out.println("El " + a1.tipoVehiculo + " tiene " + a1.cantidadLlantas(4) + " llantas");
        System.out.println("El " + a1.tipoVehiculo + " frena seguro: " + a1.frenarSeguro());
        System.out.println("El " + a1.tipoVehiculo + " tiene pito: " + a1.pitar());
        System.out.println("El " + a1.tipoVehiculo + " puede arrancar: " + a1.moverse());

        System.out.println();
        System.out.println("----Motocicleta-----");
        a1 = new Motocicleta("Motocicleta", 2, false, "Auteco", "Agility", 2022, "Negro", 150, true, true);
        ((Motocicleta) a1).agarraderas(1);
        System.out.println("La " + a1.tipoVehiculo + " tiene " + a1.cantidadLlantas(2) + " llantas");
        System.out.println("La " + a1.tipoVehiculo + " frena seguro: " + a1.frenarSeguro());
        System.out.println("La " + a1.tipoVehiculo + " tiene pito: " + a1.pitar());
        System.out.println("La " + a1.tipoVehiculo + " puede arrancar: " + a1.moverse());

        System.out.println();
        System.out.println("----Camion-----");
        a1 = new Camion("Camion", 18, false, "Kenword", "AS678", 1929, "Negro", 35000, true, false);
        ((Camion) a1).cantidadTrompetas(7);
        System.out.println("El " + a1.tipoVehiculo + " tiene " + a1.cantidadLlantas(18) + " llantas");
        System.out.println("El " + a1.tipoVehiculo + " frena seguro: " + a1.frenarSeguro());
        System.out.println("El " + a1.tipoVehiculo + " tiene pito: " + a1.pitar());
        System.out.println("EL " + a1.tipoVehiculo + " puede arrancar: " + a1.moverse());
    }
}
