package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        Student dustin = new Student("Dustin");
        Student dakota = new Student("Dakota");
        Student chase = new Student("Chase");
        Student victoria = new Student("Victoria");

        dustin.addGrades(99);
        dustin.addGrades(92);
        dustin.addGrades(95);
        dustin.addGrades(93);

        dakota.addGrades(100);
        dakota.addGrades(99);
        dakota.addGrades(98);
        dakota.addGrades(97);

        chase.addGrades(90);
        chase.addGrades(92);
        chase.addGrades(94);
        chase.addGrades(96);

        victoria.addGrades(70);
        victoria.addGrades(80);
        victoria.addGrades(90);
        victoria.addGrades(100);

        students.put("dustin123", dustin);
        students.put("dakota123", dakota);
        students.put("chase123", chase);
        students.put("victoria123", victoria);

//        System.out.println(students.get("victoria123").getGradeAverage());

        String userInput;

        do {
            System.out.println("Here is a list of students to chose from.");
            for (String username: students.keySet()){
                System.out.printf("%s %n", username);
            }
            System.out.println("Enter a students username to get name and grade average.");
            String userSearch = sc.nextLine();
            if (students.get(userSearch) == null){
                System.out.println("user was not found");
            }else {
                System.out.println("users name is " + students.get(userSearch).getName());
                System.out.println("users grade average is "+ students.get(userSearch).getGradeAverage());
            }



            System.out.println("would you like to search again? Yes/No");
            userInput = sc.nextLine();

        }while (userInput.equalsIgnoreCase("yes"));
    }
}
