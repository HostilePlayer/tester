import java.util.Scanner;

public class SuperGreeter {

    static Scanner scanner = new Scanner(System.in);
    static String brugerNavn = "brugernavn";

    public void start(){

        System.out.println("Det virker!");
    }

    public  static void main(String[] args) {

        SuperGreeter greeter = new SuperGreeter();
        hejBruger();
        askAboutAge();
        greeter.start();
    }

    private static void askAboutAge() {
        System.out.println("hvor gammel er du " + brugerNavn);
        int brugerAlder = scanner.nextInt();
        System.out.println("så du er " + brugerAlder + " år gammel");

    }

    private static void hejBruger() {
        System.out.println("Hej bruger, hvad er dit navn?");
        String brugerNavn = scanner.next();
        System.out.println("hej " + brugerNavn);

    }

}
