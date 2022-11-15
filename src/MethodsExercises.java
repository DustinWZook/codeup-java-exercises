import java.util.Scanner;

public class MethodsExercises {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(sum(2, 3));
        System.out.println(sub(7, 4));
        System.out.println(multiply(4, 2));
        System.out.println(divide(10, 3));
        System.out.println(divide(5, 0));

        getInteger(1, 10);
        System.out.println(userInput);

        factorial();
        rollDice();
    }

    public static int userInput;
    public static String userContinue;
    public static String userContinue2;
    public static long fact = 1;

    public static int sidesOfDice;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("enter a number between %d and %d: ", min, max);
            userInput = sc.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;
    }

    public static long factorial() {
        Scanner sc = new Scanner(System.in);
        do {
            fact = 1;
            getInteger(1, 10);
            for (int i = 1; i <= userInput; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + userInput + " is: " + fact);
            System.out.println("would you like to continue? y/n");
            userContinue = sc.nextLine();
            userContinue = userContinue.toLowerCase();
        } while (userContinue.equals("y"));
        return fact;
    }

    public static void rollDice() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the number of sides for pair of dice.");
            sidesOfDice = sc.nextInt();
            sc.nextLine();
            int roll1 = (int) (Math.random() * sidesOfDice) + 1;
            int roll2 = (int) (Math.random() * sidesOfDice) + 1;
            int sumOfDice = roll1 + roll2;
            System.out.println("roll 1: "+roll1);
            System.out.println("roll 2: "+roll2);
            System.out.println("The roll resulted: " + sumOfDice);
            System.out.println("would you like to continue? y/n");
            userContinue2 = sc.nextLine();
            userContinue2 = userContinue2.toLowerCase();
        }while (userContinue2.equals("y"));

    }

}
