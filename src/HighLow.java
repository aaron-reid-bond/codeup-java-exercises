import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void game(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("lets play a game. guess a number between 1-100!");

        Random rand = new Random();
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);

        boolean again = true;

        while (again) {
            System.out.println("Whats your number:");
            int user = scanner.nextInt();

            if (user < int_random) {
                System.out.println("Nope, Higher!");
            } else if (user > int_random) {
                System.out.println("Nope, Lower!");
            } else if (user == int_random) {
                System.out.println("GOOD GUESS!");
                System.out.println("Thanks for playing!");
                again = false;
            }
        }
        System.out.println("Again?");
        scanner.nextLine();
        String gameAgain = scanner.nextLine();
        if (gameAgain.equalsIgnoreCase("yes")) {
            game();
        }
    }

    public static void main(String[] args) {
        game();
    }
}
