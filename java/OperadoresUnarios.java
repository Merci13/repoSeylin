public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;

        //j = (1)*i => -5
        int j = +i;
        System.out.println("j = " + j);

        //k = (-1)*i => 5
        int k = -i;
        System.out.println("k = " + k);

        i = 6;
        j = +i;
        System.out.println("j = " + j);

        k = -i;
        System.out.println("k = " + k);
    }

}
