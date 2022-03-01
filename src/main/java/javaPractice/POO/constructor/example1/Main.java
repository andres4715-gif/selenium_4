package javaPractice.POO.constructor.example1;

public class Main {

    public static void main(String[] args) {
        Demo obj1 = new Demo();
        System.out.println(obj1.add());
        System.out.println(obj1.substraction());

        if(obj1.add() > 1) {
            System.out.println("This is good");
        } else {
            System.out.println("This is wrong");
        }
    }
}
