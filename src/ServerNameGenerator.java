import java.util.Random;

public class ServerNameGenerator {
    static String[] svr1 = {"Charming","Cruel","Fantastic","Gentle","Huge","Perfect","Rough","Sharp","Tasty","Zealous"};
    static String[] svr2 = {"Park","Country","Person","Cat","Day","Company","City","Dog","State","Night"};

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static void main(String[] args) {
        System.out.printf("Here is your server name:%n%s-%s", getRandom(svr1), getRandom(svr2));
    }
}
