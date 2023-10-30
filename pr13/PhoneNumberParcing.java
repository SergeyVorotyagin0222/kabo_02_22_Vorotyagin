package mirea.pr13;

import java.sql.SQLOutput;
import java.util.*;

public class PhoneNumberParcing  {
    private String code, city, n3, n4;

    public PhoneNumberParcing (String phone){
        if (phone.length() < 10 || phone.length() > 13){
            System.out.println("Wrong number");
            return;
        }
        if (phone.startsWith("+7")){
            code = "+7";
        } else if (phone.startsWith("8")){
            code = "+7";
        } else {
            code = phone.substring(0, 3);
        }

        city = phone.substring(phone.length() - 10, phone.length() - 7);
        n3 = phone.substring(phone.length()-7, phone.length() - 4);
        n4 = phone.substring(phone.length() - 4);
    }

    @Override
    public String toString(){
        return code + "-(" + city + ")-" + n3 + "-" + n4;
    }

    public static void main(String[] args){
        int number;
        System.out.println("Enter number of phones>> ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        for (int i = 0; i < number; i++){
            System.out.println("Phone number>>");
            System.out.println(new PhoneNumberParcing(scanner.next()));
        }
    }
}
