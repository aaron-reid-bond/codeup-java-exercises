import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] arr, Person addPerson){
        Person[] arr1 = Arrays.copyOf(arr, arr.length+1);
        arr1[arr1.length-1] = addPerson;
        return arr1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        Person person1 = new Person("Abe");
        Person person2 = new Person("Kenny");
        Person person3 = new Person("Paul");

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

        for(Person person : people){
            System.out.println(person.getName());
        }

        Person[] newPeople = addPerson(people, new Person("Evia"));

        for (Person person: newPeople){
            System.out.println(person.getName());
        }
    }

}
