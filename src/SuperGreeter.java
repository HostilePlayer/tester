import java.util.Scanner;

public class SuperGreeter {

    static Scanner scanner = new Scanner(System.in);
    static String brugerNavn = "brugernavn";

    public void start(){

        System.out.println("Det virker!");
        //resultat
    }

    public  static void main(String[] args) {

        SuperGreeter greeter = new SuperGreeter();
        hejBruger();
        askAboutAge();
        greeter.start();
        //metoder
    }

    private static void askAboutAge() {
        System.out.println("Hvor gammel er du " + brugerNavn);
        int brugerAlder = scanner.nextInt();
        System.out.println("Så du er " + brugerAlder + " år gammel");
        //få aller

    }

    private static void hejBruger() {
        System.out.println("Hej bruger, hvad er dit navn?");
        String brugerNavn = scanner.next();
        System.out.println("Hej " + brugerNavn);
        //få brugerens navn
    }


}
