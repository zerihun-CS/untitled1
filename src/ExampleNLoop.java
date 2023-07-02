import java.util.Arrays;
import java.util.HashMap;

public class ExampleNLoop {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,5,2,5,6,7,9,5,12,15};

        int highestCountNumber=0;
        int highestCount=0;
        int  count = 0;


        HashMap<Integer, Integer> numbers_list = new HashMap<>();
        System.out.println(numbers_list);

//        {1,2,3,4,5,5,2,5,6,7,9,5,12,15};
        for (int i = 0; i < numbers.length ; i++) {
            count  = (numbers_list.containsKey(numbers[i]))?numbers_list.get(numbers[i]):0;
            numbers_list.put(numbers[i], ++count);

           if(highestCount < numbers_list.get(numbers[i])){
               highestCount = numbers_list.get(numbers[i]);
               highestCountNumber = numbers[i];
           }





        }
        System.out.println(highestCountNumber);


//        for (int i = 0; i < numbers.length; i++) {
////            {1,2,3,4,5,5,2,5,6,7,9,5};
//            count=0;
//            for (int j = 0; j < numbers.length; j++) {
//
//                if(numbers[i]== numbers[j])
//                    count+=1;
//            }
//
//            if(highestCount < count) {
//                highestCount = count;
//                highestCountNumber = numbers[i];
//            }
//
//
//        }
//
//
//        System.out.println("the highest Count number "+highestCountNumber);


    }

}
