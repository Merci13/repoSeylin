import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Jorge";//String username = "Jorge";
        passwords[0] = "Amor"; //String password = "Amor";

        usernames[1] = "Seylin"; //String username2 = "Seylin";
        passwords[1] = "Amor";//String password2 = "Amor";

        usernames[2] = "Emma"; //String username2 = "Seylin";
        passwords[2] = "Amor";//String password2 = "Amor";*/

        String[] usernames = {"Jorge","Seylin", "Emma"};
        String[] passwords = {"Amor1", "Amor2", "Amor3"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println(" Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords [i].equals(p))? true: esAutenticado;

            /*if ((usernames[i].equals(u) && passwords[i].equals(p))) {
                esAutenticado = true;
                break;
            }*/ //else {
                //System.out.println("Username o password incorrecto!");
            //}
        }
String mensaje = esAutenticado ? "Bienvenido usuario".concat(u).concat("!"):
        "Username o contrasena incorrecto!\nLo sentimos, requiere autenticacion";
        System.out.println("mensaje = " + mensaje);

        /*if( (username.equals(u) && password.equals(p)) ||
                (username2.equals(u) && password2.equals(p))){
            esAutenticado = true;
        } else {
            System.out.println("Username o password incorrecto!");
        }*/

            if(esAutenticado){
                System.out.println("Bienvenido ususario ".concat(u).concat("!"));
            } else {
                System.out.println("Username o password incorrecto!");
                System.out.println("Lo siento, requiere autentificacion");
            }

        }
    }
