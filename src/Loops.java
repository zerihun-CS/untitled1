public class Loops {

    public static void main(String[] args) {

        // for(initial exp;  (logic ); update expression){

        //}
        double[] listOfHeight = {1.75, 1.25, 1.5, 2, 0.1, 0.33,5,4};
        double longestPerson = listOfHeight[0];
        double secondLongestPerson = listOfHeight[0];
        double shortPerson = listOfHeight[0];
        for (int i = 0; i < listOfHeight.length; i++) {
            if (longestPerson < listOfHeight[i]) {
                secondLongestPerson = longestPerson;
                longestPerson = listOfHeight[i];
            } else if (secondLongestPerson < listOfHeight[i]) {
                secondLongestPerson = listOfHeight[i];
            }
        }
            System.out.println("the longest person "+longestPerson);
            System.out.println("the shortest person "+shortPerson);

        System.out.println("the second longest person "+secondLongestPerson);
    }

}



