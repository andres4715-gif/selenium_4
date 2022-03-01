package javaPractice.hasMap;

import java.util.HashMap;

public class HasMapMain {
    /*
    Para declarar un HashMap se puede hacer de estas dos formas:

    1 -> HashMap<String, String> familia = new HashMap<String, String>();
    2 -> HashMap familia = new HashMap();

    Métodos importantes de Hashmap

    * get (Object KEY) – Esto devolverá el valor asociado con una clave especificada en este hashmap de Java.
    * put (Object KEY, String VALUE) – Este método almacena el valor especificado y lo asocia con la clave especificada en este mapa.

    */

    public static void main(String[] args) {

        String os = "Windows";

        HashMap sistemaOperativo = new HashMap();
        sistemaOperativo.put("Apple", "iOS");
        sistemaOperativo.put("linux", "Devian");
        sistemaOperativo.put("Windows", "xp");
        sistemaOperativo.put("Google", "Android");

        Object checkOs = sistemaOperativo.get(os);
        System.out.println(checkOs);

        if(checkOs == "Android") {
            System.out.println("This is Android");
        } else {
            sistemaOperativo.remove(os);
            System.out.println("El sistema operativo fue eliminado del mapa");
        }
        System.out.println("La nueva lista es: + " + sistemaOperativo);
    }
}
