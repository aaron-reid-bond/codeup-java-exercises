package util;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(){
        return scanner.nextLine();
    }
    public static boolean yesNo(){
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        int userNum = Integer.parseInt(getString());
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Integer not between bounds. Enter integer: ");
        return getInt(min, max,prompt);
    }
    public static int getInt(){
        while (true) {
            try {
                String input = getString();
                return Integer.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                return getInt();
            }
        }
    }
    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);

        double userNum = Double.parseDouble(getString());
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Double not between bounds. Enter a double: ");
        return getDouble(min, max,prompt);
    }

    public static double getDouble() {
        while (true) {
            try {
                String input = getString();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                return getDouble();
            }
        }
    }

}
