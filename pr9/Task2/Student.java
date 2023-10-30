package mirea.pr9.Task2;

public class Student {
    public int examScore;
    public String name;

    public Student (String name, int examScore){
        this.name = name;
        this.examScore = examScore;
    }

    public int getExamScore() {
        return examScore;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Student{" + name + ", res: " + examScore + "}";
    }
}
