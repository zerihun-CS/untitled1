public class ExampleLoop2 {

    public static void main(String[] args) {

        System.out.println("seni kebede".toCharArray().length);

        String [] listOfNames = {"hanna","abel","seni kebede",
                "yakob","zerihun"};

        int highestcount = 0;
        String name = null;

        for (int i = 0; i < listOfNames.length; i++) {

            if(highestcount < listOfNames[i].toCharArray().length){
                highestcount = listOfNames[i].toCharArray().length;
                name = listOfNames[i];
                System.out.println(listOfNames[i].toCharArray().length);
            }
        }

        System.out.println(name);



    }

}
