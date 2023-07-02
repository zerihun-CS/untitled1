import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please insert your a Number ?");

        int number =  scanner.nextInt();
        boolean fizz = (number % 3 ==0);
        boolean buzz = (number % 5 ==0);
        if (fizz && buzz) {
            System.out.println("FIZZ BUZZ");
            if(number%2==0){


            }
        }
        else if( fizz)
            System.out.println("FIZZ");
        else if (buzz)
            System.out.println("BUZZ");
        else
            System.out.println("NULL");




    }



}
