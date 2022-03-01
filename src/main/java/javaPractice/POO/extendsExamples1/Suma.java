package javaPractice.POO.extendsExamples1;

public class Suma {
    private static int totalSuma = 0;

    static int sumando(int num1, int num2) {
        totalSuma = num1 + num2;
        return totalSuma;
    }
}
