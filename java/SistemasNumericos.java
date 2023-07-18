import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        // Entradas de datos
        String numeroStr = JOptionPane.showInputDialog( null, "Ingrese un numero entero" );

       // cuando no es un #; manejo de errores
        int numeroDecimal= 0;
        try{
            numeroDecimal= Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        //int numeroDecimal= Integer.parseInt(numeroStr);
        System.out.println("numeroDecimal = " + numeroDecimal);

        // Sistemas numericos

        //int numeroDecimal= 500;
        //System.out.println("numeroDecimal = " + numeroDecimal);

        //System.out.println("numero binario de " + numeroDecimal + "=" + Integer.toBinaryString(numeroDecimal));
        String resultadoBinario= "numero binario de " + numeroDecimal + "=" + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario= 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        //System.out.println("numero Octal de = " + numeroDecimal + "=" +Integer.toOctalString(numeroDecimal));
        String resultadoOctal= "numero Octal de = " + numeroDecimal + "=" +Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal= 036;
        System.out.println("numeroOctal = " + numeroOctal);

        //System.out.println("numero hexadecimal= " + numeroOctal+ "="+Integer.toHexString(numeroDecimal));
        String resultadoHex= "numero hexadecimal= " + numeroDecimal+ "="+Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        int numeroHex= 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        // Entradas de datos
        //String mensaje= "numero binario de " + numeroDecimal + "=" + Integer.toBinaryString(numeroDecimal);
        String mensaje= resultadoBinario;
        //mensaje += "\nnumero octal de = " + numeroDecimal + "=" + Integer.toOctalString(numeroDecimal);
        mensaje += "\n" + resultadoOctal;
        //mensaje += "\nnumero hexadecimal= " + numeroOctal + "="+Integer.toHexString(numeroDecimal);
        mensaje += "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
