package mirea.pr9.Task2;

import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("st5", 240));
        students.add(new Student("st2", 90));
        students.add(new Student("st1", 12));
        students.add(new Student("st3", 199));
        students.add(new Student("st4", 235));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.size() - 1);

        for (Student student : students){
            System.out.println(student.getName() + ": " + student.getExamScore());
        }
    }
}
