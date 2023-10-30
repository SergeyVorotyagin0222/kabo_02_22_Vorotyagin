package mirea.pr4;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        for (Seasons q : Seasons.values()){
            System.out.println(q + " " + q.getAvgTmp());
        }

        Seasons ex1 = Seasons.Autumn;
        Seasons ex2 = Seasons.Summer;
        if (ex1 == Seasons.Summer){
            System.out.println("I love summer");
        }
        else{
            System.out.println("Nope");
        }
        if (ex2 == Seasons.Summer){
            System.out.println("I love summer");
        }
        else{
            System.out.println("Nope");
        }

    }
}



