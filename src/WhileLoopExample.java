import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("please insert user Name ?");
//        String name = scanner.next();
//        while(name.contains("@")){
//            System.out.println("please try again ");
//            name = scanner.next();
//
//        }
//        System.out.println("user name saved");



//        do {
//            System.out.println("please try again ");
//            name = scanner.next();
//
//        }while(name.contains("@"));
//        System.out.println("user name saved");


        ArrayList<String> usernames = new ArrayList<>();


        System.out.println("please insert user name ");

        String name = scanner.next();

        while (!name.equalsIgnoreCase("exits") ||!name.isBlank()   ){

            usernames.add(name);
            name = scanner.next();
        }






    }
}
