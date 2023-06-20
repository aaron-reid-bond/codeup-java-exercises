import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static int addition(int x, int y){
        return x + y;
    }

    public static int subtraction(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static int divide(int x, int y){
        return x / y;
    }

    public static int mod(int x, int y){
        return x % y;
    }

    public static void getInteger(int min, int max){
        Scanner userNumber = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int number = userNumber.nextInt();
        if(number < max && number > min){
            System.out.printf("Thanks for playing here is your winning number %d.",number);
        } else {
            System.out.println("try again");
            getInteger(1,10);
        }
    }

    public static void factorial(int min, int max){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");

        int number;
        number = scanner.nextInt();

        if(number <= max && number >= min){
            int fact =1;

            for (int i = 1; i <= number; i++) {
                String test = "1";

                for (int j = 1; j < i; j++) {
                    test += " x " + j;
                }
                test += " x " + i;
                System.out.printf("%2d! =  %-45s  = %d%n",i , test, fact=fact*i);
            }

            do{
                System.out.printf("Would you like to add another number?%n");
                System.out.printf("Answer with Yes or No.%n");
                System.out.print("Answer: ");
                String answer = scanner.next().toLowerCase();
                if (answer.equals("no")) {
                    break;
                } else {
                    System.out.println("Give me a number: ");
                    number = scanner.nextInt();

                    for (int i = 1; i <= number; i++) {
                        String test = "1";

                        for (int j = 1; j < i; j++) {
                            test += " x " + j;
                        }
                        test += " x " + i;
                        System.out.printf("%2d! =  %-45s  = %d%n",i , test, fact=fact*i);
                    }
                }
            } while(true);
        } else {
            System.out.println("try again");
            factorial(1,10);
        }
    }

    public static void dice(){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int upperbound;

        System.out.println("Lets roll the dice. you get to choose the Die size!");
        System.out.print("How many sides would you like: ");
        upperbound = scanner.nextInt();

        int int_random = rand.nextInt(upperbound);
        System.out.printf("Roll... Bounce.... Stop... %d%n", int_random);

        do{
            System.out.printf("Roll again?%n");
            System.out.printf("Answer with Yes or No.%n");
            System.out.print("Answer: ");
            String answer = scanner.next().toLowerCase();
            if (answer.equals("no")) {
                break;
            } else {
                System.out.print("How many sides would you like: ");
                upperbound = scanner.nextInt();
                int int_random1 = rand.nextInt(upperbound);
                System.out.printf("Roll... Bounce.... Stop... %d%n", int_random1);
            }
        } while(true);
    }


    public static void main(String[] args) {
//        System.out.println(addition(5,2));
//        System.out.println(subtraction(5,2));
//        System.out.println(multiply(5,2));
//        System.out.println(divide(5,2));
//        System.out.println(mod(5,2));
//        getInteger(1,10);
//        factorial(1,10);
        dice();

    }
}
