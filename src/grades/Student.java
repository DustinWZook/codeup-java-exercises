package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> studentGrades;
    public double sum = 0;

    public Student(String name){
        this.studentName = name;
        this.studentGrades = new ArrayList<>();
    }

    public String getName(){
        return this.studentName;
    }

    public void addGrades(int grade){
        this.studentGrades.add(grade);
    }

    public double getGradeAverage(){
        for (int grade : studentGrades){
            sum = sum + grade;
        }
        return sum /studentGrades.size();
    }


    public static void main(String[] args) {
        Student student1 = new Student("Student 1");
        Student student2 = new Student("Student 2");

        student1.addGrades(99);
        student1.addGrades(92);
        student1.addGrades(89);
        student1.addGrades(95);

        student2.addGrades(89);
        student2.addGrades(83);
        student2.addGrades(84);
        student2.addGrades(95);
        student2.addGrades(99);

        System.out.println(student1.getGradeAverage());
        System.out.println(student2.getGradeAverage());

    }
}
