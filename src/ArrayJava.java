import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayJava {

    public static void main(String[] args) {

        String[]names = {"hanna","hailu","tom","abel","seni","alex"};
        String[][][] listFullNames = new String[2][3][2];

        System.out.println(listFullNames[0][0].length);
       System.arraycopy(names,3,listFullNames[0][2], 0, 2);
        System.out.println(Arrays.deepToString(listFullNames));


        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(3);
        listOfNumbers.add(4);
        listOfNumbers.add(5);
        listOfNumbers.add(6);
        listOfNumbers.add(1,56);
        System.out.println(listOfNumbers.get(0));


        HashMap<Integer, String> studentName = new HashMap<>();

        studentName.put(1,"hanna");
        studentName.replace(1,"abel");
        studentName.remove(2);
        studentName.keySet();



        System.out.println(studentName);















    }
}
