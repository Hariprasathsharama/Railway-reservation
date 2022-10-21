package Controller;

public class PassengerInfoValidate {
    public String validname() {
        while (true) {
            name = s.next();
            String regex = "[a-zA-Z]+\\.?";
            if (name.matches(regex)) {
                return name;
            } else {
                System.out.println("Enter the valid username");
            }
        }

    }

    public String validgender() {
        System.out.println("Choose the given below");
        System.out.println("1) Male");
        System.out.println("2) Female");
        while (true) {
            byte option = 0;
            try {
                option = s.nextByte();
            } catch (InputMismatchException e) {

                System.out.println("Please enter numeric values");
                s.nextLine();
            }
            if (option == 1) {
                return "male";
            } else if (option == 2) {
                return "female";
            } else {
                System.out.println("----------------------");
                System.out.println("Enter the valid option");
                System.out.println("----------------------");

            }
        }

    }

    


}
