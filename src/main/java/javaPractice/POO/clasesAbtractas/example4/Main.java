package javaPractice.POO.clasesAbtractas.example4;

public class Main {
    public static void main(String[] args) {

        System.out.println("***** WashingMachine =====");
        WashingMachine obj1 = new WashingMachine(1, true, "LG", 8997);
        System.out.println("The wachingMmchine is conected: " + obj1.conected());
        System.out.println("The wachingMmchine is working: " + obj1.working());
        System.out.println("The wachingMmchine does: " + obj1.action());
        System.out.println("The wachingMmchine serial is: " + obj1.serial("UIJHJHYU89876"));
        System.out.println("The wachingMmchine code is: " + obj1.code("C0001"));

        System.out.println("***** Microware =====");
        Microware obj2 = new Microware(1, false, "SAMSUNG", 8976);
        System.out.println("The Microware is conected: " + obj2.conected());
        System.out.println("The Microware is working: " + obj2.working());
        System.out.println("The Microware does: " + obj2.action());
        System.out.println("The Microware serial is: " + obj2.serial("S8987UY7"));
        System.out.println("The Microware code is: " + obj2.code("COOO99"));

        System.out.println("***** Stove =====");
        Stove obj3 = new Stove(1, true, "HACEB", 11111);
        System.out.println("The Stove is conected: " + obj3.conected());
        System.out.println("The Stove is working: " + obj3.working());
        System.out.println("The Stove does: " + obj3.action());
        System.out.println("The Stove serial is: " + obj3.serial("TIOIKJK8"));
        System.out.println("The Stove code is: " + obj3.code("STOVE909IU8"));

        System.out.println("***** ElectricSweeper =====");
        ElectricSweeper obj4 = new ElectricSweeper(0, false, "XIOMI", 2222);
        System.out.println("The ElectricSweeper is conected: " + obj4.conected());
        System.out.println("The ElectricSweeper is working: " + obj4.working());
        System.out.println("The ElectricSweeper does: " + obj4.action());
        System.out.println("The ElectricSweeper serial is: " + obj4.serial("ST"));
        System.out.println("The ElectricSweeper code is: " + obj4.code("Sweeper909IKK"));
    }
}
