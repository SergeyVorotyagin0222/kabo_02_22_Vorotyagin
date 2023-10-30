package mirea.pr9.Task1;

public class Main {
    public static void main(String[] args){
        Student[] students = new Student[]{
                new Student(4,"St2"),
                new Student(12,"st3"),
                new Student(19,"st4"),
                new Student(1,"st1")
        };
        System.out.println("DO SORTIROVKI>>");
        displayStudents(students);

        sorting(students);

        System.out.println("POSLE SORTIROVKI>>");
        displayStudents(students);

    }

    public static void displayStudents(Student[] students){
        for (Student student : students){
            System.out.println(student);
        }
    }

    public static void sorting(Student[] arr){
        for (int i = 1; i < arr.length; i++){
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
