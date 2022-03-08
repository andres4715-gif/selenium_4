package javaPractice.POO.CompleteExample2_extends;

public class Main {

    public static void main(String[] args) {
        StepDefinition checking = new StepDefinition("Andres", "Rios", 23, 69, 170);
        System.out.println("Nombre completo: " + checking.completeName());
        System.out.println(checking.checkingWeight());
        System.out.println(checking.entraDiscoteca());
    }
}
