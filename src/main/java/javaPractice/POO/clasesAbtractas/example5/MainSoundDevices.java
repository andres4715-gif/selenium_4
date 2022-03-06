package javaPractice.POO.clasesAbtractas.example5;

public class MainSoundDevices {

    public static void main(String[] args) {
        Microphone singer = new Microphone("black", "steel", 3, true, false, 30, "Bluetooth", "sound", "lG", 7000);
        Microphone backupSinger = new Microphone("black", "Pastic", 1, true, false, 10, "Wi fi", "sound", "HTC", 10000);
        headphones djHeadphones = new headphones("Red", "iron", 1, true, false, 70, "Bluetooth", "sound", "Bosse", 201);
        headphones soundEngineer = new headphones("White", "Aluminum", 1, true, true, 60, "Bluetooth", "sound", "beets", 302);

        boolean singerCheckTurnOnMicrophone = singer.turnOn(90);
        boolean backupSingerCheckTurnOnMicrophone = backupSinger.turnOn(20);
        String checkTheDjOwnerHeadphones = djHeadphones.owner("DJ");
        String checkTheEngeneerOwnerHeadphones = soundEngineer.owner("Production");

        System.out.println("Is it possible to use the singer microphone?: " + singerCheckTurnOnMicrophone);
        System.out.println("Is it possible to use the singer backup microphone?: " + backupSingerCheckTurnOnMicrophone);
        System.out.println("The DJ owner Headphones is?: " + checkTheDjOwnerHeadphones);
        System.out.println("The Engineer owner Headphones is?: " + checkTheEngeneerOwnerHeadphones);
    }
}
