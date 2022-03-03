package javaPractice.POO.clasesAbtractas.example4;

public class Main {
    public static void main(String[] args) {

        System.out.println("***** WashingMachine =====");
        HomeAppliances obj1 = new WashingMachine(1, true, "LG", 8997);
        System.out.println("The wachingMmchine is connected: " + obj1.conected());
        System.out.println("The wachingMmchine is working: " + obj1.working());
        System.out.println("The wachingMmchine does: " + obj1.action());
        System.out.println("The wachingMmchine serial is: " + ((WashingMachine) obj1).serial("UIJHJHYU89876"));
        System.out.println("The wachingMmchine code is: " + ((WashingMachine) obj1).code("C0001"));
        System.out.println("The tradeMark is: " + ((WashingMachine) obj1).tradeMark);
        System.out.println("The model is: " + ((WashingMachine) obj1).model);
        System.out.println("This shows time: " + ((WashingMachine) obj1).showTime(1));

        System.out.println("***** Microware =====");
        obj1 = new Microware(1, false, "SAMSUNG", 8976);
        System.out.println("The Microware is connected: " + obj1.conected());
        System.out.println("The Microware is working: " + obj1.working());
        System.out.println("The Microware does: " + obj1.action());
        System.out.println("The Microware serial is: " + ((Microware) obj1).serial("S8987UY7"));
        System.out.println("The Microware code is: " + ((Microware) obj1).code("COOO99"));
        System.out.println("The tradeMark is: " + ((Microware) obj1).tradeMark);
        System.out.println("The model is: " + ((Microware) obj1).model);

        System.out.println("***** Stove =====");
        obj1 = new Stove(1, true, "HACEB", 11111);
        System.out.println("The Stove is connected: " + obj1.conected());
        System.out.println("The Stove is working: " + obj1.working());
        System.out.println("The Stove does: " + obj1.action());
        System.out.println("The Stove serial is: " + ((Stove) obj1).serial("TIOIKJK8"));
        System.out.println("The Stove code is: " + ((Stove) obj1).code("STOVE909IU8"));
        System.out.println("The tradeMark is: " + ((Stove) obj1).tradeMark);
        System.out.println("The model is: " + ((Stove) obj1).model);

        System.out.println("***** ElectricSweeper =====");
        obj1 = new ElectricSweeper(0, false, "XIAOMI", 2222);
        System.out.println("The ElectricSweeper is connected: " + obj1.conected());
        System.out.println("The ElectricSweeper is working: " + obj1.working());
        System.out.println("The ElectricSweeper does: " + obj1.action());
        System.out.println("The ElectricSweeper serial is: " + ((ElectricSweeper) obj1).serial("ST"));
        System.out.println("The ElectricSweeper code is: " + ((ElectricSweeper) obj1).code("Sweeper909IKK"));
        System.out.println("The tradeMark is: " + ((ElectricSweeper) obj1).tradeMark);
        System.out.println("The model is: " + ((ElectricSweeper) obj1).model);
    }
}
