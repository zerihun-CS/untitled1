public class NestedForLoop {

    public static void main(String[] args) {



        for (int i = 1; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }




        for (int i = 1; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }



        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }


    }
}
