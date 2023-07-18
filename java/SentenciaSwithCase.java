import java.util.Scanner;

public class SentenciaSwithCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes entre 1 - 12");
        int mes = s.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "abril";
                break;
            case 5:
                nombreMes = "mayo";
                break;
            case 6:
                nombreMes = "junio";
                break;
            case 7:
                nombreMes = "julio";
                break;
            case 8:
                nombreMes = "agosto";
                break;
            case 9:
                nombreMes = "septiembre";
                break;
            case 10:
                nombreMes = "octubre";
                break;
            case 11:
                nombreMes = "noviembre";
                break;
            case 12:
                nombreMes = "diciembre";
                break;
            default:
                nombreMes = "indefinido";

        }
        System.out.println("nombreMes = " + nombreMes);

        char num = 'a'; // # int , byte, integer, 'char'

        switch (num) {
            case '0':
                System.out.println("El num es cero");
                break;
            case '1':
                System.out.println("El num es uno");
                break;
            case '2':
                System.out.println("El num es dos");
                break;
            case '3':
                System.out.println("El num es tres");
                break;
            default:
                System.out.println("Numero o caracter desconocido");

        }
        String nombre = "Seylin";
        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case  "Jorge":
                System.out.println("Hola Jorge");
                break;
            case "Emma":
                System.out.println("Hola Emma");
                break;
            default:
                System.out.println("Usuario desconocido!");


        }

    }
}
