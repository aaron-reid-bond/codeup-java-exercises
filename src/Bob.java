import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sup my name is Bob! - respond with stop to stop program");

        while (true) {
            String user = scanner.nextLine().trim();

            if (user.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (user.endsWith("?")) {
                System.out.println("Sure.");
            } else if (user.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever.");
            }

            if (user.equalsIgnoreCase("stop")) {
                break;
            }
        }
    }
}