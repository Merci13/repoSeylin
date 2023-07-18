public class PrimitivosCaracteres {
    public static void main(String[] args) {
        // letra y numero #1
        var caracter = '\u0040';//'A', '0'=@ //char
        var decimal= 64; // char
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + caracter);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo= '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio= ' ';
        char retroceso= '\b';
        char tabulacion= '\t';
        char nuevaLinea= '\n';
        char retornoCarro= '\r';

        System.out.println("char corresponde en byte:" + System.lineSeparator()+ Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);

    }
}
