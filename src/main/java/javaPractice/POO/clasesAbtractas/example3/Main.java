package javaPractice.POO.clasesAbtractas.example3;

public class Main {

    public static void main(String[] args) {
        Automovil a1 = new Automovil("Automovil", 4, false, "Mazda", "Mazda3", 2013, "Gris", 2000, true, false);
        System.out.println("----Automovil-----");
        a1.puertas(4);
        System.out.println("El " + a1.tipoVehiculo + " tiene " + a1.cantidadLlantas(4) + " llantas");
        System.out.println("El " + a1.tipoVehiculo + " frena seguro: " + a1.frenarSeguro());
        System.out.println("El " + a1.tipoVehiculo + " tiene pito: " + a1.pitar());
        System.out.println("El " + a1.tipoVehiculo + " puede arrancar: " + a1.moverse());

        System.out.println();
        System.out.println("----Motocicleta-----");
        Motocicleta m1 = new Motocicleta("Motocicleta", 2, false, "Auteco", "Agility", 2022, "Negro", 150, true, true);
        m1.agarraderas(1);
        System.out.println("La " + m1.tipoVehiculo + " tiene " + m1.cantidadLlantas(2) + " llantas");
        System.out.println("La " + m1.tipoVehiculo + " frena seguro: " + m1.frenarSeguro());
        System.out.println("La " + m1.tipoVehiculo + " tiene pito: " + m1.pitar());
        System.out.println("La " + m1.tipoVehiculo + " puede arrancar: " + m1.moverse());

        System.out.println();
        System.out.println("----Camion-----");
        Camion c1 = new Camion("Camion", 18, false, "Kenword", "AS678", 1929, "Negro", 35000, true, false);
        c1.cantidadTrompetas(7);
        System.out.println("El " + c1.tipoVehiculo + " tiene " + c1.cantidadLlantas(18) + " llantas");
        System.out.println("El " + c1.tipoVehiculo + " frena seguro: " + c1.frenarSeguro());
        System.out.println("El " + c1.tipoVehiculo + " tiene pito: " + c1.pitar());
        System.out.println("EL " + c1.tipoVehiculo + " puede arrancar: " + c1.moverse());
    }
}
