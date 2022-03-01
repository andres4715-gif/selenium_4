package javaPractice.POO.constructor.example2;

public class Main {

    public static void main(String[] args) {
        Demo obj1 = new Demo(20, 5);
        Demo obj2 = new Demo(20, 5, 5);
        System.out.println(obj1.add());
        System.out.println(obj1.substraction());

        System.out.println("This is the second: " + obj2.addMore());

        if(obj1.add() > 1) {
            System.out.println("This is good");
        } else {
            System.out.println("This is wrong");
        }
    }
}
