package javaPractice.POO.CompleteExample2_extends;

public class StepDefinition extends Person {

    int weight;
    int height;

    public StepDefinition(String name, String lastName, int age, int weight, int height) {
        super(name, lastName, age);
        this.weight = weight;
        this.height = height;
    }

    String completeName() {
        return (this.getName() + " " + this.getLastName());
    }

    String checkingWeight() {
        if (this.weight < this.height - 100) {
            return "Esta bajo de peso";
        } else if (this.weight == this.height - 100) {
            return "Esta en el peso ideal";
        } else {
            return "Esta con sobre peso";
        }
    }

    String entraDiscoteca() {
        if (checkAge() == true) {
            return "Si puede ingresar!!!";
        } else {
            return "No pude ingresar!!!";
        }
    }

    private boolean checkAge() {
        if (this.getAge() >= 18) {
            return true;
        } else
            return false;
    }
}
