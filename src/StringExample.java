import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        System.out.println("please insert your telegram " +
//                "username ?");
//        String username =  scan.nextLine();
//        System.out.println((username.contains("@"))?
//                "invalid username":"user accepted");
//
//

        System.out.println("please insert date of birth");
        int dob = scan.nextInt();
        int age  = 2023- dob;
        //(variable x = (expression) ?
        // value if true : value if false)
        String accountStatus =(age < 18 )?
            "underage cant create an account":
                "your account has been created";
//
//        System.out.println(accountStatus);
        System.out.println("please insert a number ?");
        int userInput = scan.nextInt();
        int randomNumber = (int)Math.round(Math.random()*10);
        System.out.println((userInput ==randomNumber
                ?"congrats":"try again"));
    }


}
