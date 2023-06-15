import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.printf("%d ", i);
//            ++i;
//        }

//        int count = 0;
//        do{
//            count += 2;
//            System.out.printf("%d%n", count);
//        }while(count < 100);

//        int count = 105;
//        do{
//            count -= 5;
//            System.out.printf("%d%n", count);
//        }while(count > -10);

//        int count = 2;
//        do{
//            System.out.printf("%d%n", count);
//            count = (int) Math.pow(count, 2);
//        } while(count < 1000000);

//        for (int i = 0; i <= 100; i++) {
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//                continue;
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        Scanner userInput = new Scanner(System.in);
//
//        System.out.print("Give me a number: ");
//        int number = userInput.nextInt();
//
//        System.out.printf("number | squared | cubed%n");
//        System.out.printf("------ | ------- | -----%n");
//        for (int i = 0; i <= number; i++) {
//            double square = Math.pow(i, 2);
//            double cubed = Math.pow(i, 3);
//            System.out.printf("%-7d| %-8.0f| %.0f%n", i, square, cubed);
//        }
//
//
//        do{
//            System.out.printf("Would you like to add another number?%n");
//            System.out.printf("Answer with Yes or No.%n");
//            System.out.print("Answer: ");
//            String answer = userInput.next();
//            if (answer.equals("No")) {
//                break;
//            } else {
//                System.out.print("Give me a number: ");
//                number = userInput.nextInt();
//                System.out.printf("number | squared | cubed%n");
//                System.out.printf("------ | ------- | -----%n");
//                for (int i = 0; i <= number; i++) {
//                    double square = Math.pow(i, 2);
//                    double cubed = Math.pow(i, 3);
//                    System.out.printf("%-7d| %-8.0f| %.0f%n", i, square, cubed);
//                }
//            }
//        } while(true);

        Scanner userInput = new Scanner(System.in);

        System.out.print("Give me a number between 0-100: ");
        int number = userInput.nextInt();

        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String f = "F";

        if(number >= 88){
            System.out.printf("Grade: %s%n", a);
        } else if(number >= 80){
            System.out.printf("Grade: %s%n", b);
        } else if(number >= 67){
            System.out.printf("Grade: %s%n", c);
        } else if(number >= 60){
            System.out.printf("Grade: %s%n", d);
        } else {
            System.out.printf("Grade: %s%n", f);
        }
        do{
            System.out.printf("Would you like to add another number?%n");
            System.out.printf("Answer with Yes or No.%n");
            System.out.print("Answer: ");
            String answer = userInput.next();
            if (answer.equals("No")) {
                break;
            } else {
                System.out.print("Give me a number: ");
                number = userInput.nextInt();

                if(number >= 88){
                    System.out.printf("Grade: %s%n", a);
                } else if(number >= 80){
                    System.out.printf("Grade: %s%n", b);
                } else if(number >= 67){
                    System.out.printf("Grade: %s%n", c);
                } else if(number >= 60){
                    System.out.printf("Grade: %s%n", d);
                } else {
                    System.out.printf("Grade: %s%n", f);
                }

            }
        } while(true);
    }
}
