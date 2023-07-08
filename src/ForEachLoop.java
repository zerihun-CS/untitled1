import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {
String [] names_list =  {"hanna","beki","alex","samri","ana","dav"};

        int index= 0;
        for (String name:names_list) {
            names_list[index] =name.toUpperCase();
          index++;

        }

        System.out.println(Arrays.toString(names_list));
    }
}
