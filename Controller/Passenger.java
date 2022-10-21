package Controller;

import java.util.Scanner;

public class Passenger {
    PassengerInfoValidate validate=new PassengerInfoValidate();
    Scanner input=new Scanner(System.in);
    public void register(){
        System.out.println("Enter the name");
        String name=validate.validname();
        System.out.println("Enter the age");
        int age=validate.validgender();
        System.out.println("Choose the train");
        

    }
}
