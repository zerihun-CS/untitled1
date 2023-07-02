public class CountVC {
    public static void main(String[] args) {
        char [] vowels = {'a','e', 'i', 'o', 'u'};
        int vowelsCount = 0;
        int consonantCount  = 0;
        String sentence1 = "good morning, how was sleep";
        for (int i = 0; i <sentence1.toCharArray().length ; i++) {

            if(sentence1.charAt(i) == 'a' ||
                    sentence1.charAt(i) == 'e' ||
                    sentence1.charAt(i) == 'i' ||
                    sentence1.charAt(i) == 'o' ||
                    sentence1.charAt(i) == 'u' ){
                vowelsCount+=1;
                System.out.println("this is a vowel "+sentence1.charAt(i)+" "+vowelsCount);

            } else if (sentence1.charAt(i) != ' ' ) {
                consonantCount += 1;
            }






        }





    }
}
