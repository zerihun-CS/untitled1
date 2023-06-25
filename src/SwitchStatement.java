import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class SwitchStatement {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("please insert Grade");

        char grade =  scanner.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent ");
                break;
            case 'B':
                System.out.println("v.Good ");
                break;
            case 'C':
                System.out.println("passed");
                break;
            case 'D':
                System.out.println("Failed ");
                break;
            default:
                System.out.println("non ");
        }


    }
}
