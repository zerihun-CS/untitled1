import java.util.Scanner;

public class Questions {

    public static void main(String[] args) {

//    Write a program to check if a number is even or odd.
//    Write a program to check if a number is a multiple of 2 and 3,
//    and also a multiple of 6.
//    Write a program to check if a number is positive, negative, or zero, div 2 , div 3 .
//   Write a program to check if a triangle is right-angled, acute-angled,
//   or obtuse-angled.

        Scanner scanner = new Scanner(System.in);


        System.out.println("insert a number ?");

        int number = scanner.nextInt();

    if(number > 0 ){
            //positive
            boolean fizz = (number % 3 ==0);
            boolean buzz = (number % 5 ==0);
            if (fizz && buzz)
                System.out.println("FIZZ BUZZ");
            else if( fizz)
                System.out.println("FIZZ");
            else if (buzz)
                System.out.println("BUZZ");
            else
                System.out.println("NULL");

        } else if (number < 0) {
            //negative

            boolean fizz = (number % 3 ==0);
            boolean buzz = (number % 5 ==0);
            if (fizz && buzz)
                System.out.println("BUZZ fizz");
            else if( fizz)
                System.out.println("buzz");
            else if (buzz)
                System.out.println("fizz");
            else
                System.out.println("NULL");
        }

        else{

            //zero
        }

    }
}