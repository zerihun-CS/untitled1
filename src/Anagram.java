public class Anagram {

    public static void main(String[] args) {

        String name ="XZANNAZXY";
        String name2  = "";

        System.out.println(name.length());
        for (int i = name.length()-1; i >= 0; i--) {

            name2+=name.charAt(i);

        }
      if(name.equalsIgnoreCase(name2)){
          System.out.println("is anagram ");
      }
    }


}
