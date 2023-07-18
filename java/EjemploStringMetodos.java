import com.sun.nio.sctp.HandlerResult;

import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Seylin";

        System.out.println("nombrelength() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"seylin\") = " + nombre.equals("seylin"));
        System.out.println("nombre.equalsIgnoreCase(seylin) = " + nombre.equalsIgnoreCase("seylin"));
        System.out.println("nombre.compareTo(\"Seylin\") = " + nombre.compareTo("Seylin"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1); = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(nombre.length() -2 ) = " + nombre.substring(nombre.length() -2 ));

        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace(\"a\",\".\") = " + trabalengua.replace("a","."));
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.indexOf('z') = " + trabalengua.indexOf('z'));
        System.out.println("trabalengua.indexOf('t') = " + trabalengua.indexOf("t"));
        System.out.println("trabalengua.contains('z') = " + trabalengua.contains("z"));
        System.out.println("trabalengua.indexOf('lenguas') = " + trabalengua.indexOf("lenguas"));
        System.out.println("trabalengua.contains('lenguas') = " + trabalengua.contains("lenguas"));
        System.out.println("trabalengua.startsWith(\"tr\") = " + trabalengua.startsWith("tr"));
        System.out.println("trabalengua.endsWith(\"as\") = " + trabalengua.endsWith("as"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());

    }
}
