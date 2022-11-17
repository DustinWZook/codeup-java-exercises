package util;
import java.util.Scanner;
public class Input {

private static Scanner sc = new Scanner(System.in);

public static String getString(){
    return sc.nextLine();
}
public static String getString(String prompt){
    System.out.printf("%s%n", prompt);
    return sc.nextLine();
}

public static boolean yesNo(){
    String userInput = sc.nextLine();
    return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
}
public static boolean yesNo(String prompt){
    System.out.printf("%s%n",prompt);
    String userInput = sc.nextLine();
    return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
}

public static int getInt(){
    return Integer.parseInt(sc.nextLine());
}

public static int getInt(String prompt){
    System.out.printf("%s%n", prompt);
    return Integer.parseInt(sc.nextLine());
}
public static int getInt(int min, int max){
    System.out.printf("Enter a number between %d and %d: %n", min, max);
    int userInt = Integer.parseInt(sc.nextLine());
    if (userInt < min){
        System.out.println("The number is lower than the min.");
        return getInt(min,max);
    } else if (userInt > max) {
        System.out.println("The number is higher than the max");
        return getInt(min,max);
    }
    System.out.printf("Your number of %d is between %d and %d", userInt, min, max);
    return userInt;
}


    public static double getDouble(){
        return Double.parseDouble(sc.nextLine());
    }

    public static double getDouble(String prompt){
        System.out.printf("%s%n", prompt);
        return Double.parseDouble(sc.nextLine());
    }
    public static Double getDouble(double min, double max){
        System.out.printf("Enter a number between %f and %f: %n", min, max);
        double userDouble = Double.parseDouble(sc.nextLine());
        if (userDouble < min){
            System.out.println("The number is lower than the min.");
            return getDouble(min,max);
        } else if (userDouble > max) {
            System.out.println("The number is higher than the max");
            return getDouble(min,max);
        }
        System.out.printf("Your number of %f is between %f and %f", userDouble, min, max);
        return userDouble;
    }





}
