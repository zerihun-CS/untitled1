import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapsJava {

    public static void main(String[] args) {

        HashMap<Integer, String[]> studentsNameList = new HashMap<>();

        String[] arr1 = {"hanna", "abel"};

        String[] arr2 = {"dev", "samri"};

        studentsNameList.put(1, arr1);
        studentsNameList.put(2, arr2);


        for (int key : studentsNameList.keySet())

            System.out.println(key);

        for (String[] value : studentsNameList.values())
            System.out.println(Arrays.toString(value));


        String sentence = "hello how are you am fine";
        HashMap<Character, Integer> store  = new HashMap<>();
        int consonant= 0;
        int vowel  = 0;

        for(char character:sentence.toCharArray()){


            if(character == 'a' || character == 'e'||
                    character == 'i'|| character == 'o'|| character == 'u'){
                vowel++;

            } else if (character != ' ') {
                consonant++;
            }

            if(store.containsKey(character)){
                int count = store.get(character);
                store.put(character,++count);
            }
            else {
                store.put(character,1);
            }

        }

        System.out.println(store);

        System.out.println(vowel);

        System.out.println(consonant);


        Scanner scanner = new Scanner(System.in);

        //1 2  2 2  2 3  2 4


        System.out.println("please insert a num");

        int n = scanner.nextInt();
        double sum=0;
        for (int i = 1; i <= n; i++) {

            sum  = sum + (Math.pow(i, 2));

        }


    }

}
