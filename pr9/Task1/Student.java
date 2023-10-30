package mirea.pr9.Task1;

public class Student implements Comparable<Student>{
    private int idNumber;
    private String name;

    public Student (int idNumber, String name){
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber(){
        return idNumber;
    }

    @Override
    public String toString(){
        return "student{" +name + "; idNumber = " + idNumber + "}";
    }

    @Override
    public int compareTo (Student other){
        return Integer.compare(this.idNumber, other.idNumber);
    }

}
