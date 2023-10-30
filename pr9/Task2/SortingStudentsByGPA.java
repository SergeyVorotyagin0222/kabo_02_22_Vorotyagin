package mirea.pr9.Task2;

import java.util.List;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{

    @Override
    public int compare(Student Aa, Student aA){
        double gpa1 = Aa.getExamScore();
        double gpa2 = aA.getExamScore();
        return Double.compare(gpa2, gpa1);
    }

    public void quickSort(List<Student> students, int low, int high){
        if (low < high){
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }
    public int partition (List<Student> students, int low, int high){
        int i = low - 1;
        for (int j = low; j < high; j++){
            if (compare(students.get(j), students.get(high)) > 0){
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }
        Student temp = students.get(i+1);
        students.set(i+1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }
}
