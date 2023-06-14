import java.util.Scanner;


public class ConsoleExercise {
    public static void main(String[] args) {

        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.", pi);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a sentence:");
//        String userInput1 = scanner.nextLine();
//        System.out.printf("%s", userInput1);

        Scanner area = new Scanner(System.in);

        System.out.print("What is the classroom Width: ");
        String userWidth = area.nextLine();
        System.out.print("What is the classroom Length: ");
        String userLength = area.nextLine();

        int width = Integer.parseInt(userWidth);
        int length = Integer.parseInt(userLength);

        int roomArea = width * length;
        int roomParem = (width + length) * 2;

        System.out.printf("The area of the classroom is %s%n", roomArea);
        System.out.printf("The perimeter of the classroom is %s", roomParem);
    }
}
