import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f", pi);
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("please enter an integer");
        int userInt = sc.nextInt();
        System.out.println(userInt);
        sc.nextLine();

        System.out.println("Enter 3 words");
        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        sc.nextLine();

        System.out.println("enter a sentence");
        String userSentence = sc.nextLine();
        System.out.println(userSentence);


        System.out.println("enter the length of classroom");
        int classroomLength = sc.nextInt();
//        double length = Double.parseDouble(classroomLength);
        System.out.println("enter the width of classroom");
        int classroomWidth = sc.nextInt();
//        int width = Double.parseDouble(classroomWidth);
        int area = classroomLength * classroomWidth;
        int perimeter = (classroomLength * 2) + (classroomWidth * 2);
        System.out.println("the class room is " +classroomLength+"x"+classroomWidth);
        System.out.println("the perimeter of the classroom is "+perimeter);
        System.out.println("the area of the classroom is "+area);





    }
}
