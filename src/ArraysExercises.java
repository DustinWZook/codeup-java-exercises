import java.util.Arrays;

public class ArraysExercises {

    public static void addPerson(Person[] array0, String person) {
        Person[] array1 = Arrays.copyOf(array0, array0.length + 1);
        array1[array1.length - 1] = new Person(person);
        for (Person name :
                array1) {
            System.out.println(Person.getName(name));
        }
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        Arrays.toString(numbers);
//        System.out.println(numbers);
        Person newPerson1 = new Person("dustin");
        Person newPerson2 = new Person("dakota");
        Person newPerson3 = new Person("chase");

        Person[] familyList = {newPerson1, newPerson2, newPerson3};
        addPerson(familyList, "victoria");


    }
}
