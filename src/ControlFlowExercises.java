import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i =5;
//        while (i <= 15){
//
//            System.out.println(i);
//            i++;
//        }
//        int num = 100;
//        do {
//            System.out.println(num);
//            num -= 5;
//        }while (num >= -10);

//        long squared = 2;
//        do {
//            System.out.println(squared);
//            squared = squared * squared;
//        }while (squared < 1000000);

        for (int i = 100; i >= -10; i = i - 5) {
            System.out.println(i);
        }

        for (long i = 2; i < 1000000; i *= i) {
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
                continue;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            } else {
                System.out.println(i);
            }
        }

        String userAnswer;

        do {
            System.out.println("what number would you like to go up to?");
            int userInt = sc.nextInt();
            sc.nextLine();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            int num = 1;

            for (num = 1; num <= userInt; num++) {
                int userIntSquared = num * num;
                int userIntCubed = num * num * num;
                if (userIntSquared < 10) {
                    System.out.println(num + "      |" + userIntSquared + "        |" + userIntCubed);
                } else if (userIntSquared >= 10 && userIntSquared < 100) {
                    System.out.println(num + "      |" + userIntSquared + "       |" + userIntCubed);
                } else if (userIntSquared >= 100) {
                    System.out.println(num + "     |" + userIntSquared + "      |" + userIntCubed);
                }
            }
            System.out.println("Would you like to enter a new number? yes/no");
            userAnswer = sc.nextLine();
            userAnswer = userAnswer.toLowerCase();

        } while (userAnswer.equals("yes"));

        String userContinue;
        do {
        String gradeCorrect;
        int userGrade;
        do {
            System.out.println("enter a numerical grade from 0 - 100");
            userGrade = sc.nextInt();
            sc.nextLine();
            System.out.println("The grade you entered is " + userGrade + ", is that correct? yes/no");
            gradeCorrect = sc.nextLine();
            gradeCorrect = gradeCorrect.toLowerCase();
        } while (gradeCorrect.equals("no"));

        if (userGrade <= 100 && userGrade >= 88) {
            if (userGrade >= 99 && userGrade <= 100) {
                System.out.println("user grade is A+");
            }else if (userGrade >= 88 && userGrade <= 89){
                System.out.println("user grade is A-");
            }else {
                System.out.println("the grade is A");
            }
        }

        if (userGrade <= 87 && userGrade >= 80) {
            if (userGrade <= 87 && userGrade >= 86) {
                System.out.println("user grade is B+");
            }else if(userGrade >= 80 && userGrade <= 81) {
                System.out.println("the grade is B-");
            }else{
                System.out.println("the grade is B");
            }
        }

        if (userGrade <= 79 && userGrade >= 67) {
            if (userGrade <= 79 && userGrade >= 78) {
                System.out.println("user grade is C+");
            }else if(userGrade >= 67 && userGrade <= 68) {
                System.out.println("the grade is C-");
            }else{
                System.out.println("the grade is C");
            }
        }

        if (userGrade <= 66 && userGrade >= 60) {
            if (userGrade <= 66 && userGrade >= 65) {
                System.out.println("user grade is D+");
            }else if(userGrade >= 60 && userGrade <= 61) {
                System.out.println("the grade is D-");
            }else{
                System.out.println("the grade is D");
            }
        }

        if (userGrade <= 59){
            System.out.println("the grade is F");
        }

        System.out.println("would you like to enter another numerical grade? yes/no");
        userContinue = sc.nextLine();
        userContinue = userContinue.toLowerCase();
        } while(userContinue.equals("yes"));



    }
}
