import java.util.Scanner;

public class SuperGreeter {

    static Scanner scanner = new Scanner(System.in);
    String brugerNavn = "brugernavn";

    public void start(){

        System.out.println("Det virker!");
    }

    public  static void main(String[] args) {

        SuperGreeter greeter = new SuperGreeter();
        hejBruger();
        greeter.start();
    }

    private static void hejBruger() {
        System.out.println("Hej bruger, hvad er dit navn?");
        String brugerNavn = scanner.next();
        System.out.println("hej " + brugerNavn);
    }

}
