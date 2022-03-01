package javaPractice.POO.extendsExamples2;

public class MainHospital extends Surgeon {

    public static void main(String[] args) {

        Surgeon obj1 = new Surgeon();
        String nameDoctor = obj1.name("Andres Rios");
        int experienceDoctro = obj1.experience(7);
        System.out.println("El nombre del doctor es: " + nameDoctor);
        System.out.println("Los años de experiencia son: " + experienceDoctro);
    }
}
