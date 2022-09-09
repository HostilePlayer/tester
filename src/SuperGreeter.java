import java.util.Scanner;

public class SuperGreeter {

    //bliver dette pushed til Git hub
    //hvad med nu?

    static Scanner scanner = new Scanner(System.in);
    static String brugerNavn = "brugernavn";
    static String klasse = "klasse";

    public void start(){

        System.out.println("Det virker!");
        //resultat
    }

    public  static void main(String[] args) {

        SuperGreeter greeter = new SuperGreeter();
        hejBruger();
        askAboutAge();
        setClass();
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

    public static void setClass(){
        System.out.println("Hej ," + brugerNavn + " hvad er dit navn?");
        String klasse = scanner.next();
        System.out.println("så du er en " + klasse);
    }

}
