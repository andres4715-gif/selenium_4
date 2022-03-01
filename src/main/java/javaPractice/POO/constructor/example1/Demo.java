package javaPractice.POO.constructor.example1;

public class Demo {

    int value1;
    int value2;

    public Demo() {
        value1 = 5;
        value2 = 2;
    }

    public int add() {
        int adding = value1 + value2;
        return adding;
    }

    public int substraction() {
        int subs = value1 - value2;
        return subs;
    }
}
