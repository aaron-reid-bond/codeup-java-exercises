package util;

public class InputTest {
    public static void main(String[] args) {
        Input inputOne = new Input();
        System.out.println("Enter a String: ");

        System.out.println(Input.getString());

        System.out.println("Enter yes or no? ");

        System.out.println(Input.yesNo());

        System.out.println(inputOne.getInt(1, 25, "give me an number between 1-25"));

        System.out.println("Enter an integer");

        int i = Input.getInt();

        System.out.println("You entered: " + i);

        System.out.println(inputOne.getDouble(0, 1, "give me an number between 0-1"));

        System.out.print("Enter a double: ");

        double d = Input.getDouble();

        System.out.println("You entered: " + d);
    }
}
