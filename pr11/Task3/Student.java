package mirea.pr11.Task3;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Student{
    private Date birthDate;
    private String name;

    public Student(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }
    public String getName(){
        return name;
    }

    public Date getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getFormattedDate(String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(birthDate);
    }

    @Override
    public String toString(){
        return "Student{ name: " + name + ", birth date: " + birthDate + "}";
    }
}
