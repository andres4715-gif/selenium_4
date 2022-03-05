package javaPractice.POO.clasesAbtractas.example5;

public class MainSoundDevices {

    public static void main(String[] args) {
        Microphone singer = new Microphone("black", "steel", 3, true, false, 30, "Bluetooth", "sound", "lG", 7000);
        Microphone backupSinger = new Microphone("black", "Pastic", 1, true, false, 10, "Wi fi", "sound", "HTC", 10000);

        boolean singerCheckTurnOnMicrophone = singer.turnOn(90);
        boolean backupSingerCheckTurnOnMicrophone = backupSinger.turnOn(20);

        System.out.println("Is it possible to use the singer microphone?: " + singerCheckTurnOnMicrophone);
        System.out.println("Is it possible to use the singer backup microphone?: " + backupSingerCheckTurnOnMicrophone);
    }
}
