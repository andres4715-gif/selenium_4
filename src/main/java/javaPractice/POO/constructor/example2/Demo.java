package javaPractice.POO.constructor.example2;

public class Demo {

    int value1;
    int value2;
    int value3;

    public Demo(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public Demo(int value1, int value2, int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public int add() {
        int adding = this.value1 + this.value2;
        return adding;
    }

    public int substraction() {
        int subs = this.value1 - this.value2;
        return subs;
    }

    public int addMore() {
        int adding = this.value1 + this.value2 + this.value3;
        return adding;
    }

}
