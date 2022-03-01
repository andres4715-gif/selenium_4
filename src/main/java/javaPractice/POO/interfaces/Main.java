package javaPractice.POO.interfaces;

public class Main {

    public static void main(String[] args) {
        Mamifero a1 = new Mamifero();
        a1.nombreEspecie("Golden retriever");
        System.out.println(a1.continente("Colombia"));
    }
}
